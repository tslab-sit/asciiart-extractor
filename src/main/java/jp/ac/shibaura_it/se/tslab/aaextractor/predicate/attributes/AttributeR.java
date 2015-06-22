package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeR implements NumericalAttribute {

	@Override
	public Number getAttribute(Window w) {
		ArrayList<String> line = new ArrayList<String>();
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			line.add(w.getContents().get(i));
		}
		
		String rle = line.stream().reduce("", (i, t)-> i + RunLengthEncoder.encode(t));
		String text = line.stream().reduce("", (i, t)-> i + t);
		return  (double)rle.length() / (double)text.length();
	}

}
