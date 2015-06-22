package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rrvwls;

public class RRvwLSAttributes {
	private double compressionRate; // 圧縮率 compression rate
	private double Rvw; // 縦方向蛇行 compression rate of a vertical winding string by Run length encoding
	private int line; // 行数 the number of lines
	private int size; // 文字数 the number of characters

	RRvwLSAttributes(){
	}

	public final void setR(double r) {
		this.compressionRate = r;
	}
	public final double getR() {
		return this.compressionRate;
	}

	public final void setRvw(double rvw) {
		this.Rvw = rvw;
	}
	public final double getRvw() {
		return this.Rvw;
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
}
