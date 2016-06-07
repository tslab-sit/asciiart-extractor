package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

public class RLSKsNgAttributes {
	private double compressionRate; // 圧縮率
	private int line; // 行数
	private int size; // 文字数
	private int ksng; // k-skip n-gram数

	RLSKsNgAttributes() {
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

	public final void setKsNg(int ksng) {
		this.ksng = ksng;
	}
	public final int getKsNg() {
		return this.ksng;
	}
}