package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rrvwls;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeL;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeR;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeRvw;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeS;

public class RRvwLSAttributesFactory {
	private AttributeR attributeR;
	private AttributeL attributeL;
	private AttributeS attributeS;
	private AttributeRvw attributeRvw;
	
	public RRvwLSAttributesFactory() {
		this.attributeR = new AttributeR();
		this.attributeL = new AttributeL();
		this.attributeS = new AttributeS();
		this.attributeRvw = new AttributeRvw();
	}
	public RRvwLSAttributes create(Window w) {
		RRvwLSAttributes attributes = new RRvwLSAttributes();
		attributes.setR((double)this.attributeR.getAttribute(w));
		attributes.setL((int)this.attributeL.getAttribute(w));
		attributes.setS((int)this.attributeS.getAttribute(w));
		attributes.setRvw((double)this.attributeRvw.getAttribute(w));
		return attributes;
	}

}
