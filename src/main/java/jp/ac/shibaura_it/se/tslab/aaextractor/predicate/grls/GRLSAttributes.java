package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;

public class GRLSAttributes {
	private double gzippedRate; // gzipによる圧縮率
	private double compressionRate; // 圧縮率
	private int line; // 行数
	private int size; // 文字数

	GRLSAttributes() {
	}
//	public GRLSAttributes(Window w){
//		this.gzippedRate = (double)(new AttributeG()).getAttribute(w);
//		this.compressionRate =  (double)(new AttributeR()).getAttribute(w);
//		this.line = (int)(new AttributeL()).getAttribute(w);
//		this.size = (int)(new AttributeS()).getAttribute(w);
//	}
	
	public final void setG(double g) {
		this.gzippedRate = g;
	}
	public final double getG() {
		return this.gzippedRate;
	}
	
	public final void setR(double r) {
		this.compressionRate = r;
	}
	public final double getR() {
		return this.compressionRate;
	}
	
	public final void setL(int l) {
		this.line = l;
	}
	public final int getL() {
		return this.line;
	}
	
	public void setS(int s) {
		this.size = s;
	}
	public final int getS() {
		return this.size;
	}
}
