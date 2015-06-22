package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rls;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;

public class TestWindow {
	ArrayList<String> contents = null;

	@Before
	public void setUp() {
		this.contents = new ArrayList<String>();
		this.contents.add("1");
		this.contents.add("2");
		this.contents.add("3");
	}
	
	@Test
	public void testStartLine1() {
		Window window = new Window(this.contents, -1, 0);
		assertThat(window.getStartingLine(), is(0));
	}

	@Test
	public void testEndLine1() {
		Window window = new Window(this.contents, -1, 0);
		assertThat(window.getEndLine(), is(0));
	}

	@Test
	public void testStartLine2() {
		Window window = new Window(this.contents, 0, 1);
		assertThat(window.getStartingLine(), is(0));
	}

	@Test
	public void testEndLine2() {
		Window window = new Window(this.contents, 0, 1);
		assertThat(window.getEndLine(), is(1));
	}

	@Test
	public void testStartLine3() {
		Window window = new Window(this.contents, 2, 3);
		assertThat(window.getStartingLine(), is(2));
	}

	@Test
	public void testEndLine3() {
		Window window = new Window(this.contents, 2, 3);
		assertThat(window.getEndLine(), is(2));
	}

}
