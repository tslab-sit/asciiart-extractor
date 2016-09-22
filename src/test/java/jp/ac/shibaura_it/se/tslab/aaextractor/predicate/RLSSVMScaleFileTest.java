package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.SVMScaleFile;

public class RLSSVMScaleFileTest {

	@Test
	public void 正しいAttrIndexMinMaxLineに真を返す() {
		SVMScaleFile scaleFile = new SVMScaleFile();
		String line = "1 -2 3.1";
		boolean actual = scaleFile.isValidAttrIndexMinMaxLine(line);
		boolean expected = true;

		assertThat(actual, is(expected));
	}

	@Test
	public void 正しいAttrIndexMinMaxLineの最小値を認識する() {
		SVMScaleFile scaleFile = new SVMScaleFile();
		String line = "1 -2 3.1";
		scaleFile.isValidAttrIndexMinMaxLine(line);
		double actual = scaleFile.minAttr.get(1);
		double expected = -2;

		assertThat(actual, is(expected));
	}

	@Test
	public void 正しいAttrIndexMinMaxLineの最大値を認識する() {
		SVMScaleFile scaleFile = new SVMScaleFile();
		String line = "1 -2 3.1";
		scaleFile.isValidAttrIndexMinMaxLine(line);
		double actual = scaleFile.maxAttr.get(1);
		double expected = 3.1;

		assertThat(actual, is(expected));
	}

	@Test
	public void 正しくないAttrIndexMinMaxLineに偽を返す() {
		SVMScaleFile scaleFile = new SVMScaleFile();
		String line = "1 2.3";
		boolean actual = scaleFile.isValidAttrIndexMinMaxLine(line);
		boolean expected = false;

		assertThat(actual, is(expected));
	}
}
