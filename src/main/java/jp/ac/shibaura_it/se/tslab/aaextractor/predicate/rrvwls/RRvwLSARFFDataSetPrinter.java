package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rrvwls;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;

public class RRvwLSARFFDataSetPrinter implements RRvwLSDataSetPrinter {
//	public static final String rleRateAttr = "rle_rate";
//	public static final String rleRateVwAttr = "rle_rate_vw";
//	public static final String linesAttr = "lines";
//	public static final String textSizeAttr = "text_size";
//	public static final String classAttr = "class";
//	public static final String textartClassName = "textart";
//	public static final String notTextartClassName = "not_textart";

	private String[] header = {
			"@relation " + ARFFAttributes.RELATION_NAME,
			"@attribute " + ARFFAttributes.DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE + " real",
			"@attribute " + ARFFAttributes.DATA_COMPRESSION_RATE_OF_VERTICALLY_WINDING_TEXT_BY_RLE_ATTRIBUTE + " real",
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
	public void printAttributes(String cls, RRvwLSAttributes attr) {
		String[] elm = {attr.getR()+"", attr.getRvw()+"", attr.getL()+"", attr.getS()+"", cls};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
