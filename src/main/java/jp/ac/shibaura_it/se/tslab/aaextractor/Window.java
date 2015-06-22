package jp.ac.shibaura_it.se.tslab.aaextractor;

import java.util.ArrayList;

/**
 * A window on a text.
 * @author tetsuya
 *
 */
public class Window {
	private ArrayList<String> contents;
	private int startingLine;
	private int endLine;

	private int adjustLineNumber(int line, int max) {
		int result = line;
		if (result < 0) {
			result = 0;
		}
		if (result > max) {
			result = max;
		}
		return result;
	}

	/**
	 * A constructor.
	 * @param contents a list of lines
	 * @param startLine the starting line
	 * @param endLine the end line
	 */
	public Window(ArrayList<String> contents, int startLine, int endLine) {
		this.contents = contents;
		int maxLine = contents.size()-1;
		this.startingLine = adjustLineNumber(startLine, maxLine);
		this.endLine   = adjustLineNumber(endLine, maxLine);

		if (this.endLine < this.startingLine) {
			this.endLine = this.startingLine;
		}
	}

	/**
	 * This method returns a list of lines.
	 * @return a text on this window
	 */
	public ArrayList<String> getContents() {
		return this.contents;
	}

	/**
	 * The window width.
	 * @return the number of lines in this window.
	 */
	public int getWidth() {
		return this.endLine - this.startingLine + 1;
	}
	
	/**
	 * This method returns the starting line number of this window.
	 * @return the line number of the starting line.
	 */
	public int getStartingLine() {
		return this.startingLine;
	}
	
	/**
	 * This method returns the end line number of this window.
	 * @return the line number of the end line.
	 */
	public int getEndLine() {
		return this.endLine;
	}
}
