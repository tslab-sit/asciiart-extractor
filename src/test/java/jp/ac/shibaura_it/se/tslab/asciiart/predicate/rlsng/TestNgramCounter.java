package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rlsng;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.NgramCounter;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class TestNgramCounter {

	@Test
	public void test() {
		List<String> ngrams = Arrays.asList("abc", "123", "あいう");
		String str = "abcdef123456あいうえお";
		NgramCounter counter = new NgramCounter(ngrams);
		assertThat(counter.count(str), is(3));
	}

}
