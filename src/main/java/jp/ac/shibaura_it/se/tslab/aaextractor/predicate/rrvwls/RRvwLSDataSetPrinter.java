package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rrvwls;

public interface RRvwLSDataSetPrinter {
	public void printHeader();
	public void printAttributes(String cls, RRvwLSAttributes attr);
	public void printFooter();
}
