package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeS implements NumericalAttribute {

	@Override
	public Number getAttribute(Window w) {
		int s=0;
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			s += w.getContents().get(i).length();
		}
		return s;
	}

}
