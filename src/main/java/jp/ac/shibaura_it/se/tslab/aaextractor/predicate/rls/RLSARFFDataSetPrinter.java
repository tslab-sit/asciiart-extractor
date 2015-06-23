package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;

public class RLSARFFDataSetPrinter implements RLSDataSetPrinter {
//	public static final String rleRateAttr = "rle_rate";
//	public static final String linesAttr = "lines";
//	public static final String textSizeAttr = "text_size";
//	public static final String classAttr = "class";
//	public static final String textartClassName = "textart";
//	public static final String notTextartClassName = "not_textart";

	private String[] header = {
			"@relation " + ARFFAttributes.RELATION_NAME,
			"@attribute " + ARFFAttributes.DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.NUMBER_OF_LINES_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.TEXT_SIZE_ATTRIBUTE + " real",
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
	public void printAttributes(String cls, RLSAttributes attr) {
		String[] elm = {attr.getR()+"", attr.getL()+"", attr.getS()+"", cls};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
