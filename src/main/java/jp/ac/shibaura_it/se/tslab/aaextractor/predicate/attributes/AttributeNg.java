package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeNg implements NumericalAttribute {
	NgramCounter ngCounter;

	public AttributeNg(NgramCounter ngCounter) {
		this.ngCounter = ngCounter;
	}

	@Override
	public Number getAttribute(Window w) {
		ArrayList<String> line = new ArrayList<String>();
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			line.add(w.getContents().get(i));
		}
		return  line.stream().mapToInt(t -> this.ngCounter.count(t)).sum();
	}

}
