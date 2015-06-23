package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rrvwls;

public class RRvwLSSVMDataSetPrinter implements RRvwLSDataSetPrinter {

	@Override
	public void printHeader() {
	}

	@Override
	public void printAttributes(String cls, RRvwLSAttributes attr) {
		String[] elm = {cls, "1:"+attr.getR(), "2:"+attr.getRvw(), "3:"+attr.getL(), "4:"+attr.getS()};
		System.out.println(String.join(" ", elm));
	}

	@Override
	public void printFooter() {
	}

}
