package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeKsNg implements NumericalAttribute {
	KskipNgramCounter counter;

	public AttributeKsNg(KskipNgramCounter counter) {
		this.counter = counter;
	}

	@Override
	public Number getAttribute(Window w) {
		ArrayList<String> line = new ArrayList<String>();
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			line.add(w.getContents().get(i));
		}
		return line.stream().mapToInt(t -> this.counter.count(t)).sum();
	}


}
