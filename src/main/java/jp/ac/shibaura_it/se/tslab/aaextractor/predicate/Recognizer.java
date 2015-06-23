package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;


/**
 * An interface for ASCII art recognizers
 * @author tetsuya
 *
 */
public interface Recognizer {
	/**
	 * This method tells if the text in a given window is an ASCII art or not.
	 * @param window a window on a text
	 * @return If the text in the window is an ASCII art, true. Otherwise, false. 
	 */
	public boolean isASCIIArt(Window window);
}
