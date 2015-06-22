package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

public interface RLSDataSetPrinter {
	public void printHeader();
	public void printAttributes(String cls, RLSAttributes attr);
	public void printFooter();
}
