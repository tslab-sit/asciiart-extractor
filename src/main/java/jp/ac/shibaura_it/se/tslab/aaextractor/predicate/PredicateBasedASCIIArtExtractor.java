package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import jp.ac.shibaura_it.se.tslab.aaextractor.ASCIIArtExtractor;
import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

/**
 * A framework of predicate-based ASCII art extractors
 * @author tetsuya
 *
 */
public class PredicateBasedASCIIArtExtractor implements ASCIIArtExtractor {
	enum State {
		IN_ASCIIART,
		NOT_IN_ASCIIART
	}
	private Recognizer recognizer;
	private int width;
	private ArrayList<String> contents;

	public PredicateBasedASCIIArtExtractor(Recognizer recognizer, int width, ArrayList<String> contents) {
		this.recognizer = recognizer;
		this.width = width;
		this.contents = contents;
	}
	
	private List<Window> extractRoughRegions() {
		Stack<Window> result = new Stack<Window>();

		State state = State.NOT_IN_ASCIIART;
		TextReader reader = new TextReader(this.contents, this.width);
		int start = 0;
		Window window = null;
		while((window = reader.getNextWindow()) != null) {
			State nextState = State.NOT_IN_ASCIIART;
			if (recognizer.isASCIIArt(window)) {
				nextState = State.IN_ASCIIART;
			} else {
				nextState = State.NOT_IN_ASCIIART;
			}
			
			if (state == State.NOT_IN_ASCIIART && nextState == State.IN_ASCIIART) {
				start = reader.getCursor();
			} else if (state == State.IN_ASCIIART && nextState == State.NOT_IN_ASCIIART) {
				int end = reader.getCursor() - 1 + (width - 1); // 一つ前の窓の終端まで
				Window terminalWindow = new Window(this.contents, start, end);
				if (result.size() > 0 && terminalWindow.getStartingLine() <= result.lastElement().getEndLine()+1) {
					// 直前のテキストアート領域との併合
					Window lastWindow = result.pop();
					Window mergeWindow = new Window(this.contents, lastWindow.getStartingLine(), terminalWindow.getEndLine());
					result.push(mergeWindow);
				} else {
					result.push(terminalWindow);
				}
			}

			state = nextState;
		}
		return result;
	}

	private Window reduceWindow(Window region) {
		int newStart = region.getStartingLine();
		int newEnd = region.getEndLine();

		// newStart, newEndの範囲を調整
		if (newStart < 0) {
			newStart = 0;
		}
		if (newEnd >= contents.size()) {
			newEnd = contents.size()-1;
		}
		if (newStart > newEnd) {
			newEnd = newStart;
		}

		TextReader reader = new TextReader(contents, 1);

		while(newStart < newEnd) {
			reader.moveTo(newStart);
			Window window = reader.getNextWindow();
			if (window == null) {
				newStart--;
				if (newStart < region.getStartingLine()) {
					newStart = region.getStartingLine();
				}
				if (newStart < 0) {
					newStart = 0;
				}
				break;
			}
			if (this.recognizer.isASCIIArt(window)) {
				break;
			}
			newStart++;
		}
		
		while(newStart < newEnd) {
			reader.moveTo(newEnd);
			Window window = reader.getNextWindow();
			if (window == null) {
				newEnd++;
				if (newEnd > region.getEndLine()) {
					newEnd = region.getEndLine();
				}
				if (newEnd >= contents.size()) {
					newEnd = contents.size()-1;
				}
				break;
			}
			if (this.recognizer.isASCIIArt(window)) {
				break;
			}
			newEnd--;
		}

		return new Window(this.contents, newStart, newEnd);
	}

	@Override
	public List<Window> extract() {
		List<Window> roughWindows = extractRoughRegions();
		ArrayList<Window> reducedWindows = new ArrayList<Window>();
		for(Window w: roughWindows) {
			reducedWindows.add(reduceWindow(w));
		}
		return reducedWindows;
	}
}
