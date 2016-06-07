package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

public interface RLSKsNgDataSetPrinter {
	public void printHeader();
	public void printAttributes(String cls, RLSKsNgAttributes attr);
	public void printFooter();
}
