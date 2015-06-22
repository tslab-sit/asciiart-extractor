package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeL;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeR;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeS;

public class RLSAttributesFactory {
	private AttributeR attributeR;
	private AttributeL attributeL;
	private AttributeS attributeS;

	public RLSAttributesFactory() {
		this.attributeR = new AttributeR();
		this.attributeL = new AttributeL();
		this.attributeS = new AttributeS();
	}
	public RLSAttributes create(Window w) {
		RLSAttributes attributes = new RLSAttributes();
		attributes.setR((double)this.attributeR.getAttribute(w));
		attributes.setL((int)this.attributeL.getAttribute(w));
		attributes.setS((int)this.attributeS.getAttribute(w));
		return attributes;
	}

}
