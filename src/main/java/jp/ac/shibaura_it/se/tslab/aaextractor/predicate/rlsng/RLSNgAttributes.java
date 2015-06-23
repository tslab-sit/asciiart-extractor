package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsng;

public class RLSNgAttributes {
	private double compressionRate; // 圧縮率
	private int line; // 行数
	private int size; // 文字数
	private int ngram; // ngram数

	RLSNgAttributes() {
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

	public final void setS(int s) {
		this.size = s;
	}
	public final int getS() {
		return this.size;
	}

	public final void setNg(int ng) {
		this.ngram = ng;
	}
	public final int getNg() {
		return this.ngram;
	}
}