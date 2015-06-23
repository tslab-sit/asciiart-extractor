package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;

public class AttributeG implements NumericalAttribute {

	@Override
	public Number getAttribute(Window w) {
		StringBuffer sb = new StringBuffer();
		for(int i=w.getStartingLine(); i<=w.getEndLine(); i++) {
			sb.append(w.getContents().get(i));
		}
		String text = sb.toString();

		byte[] gzipped = GZipEncoder.encode(text);
		return  (double)gzipped.length / (double)text.length();
	}

}
