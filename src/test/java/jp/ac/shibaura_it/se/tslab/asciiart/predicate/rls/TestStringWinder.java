package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rls;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.StringVerticalWinder;

import org.junit.Test;

public class TestStringWinder {

	@Test
	public void test() {
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("12345"); 
		contents.add("abc"); 
		contents.add("xyzw");
		String actual = StringVerticalWinder.wind(contents);
		assertThat(actual, is("1axyb23czw45"));
	}

	@Test
	public void testDuplicateFullWidth() {
		String actual = StringVerticalWinder.duplicateFullWidth("aＢc");
		assertThat(actual, is("aＢＢc"));		
	}

	@Test
	public void testWiithFullWidth() {
		String expected = "1axyＢ2３Ｂzwc３45";
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("12３45"); 
		contents.add("aＢc"); 
		contents.add("xyzw");
		String actual = StringVerticalWinder.wind(contents);
		assertEquals(expected, actual);
	}

}
