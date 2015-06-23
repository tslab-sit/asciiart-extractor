package jp.ac.shibaura_it.se.tslab.aaextractor;

import java.util.List;

/**
 * An interface for ASCII art extractors
 * @author tetsuya
 *
 */
public interface ASCIIArtExtractor {
	/**
	 * This method returns windows on a text where ASCII art objects exist.
	 * @return
	 */
	public List<Window> extract();
}
