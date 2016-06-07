package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeKsNg;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeL;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeR;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.AttributeS;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.KskipNgramCounter;

public class RLSKsNgAttributesFactory {
	private AttributeR attributeR;
	private AttributeL attributeL;
	private AttributeS attributeS;
	private AttributeKsNg attributeNg;

	public RLSKsNgAttributesFactory(KskipNgramCounter ngCounter) {
		this.attributeR = new AttributeR();
		this.attributeL = new AttributeL();
		this.attributeS = new AttributeS();
		this.attributeNg = new AttributeKsNg(ngCounter);
	}
	public RLSKsNgAttributes create(Window w) {
		RLSKsNgAttributes attributes = new RLSKsNgAttributes();
		attributes.setR((double)this.attributeR.getAttribute(w));
		attributes.setL((int)this.attributeL.getAttribute(w));
		attributes.setS((int)this.attributeS.getAttribute(w));
		attributes.setKsNg((int)this.attributeNg.getAttribute(w));
		return attributes;
	}
}
