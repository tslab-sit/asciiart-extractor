package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeG;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeL;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeR;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeS;

public class GRLSAttributesFactory {
	private AttributeG attributeG;
	private AttributeR attributeR;
	private AttributeL attributeL;
	private AttributeS attributeS;

	public GRLSAttributesFactory() {
		this.attributeG = new AttributeG();
		this.attributeR = new AttributeR();
		this.attributeL = new AttributeL();
		this.attributeS = new AttributeS();
	}
	public GRLSAttributes create(Window w) {
		GRLSAttributes attributes = new GRLSAttributes();
		attributes.setG((double)this.attributeG.getAttribute(w));
		attributes.setR((double)this.attributeR.getAttribute(w));
		attributes.setL((int)this.attributeL.getAttribute(w));
		attributes.setS((int)this.attributeS.getAttribute(w));
		return attributes;
	}

}
