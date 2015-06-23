package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

import java.util.ArrayList;
import java.util.List;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

/**
 * A text reader
 * @author tetsuya
 *
 */
public class TextReader {
	public final static String EOL = "\r\n";

	/**
	 * 前後にwidth-1行の空白業を含むテキスト
	 */
	private ArrayList<String> contents;
	/**
	 * 窓の幅
	 */
	private int width;
	/**
	 * contentsの行番号(-(width-1), ..., 0, 1, ..., contents.size()- (width-1) - 1)
	 */
	private int cursor;

	/**
	 * 
	 * @param contents スキャンすべき内容
	 * @param width 窓の大きさ
	 */
	public TextReader(List<String> contents, int width) {
		this.contents = new ArrayList<String>();
		for(String s: contents){
			// 改行文字の削除, 全角空白の半角空白2文字への変換, 改行文字の統一
			String x = s.replaceAll("(\r|\n|\r\n)$", "").replaceAll("\u3000", "\u0020\u0020") + EOL;
			this.contents.add(x);
		}
		this.width = width;
		this.cursor = -(width - 1);
	}

	public ArrayList<String> getContents() {
		return this.contents;
	}

	/**
	 * テキスト上の注目行番号(-width+1, ..., 0, 1, 2, ...)
	 * @return テキスト上の注目行番号
	 */
	public int getCursor() {
		return this.cursor;
	}

	public void moveTo(int newCursor) {
		this.cursor = newCursor;
	}

	public Window getNextWindow() {
		if (this.cursor >= this.contents.size()) {
			return null;
		}
		Window window = new Window(this.contents, this.cursor, this.cursor+this.width-1);
		this.cursor++;
		return window;
	}
}
