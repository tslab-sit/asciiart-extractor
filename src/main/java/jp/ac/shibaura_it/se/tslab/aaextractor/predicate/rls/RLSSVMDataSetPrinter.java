package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

public class RLSSVMDataSetPrinter implements RLSDataSetPrinter {

	@Override
	public void printHeader() {
	}

	@Override
	public void printAttributes(String cls, RLSAttributes attr) {
		String[] elm = {cls, "1:"+attr.getR(), "2:"+attr.getL(), "3:"+attr.getS()};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
