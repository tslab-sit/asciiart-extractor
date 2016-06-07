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

	private void init(List<String> keywords) {
		String rex = keywords.stream().map(k->Pattern.quote(k)).collect(Collectors.joining("|"));
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
