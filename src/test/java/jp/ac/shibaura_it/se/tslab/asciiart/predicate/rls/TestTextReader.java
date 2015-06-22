package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rls;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.TextReader;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.CoreMatchers.nullValue;;

public class TestTextReader {
	ArrayList<String> contents;

	@Before
	public void setUp() throws Exception {
		this.contents = new ArrayList<String>();
		String[] line = {"1", "\u3000"};
		for(String s: line) {
			this.contents.add(s);
		}
	}

	@Test
	public void testReadWindowRead1Line0() {
		int size = 2;
		TextReader textReader = new TextReader(this.contents, size);

		Window w = textReader.getNextWindow();
		assertThat(textReader.getContents().get(w.getStartingLine()), is("1"+TextReader.EOL)); // "" "" 1
	}

	@Test
	public void testReadWindowRead2Line0() {
		int size = 2;
		TextReader textReader = new TextReader(this.contents, size);

		Window w;
		w = textReader.getNextWindow();
		w = textReader.getNextWindow();
		assertThat(textReader.getContents().get(w.getStartingLine()), is("1"+TextReader.EOL)); // "" "" 1
	}

	@Test
	public void testReadWindowRead2Line1() {
		int size = 2;
		TextReader textReader = new TextReader(this.contents, size);

		Window w;
		w = textReader.getNextWindow();
		w = textReader.getNextWindow();
		assertThat(textReader.getContents().get(w.getStartingLine()+1), is("\u0020\u0020"+TextReader.EOL));
	}

	@Test
	public void testReadWindowRead4Line0() {
		int size = 2;
		TextReader textReader = new TextReader(this.contents, size);

		Window w;
		w = textReader.getNextWindow(); // "" 1
		w = textReader.getNextWindow(); // 1  2
		w = textReader.getNextWindow(); // 2  ""
		w = textReader.getNextWindow(); // "" ""
		assertThat(w, is(nullValue()));
	}
	
	@Test
	public void testReplace() {
		String s = "\r\n";
		String EOL = "\r\n";
		String x = s.replaceAll("(\r|\n|\r\n)$", "").replaceAll("\u3000", "\u0020\u0020") + EOL;
		assertThat(x, is(EOL));
	}
}
