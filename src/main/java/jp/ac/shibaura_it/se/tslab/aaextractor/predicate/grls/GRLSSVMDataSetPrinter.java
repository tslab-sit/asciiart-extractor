package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;


public class GRLSSVMDataSetPrinter implements GRLSDataSetPrinter {
	@Override
	public void printHeader() {
	}

	@Override
	public void printAttributes(String cls, GRLSAttributes attr) {
		String[] elm = {cls, "1:"+attr.getG(), "2:"+attr.getR(), "3:"+attr.getL(), "4:"+attr.getS()};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
