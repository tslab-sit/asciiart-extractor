package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

public class SVMIdentityScaler implements SVMScaler {

	@Override
	public double scaledValue(int index, double attr) {
		return attr;
	}

}
