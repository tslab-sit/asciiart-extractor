package jp.ac.shibaura_it.se.tslab.asciiart.predicate;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.EastAsianWidth;

import org.junit.Test;

public class TestEastAsianWidth {
	String testString = "aあ森b";

	@Test
	public void 一文字目_a_はHalfWidth() {
		assertThat(EastAsianWidth.isHalfWidth(testString.codePointAt(0)), is(true));
	}

	@Test
	public void 一文字目_a_はFullWidthではない() {
		assertThat(EastAsianWidth.isFullWidth(testString.codePointAt(0)), is(false));
	}

	@Test
	public void 二文字目_あ_はHalfWidthではない() {
		assertThat(EastAsianWidth.isHalfWidth(testString.codePointAt(1)), is(false));
	}

	@Test
	public void 二文字目_あ_はFullWidth() {
		assertThat(EastAsianWidth.isFullWidth(testString.codePointAt(1)), is(true));
	}

	@Test
	public void 三文字目_森_はHalfWidthではない() {
		assertThat(EastAsianWidth.isHalfWidth(testString.codePointAt(2)), is(false));
	}

	@Test
	public void 三文字目_森_はFullWidth() {
		assertThat(EastAsianWidth.isFullWidth(testString.codePointAt(2)), is(true));
	}

	@Test
	public void 四文字目_b_はHalfWidth() {
		assertThat(EastAsianWidth.isHalfWidth(testString.codePointAt(3)), is(true));
	}

	@Test
	public void 四文字目_b_はFullWidthではない() {
		assertThat(EastAsianWidth.isFullWidth(testString.codePointAt(3)), is(false));
	}
}
