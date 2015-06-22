package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsng;

public class RLSNgSVMDataSetPrinter implements RLSNgDataSetPrinter {
	@Override
	public void printHeader() {
	}

	@Override
	public void printAttributes(String cls, RLSNgAttributes attr) {
		String[] elm = {cls, "1:"+attr.getR(), "2:"+attr.getL(), "3:"+attr.getS(), "4:"+attr.getNg()};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
