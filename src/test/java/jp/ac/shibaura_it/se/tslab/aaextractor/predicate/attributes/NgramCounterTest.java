package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NgramCounterTest {

	@Test
	public void ひとつのNgramの正規表現を生成する() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		NgramCounter counter = new NgramCounter(ngrams);

		String actual = counter.pattern.toString();
		String expected = "\\Qあいう\\E";
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 複数のNgramの正規表現を生成する() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		ngrams.add("abc");
		NgramCounter counter = new NgramCounter(ngrams);

		String actual = counter.pattern.toString();
		String expected = "\\Qあいう\\E|\\Qabc\\E";
		assertThat(actual, is(expected));
	}

	@Test
	public void Ngramを数える() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		ngrams.add("abc");
		NgramCounter counter = new NgramCounter(ngrams);

		int actual = counter.count("abcあいうあXXabcX");
		int expected = 3;
		assertThat(actual, is(expected));
	}

}

