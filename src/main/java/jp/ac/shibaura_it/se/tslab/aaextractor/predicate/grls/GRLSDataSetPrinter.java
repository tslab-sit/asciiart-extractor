package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;


public interface GRLSDataSetPrinter {
	public void printHeader();
	public void printAttributes(String cls, GRLSAttributes attr);
	public void printFooter();
}
