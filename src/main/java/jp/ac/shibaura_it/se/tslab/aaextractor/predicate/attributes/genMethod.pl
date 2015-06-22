use strict;
use utf8;

my $CLASSNAME = "EastAsianWidth";
my @comments = ();
my @defaultW = ([0x3400, 0x4DBF], [0x4E00, 0x9FFF], [0xF900, 0xFAFF], [0x20000, 0x2A6DF],
		[0x2A700, 0x2B73F], [0x2B740, 0x2B81F], [0x2F800, 0x2FA1F], [0x20000, 0x2FFFD],
		[0x30000, 0x3FFFD]);
my $missing;
my @triple = ();
open(EAW, "EastAsianWidth.txt") || die $!;
while(my $line = <EAW>) {
    chomp $line;
    if ($line =~ /^# \@missing: ([0-9A-Z]+)\.\.([0-9A-Z]+);\s+(N|A|H|W|F|Na)/) {
	$missing = [hex($1), hex($2), $3];
    }
    if ($line =~ /^#/) {
#	push(@comments, $line);
    } elsif ($line =~ /^([0-9A-Z]+);(N|A|H|W|F|Na)/) {
	my $start = hex($1);
	my $kind = $2;
	push(@triple, [$start, $start, $kind]);
    } elsif ($line =~ /^([0-9A-Z]+)\.\.([0-9A-Z]+);(N|A|H|W|F|Na)/) {
	my $start = hex($1);
	my $end = hex($2);
	my $kind = $3;
	push(@triple, [$start, $end, $kind]);
    }
}
close(EAW);

#
# merge condition
#
 my @mergedTriple = ();
 my $p = shift(@triple);
 while(1) {
     if (@triple == 0) {
 	push(@mergedTriple, $p);
 	last;
     }
     if ($p->[1]+1 == $triple[0]->[0] && $p->[2] eq $triple[0]->[2]) {
 	$p->[1] = $triple[0]->[1];
	shift(@triple);
     } else {
 	push(@mergedTriple, $p);
 	$p = shift(@triple);
     }
 }

#
# generate Java code
#

#my @result = @triple; # not merged
my @result = @mergedTriple;
printf "/**\n";
printf " * This method returns a category of character widths.\n";
printf " * The categories are based on %s\n", "http://www.unicode.org/Public/7.0.0/ucd/EastAsianWidth.txt";
printf " * \@param codePoint\n";
printf " * \@return a category of character widths: %s.N, %s.A, %s.H, %s.W, %s.W, %s.F or %s.Na.\n",
    $CLASSNAME, $CLASSNAME, $CLASSNAME, $CLASSNAME, $CLASSNAME, $CLASSNAME, $CLASSNAME;
printf " **/\n";
print "public int getKind(int codePoint) {\n";
foreach my $i (@comments) {
    printf "// %s\n", $i;
}
foreach my $p (@result) {
    my $start = $p->[0];
    my $end = $p->[1];
    my $kind = $p->[2];
    if ($start == $end) {
	printf "if (codePoint == 0x%x) { return %s; }\n", $start, $CLASSNAME.".".$kind;
    } else {
	printf "if (codePoint >= 0x%x && codePoint <= 0x%x) { return %s; }\n", $start, $end, $CLASSNAME.".".$kind;
    }
}

printf "// missing\n";
printf "if (codePoint >= 0x%x && codePoint <= 0x%x) { return %s; }\n", 
    $missing->[0], $missing->[1], $CLASSNAME.".".$missing->[2];

printf "// default W\n";
foreach my $p (@defaultW) {
    printf "if (codePoint >= 0x%x && codePoint <= 0x%x) { return %s; }\n", 
    $p->[0], $p->[1], $CLASSNAME.".W";
}
printf "// default N\n";
printf "return %s;\n", $CLASSNAME.".N";

print "}\n";
