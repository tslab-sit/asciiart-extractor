package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;

public class RLSKsNgARFFDataSetPrinter implements RLSKsNgDataSetPrinter {
	private String[] header = {
			"@relation " + ARFFAttributes.RELATION_NAME,
			"@attribute " + ARFFAttributes.DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.NUMBER_OF_LINES_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.TEXT_SIZE_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.NUMBER_OF_NGRAMS_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.CLASS_ATTRIBUTE + " {" + ARFFAttributes.ASCIIART_CLASS_NAME + ", " + ARFFAttributes.NON_ASCIIART_CLASS_NAME + "}",
			"@data"
	};

	@Override
	public void printHeader() {
		for(String h: this.header) {
			System.out.println(h);
		}
	}

	@Override
	public void printAttributes(String cls, RLSKsNgAttributes attr) {
		String[] elm = {attr.getR()+"", attr.getL()+"", attr.getS()+"", attr.getKsNg()+"", cls};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}
}
