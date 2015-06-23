package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;

import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;


public class GRLSARFFDataSetPrinter implements GRLSDataSetPrinter {
//	public static final String gzipRateAttr = "gzip_rate";
//	public static final String rleRateAttr = "rle_rate";
//	public static final String linesAttr = "lines";
//	public static final String textSizeAttr = "text_size";
//	public static final String classAttr = "class";
//	public static final String textartClassName = "textart";
//	public static final String notTextartClassName = "not_textart";

	private String[] header = {
			"@relation " + ARFFAttributes.RELATION_NAME,
			"@attribute " + ARFFAttributes.DATA_COMPRESSION_RATE_BY_GZIP_ATTRIBUTE + " real",
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
	public void printAttributes(String cls, GRLSAttributes attr) {
		// TODO Auto-generated method stub
		String[] elm = {attr.getG() +"", attr.getR()+"", attr.getL()+"", attr.getS()+"", cls};
		System.out.println(String.join(" ", elm));

	}

	@Override
	public void printFooter() {
		// TODO Auto-generated method stub

	}

}
