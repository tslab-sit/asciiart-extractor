package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeRvw implements NumericalAttribute {

	@Override
	public Number getAttribute(Window w) {
		ArrayList<String> line = new ArrayList<String>();
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			line.add(w.getContents().get(i));
		}
		
		String rvw = StringVerticalWinder.wind(line);
		return (double)RunLengthEncoder.encode(rvw).length() / (double)rvw.length();
	}

}
