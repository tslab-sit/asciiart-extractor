package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsng;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeL;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeNg;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeR;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeS;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.NgramCounter;

public class RLSNgAttributesFactory {
	private AttributeR attributeR;
	private AttributeL attributeL;
	private AttributeS attributeS;
	private AttributeNg attributeNg;

	public RLSNgAttributesFactory(NgramCounter ngCounter) {
		this.attributeR = new AttributeR();
		this.attributeL = new AttributeL();
		this.attributeS = new AttributeS();
		this.attributeNg = new AttributeNg(ngCounter);
	}
	public RLSNgAttributes create(Window w) {
		RLSNgAttributes attributes = new RLSNgAttributes();
		attributes.setR((double)this.attributeR.getAttribute(w));
		attributes.setL((int)this.attributeL.getAttribute(w));
		attributes.setS((int)this.attributeS.getAttribute(w));
		attributes.setNg((int)this.attributeNg.getAttribute(w));
		return attributes;
	}
}
