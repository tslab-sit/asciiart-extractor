package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

/**
 * Constants of a relation name, attributes and class names in ARFF files.
 * @author tetsuya
 *
 */
public final class ARFFAttributes {
	private ARFFAttributes() {
	}

	public static final String RELATION_NAME = "asciiart";

	public static final String DATA_COMPRESSION_RATE_BY_GZIP_ATTRIBUTE = "dcr_by_gzip";
	public static final String DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE = "dcr_by_rle";
	public static final String DATA_COMPRESSION_RATE_OF_VERTICALLY_WINDING_TEXT_BY_RLE_ATTRIBUTE = "dcr_of_vertically_winding_text_by_rle";
	public static final String NUMBER_OF_LINES_ATTRIBUTE = "number_of_lines";
	public static final String TEXT_SIZE_ATTRIBUTE = "text_size";
	public static final String CLASS_ATTRIBUTE = "class";
	public static final String NUMBER_OF_NGRAMS_ATTRIBUTE = "number_of_ngrams";

	public static final String ASCIIART_CLASS_NAME = "asciiart";
	public static final String NON_ASCIIART_CLASS_NAME = "non_asciiart";
}
