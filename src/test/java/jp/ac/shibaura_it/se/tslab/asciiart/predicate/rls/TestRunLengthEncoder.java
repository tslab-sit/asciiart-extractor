package jp.ac.shibaura_it.se.tslab.asciiart.predicate.rls;

import static org.junit.Assert.*;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.RunLengthEncoder;

import org.junit.Test;

import static org.hamcrest.core.Is.*;

public class TestRunLengthEncoder {

	@Test
	public void testEncode() {
		String data = "AABCDDDDDDDDDDDああ\r\nいいい";
		String encoded = RunLengthEncoder.encode(data);
		assertThat(encoded, is("A2B1C1D11あ2\r1\n1い3"));
	}

}
