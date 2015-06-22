package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NgramCounter {
	Pattern pattern;
	// http://qiita.com/sifue/items/039846cf8415efdc5c92
	private static String convertToUnicode(String original)
	{
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < original.length(); i++) {
	        sb.append(String.format("\\u%04X", Character.codePointAt(original, i)));
	    }
	    return sb.toString();
	}

	private void init(List<String> keywords) {
		List<String> unicodeKeywords = keywords.stream().map(k->convertToUnicode(k)).collect(Collectors.toList());
		String rex = String.join("|", unicodeKeywords);
		this.pattern = Pattern.compile(rex);
	}

	public NgramCounter(BufferedReader br) throws IOException {
		ArrayList<String> ngrams = new ArrayList<String>();
		String line;
		while((line = br.readLine())!=null){
			ngrams.add(line);
		}
		br.close();
		init(ngrams);
	}

	public NgramCounter(List<String> ngrams) {
		init(ngrams);
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
