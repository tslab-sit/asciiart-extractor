package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeL implements NumericalAttribute {

	@Override
	public Number getAttribute(Window w) {
		return w.getWidth();
	}

}
