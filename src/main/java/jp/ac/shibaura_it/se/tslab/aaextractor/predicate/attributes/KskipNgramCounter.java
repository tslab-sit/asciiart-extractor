package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class KskipNgramCounter {
	Pattern pattern;
	String insertKskipRex(String ngram, int skip) {
		String delim = ".{0," + skip + "}"; // 任意の一文字が０個以上、skip以下
		return Arrays.stream(ngram.split("")).map(k->Pattern.quote(k)).collect(Collectors.joining(delim));
	}

	void setPattern(List<String> ngrams, int skip) {
		String rex = ngrams.stream().map(k->insertKskipRex(k, skip)).collect(Collectors.joining("|"));
		this.pattern = Pattern.compile(rex);
	}

	public KskipNgramCounter(BufferedReader br, int skip) throws IOException {
		ArrayList<String> ngrams = new ArrayList<String>();
		String line;
		while((line = br.readLine())!=null){
			ngrams.add(line);
		}
		br.close();
		setPattern(ngrams, skip);
	}

	public KskipNgramCounter(List<String> ngrams, int skip) {
		setPattern(ngrams, skip);
	}
	
	public int count(String str) {
		int count=0;
		Matcher m = this.pattern.matcher(str);
		while(m.find()) {
			count++;
		}
		return count;
	}
}
