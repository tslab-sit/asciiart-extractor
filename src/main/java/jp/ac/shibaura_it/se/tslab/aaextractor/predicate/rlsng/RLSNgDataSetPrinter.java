package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsng;

public interface RLSNgDataSetPrinter {
	public void printHeader();
	public void printAttributes(String cls, RLSNgAttributes attr);
	public void printFooter();
}
