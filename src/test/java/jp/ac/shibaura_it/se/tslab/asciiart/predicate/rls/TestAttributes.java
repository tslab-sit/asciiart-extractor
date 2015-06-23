package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rls;

import static org.junit.Assert.*;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls.RLSAttributes;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls.RLSAttributesFactory;

import org.junit.Test;

import static org.hamcrest.core.Is.*;

public class TestAttributes {
	@Test
	public void testLine() {
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("\r\n");
		Window window = new Window(contents, 0, 0);
		RLSAttributesFactory attrFactory = new RLSAttributesFactory();
		RLSAttributes attrs = attrFactory.create(window);
		assertThat(attrs.getL(), is(1));
	}

	@Test
	public void testSize() {
		ArrayList<String> contents = new ArrayList<String>();
		contents.add("\r\n");
		Window window = new Window(contents, 0, 0);
		RLSAttributesFactory attrFactory = new RLSAttributesFactory();
		RLSAttributes attrs = attrFactory.create(window);
		assertThat(attrs.getS(), is(2));
	}
}
