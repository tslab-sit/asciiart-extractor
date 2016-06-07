package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class KskipNgramCounterTest {

	@Test
	public void ひとつのKskipNgramの正規表現を生成する() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		ngrams.add("abc");
		int kSkip = 2;
		KskipNgramCounter counter = new KskipNgramCounter(ngrams, kSkip);

		String actual = counter.insertKskipRex(ngrams.get(0), kSkip);
		String expected = "\\Qあ\\E.{0,2}\\Qい\\E.{0,2}\\Qう\\E";
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 複数のKskipNgramの正規表現を生成する() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		ngrams.add("abc");
		int kSkip = 2;
		KskipNgramCounter counter = new KskipNgramCounter(ngrams, kSkip);

		String actual = counter.pattern.pattern();
		String expected = "\\Qあ\\E.{0,2}\\Qい\\E.{0,2}\\Qう\\E|\\Qa\\E.{0,2}\\Qb\\E.{0,2}\\Qc\\E";
		assertThat(actual, is(expected));
	}

	@Test
	public void KskipNgramを数える() {
		List<String> ngrams = new ArrayList<>();
		ngrams.add("あいう");
		ngrams.add("abc");
		int kSkip = 2;
		KskipNgramCounter counter = new KskipNgramCounter(ngrams, kSkip);

		int actual = counter.count("abXcあXいXXうあXXXいう");
		int expected = 2;
		assertThat(actual, is(expected));
	}

}
