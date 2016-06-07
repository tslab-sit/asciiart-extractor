package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

public class RLSKsNgSVMDataSetPrinter implements RLSKsNgDataSetPrinter {
	@Override
	public void printHeader() {
	}

	@Override
	public void printAttributes(String cls, RLSKsNgAttributes attr) {
		String[] elm = {cls, "1:"+attr.getR(), "2:"+attr.getL(), "3:"+attr.getS(), "4:"+attr.getKsNg()};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
