package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

/**
 * "N", "A", "H", "W", "F", "Na"
 * @author tetsuya
 *
 */
public class EastAsianWidth {
	public final static int N = 0;
	public final static int A = 1;
	public final static int H = 2;
	public final static int W = 3;
	public final static int F = 4;
	public final static int Na = 5;


	public static boolean isFullWidth(int codePoint) {
		int width = getKind(codePoint);
		if (width == EastAsianWidth.W || width == EastAsianWidth.A || width == EastAsianWidth.F) {
			return true;
		}
		return false;
	}

	public static boolean isHalfWidth(int codePoint) {
		return !isFullWidth(codePoint);
	}

	/**
	 * This method returns a category of character widths.
	 * The categories are based on http://www.unicode.org/Public/7.0.0/ucd/EastAsianWidth.txt
	 * @param codePoint a code point
	 * @return a category of character widths: EastAsianWidth.N, EastAsianWidth.A, EastAsianWidth.H, EastAsianWidth.W, EastAsianWidth.W, EastAsianWidth.F or EastAsianWidth.Na.
	 **/
	public static int getKind(int codePoint) {
		if (codePoint >= 0x0 && codePoint <= 0xa0) { return EastAsianWidth.N; }
		if (codePoint == 0xa1) { return EastAsianWidth.A; }
		if (codePoint >= 0xa2 && codePoint <= 0xa3) { return EastAsianWidth.N; }
		if (codePoint == 0xa4) { return EastAsianWidth.A; }
		if (codePoint >= 0xa5 && codePoint <= 0xa6) { return EastAsianWidth.N; }
		if (codePoint >= 0xa7 && codePoint <= 0xa8) { return EastAsianWidth.A; }
		if (codePoint == 0xa9) { return EastAsianWidth.N; }
		if (codePoint == 0xaa) { return EastAsianWidth.A; }
		if (codePoint >= 0xab && codePoint <= 0xac) { return EastAsianWidth.N; }
		if (codePoint >= 0xad && codePoint <= 0xae) { return EastAsianWidth.A; }
		if (codePoint == 0xaf) { return EastAsianWidth.N; }
		if (codePoint >= 0xb0 && codePoint <= 0xb4) { return EastAsianWidth.A; }
		if (codePoint == 0xb5) { return EastAsianWidth.N; }
		if (codePoint >= 0xb6 && codePoint <= 0xba) { return EastAsianWidth.A; }
		if (codePoint == 0xbb) { return EastAsianWidth.N; }
		if (codePoint >= 0xbc && codePoint <= 0xbf) { return EastAsianWidth.A; }
		if (codePoint >= 0xc0 && codePoint <= 0xc5) { return EastAsianWidth.N; }
		if (codePoint == 0xc6) { return EastAsianWidth.A; }
		if (codePoint >= 0xc7 && codePoint <= 0xcf) { return EastAsianWidth.N; }
		if (codePoint == 0xd0) { return EastAsianWidth.A; }
		if (codePoint >= 0xd1 && codePoint <= 0xd6) { return EastAsianWidth.N; }
		if (codePoint >= 0xd7 && codePoint <= 0xd8) { return EastAsianWidth.A; }
		if (codePoint >= 0xd9 && codePoint <= 0xdd) { return EastAsianWidth.N; }
		if (codePoint >= 0xde && codePoint <= 0xe1) { return EastAsianWidth.A; }
		if (codePoint >= 0xe2 && codePoint <= 0xe5) { return EastAsianWidth.N; }
		if (codePoint == 0xe6) { return EastAsianWidth.A; }
		if (codePoint == 0xe7) { return EastAsianWidth.N; }
		if (codePoint >= 0xe8 && codePoint <= 0xea) { return EastAsianWidth.A; }
		if (codePoint == 0xeb) { return EastAsianWidth.N; }
		if (codePoint >= 0xec && codePoint <= 0xed) { return EastAsianWidth.A; }
		if (codePoint >= 0xee && codePoint <= 0xef) { return EastAsianWidth.N; }
		if (codePoint == 0xf0) { return EastAsianWidth.A; }
		if (codePoint == 0xf1) { return EastAsianWidth.N; }
		if (codePoint >= 0xf2 && codePoint <= 0xf3) { return EastAsianWidth.A; }
		if (codePoint >= 0xf4 && codePoint <= 0xf6) { return EastAsianWidth.N; }
		if (codePoint >= 0xf7 && codePoint <= 0xfa) { return EastAsianWidth.A; }
		if (codePoint == 0xfb) { return EastAsianWidth.N; }
		if (codePoint == 0xfc) { return EastAsianWidth.A; }
		if (codePoint == 0xfd) { return EastAsianWidth.N; }
		if (codePoint == 0xfe) { return EastAsianWidth.A; }
		if (codePoint >= 0xff && codePoint <= 0x100) { return EastAsianWidth.N; }
		if (codePoint == 0x101) { return EastAsianWidth.A; }
		if (codePoint >= 0x102 && codePoint <= 0x110) { return EastAsianWidth.N; }
		if (codePoint == 0x111) { return EastAsianWidth.A; }
		if (codePoint == 0x112) { return EastAsianWidth.N; }
		if (codePoint == 0x113) { return EastAsianWidth.A; }
		if (codePoint >= 0x114 && codePoint <= 0x11a) { return EastAsianWidth.N; }
		if (codePoint == 0x11b) { return EastAsianWidth.A; }
		if (codePoint >= 0x11c && codePoint <= 0x125) { return EastAsianWidth.N; }
		if (codePoint >= 0x126 && codePoint <= 0x127) { return EastAsianWidth.A; }
		if (codePoint >= 0x128 && codePoint <= 0x12a) { return EastAsianWidth.N; }
		if (codePoint == 0x12b) { return EastAsianWidth.A; }
		if (codePoint >= 0x12c && codePoint <= 0x130) { return EastAsianWidth.N; }
		if (codePoint >= 0x131 && codePoint <= 0x133) { return EastAsianWidth.A; }
		if (codePoint >= 0x134 && codePoint <= 0x137) { return EastAsianWidth.N; }
		if (codePoint == 0x138) { return EastAsianWidth.A; }
		if (codePoint >= 0x139 && codePoint <= 0x13e) { return EastAsianWidth.N; }
		if (codePoint >= 0x13f && codePoint <= 0x142) { return EastAsianWidth.A; }
		if (codePoint == 0x143) { return EastAsianWidth.N; }
		if (codePoint == 0x144) { return EastAsianWidth.A; }
		if (codePoint >= 0x145 && codePoint <= 0x147) { return EastAsianWidth.N; }
		if (codePoint >= 0x148 && codePoint <= 0x14b) { return EastAsianWidth.A; }
		if (codePoint == 0x14c) { return EastAsianWidth.N; }
		if (codePoint == 0x14d) { return EastAsianWidth.A; }
		if (codePoint >= 0x14e && codePoint <= 0x151) { return EastAsianWidth.N; }
		if (codePoint >= 0x152 && codePoint <= 0x153) { return EastAsianWidth.A; }
		if (codePoint >= 0x154 && codePoint <= 0x165) { return EastAsianWidth.N; }
		if (codePoint >= 0x166 && codePoint <= 0x167) { return EastAsianWidth.A; }
		if (codePoint >= 0x168 && codePoint <= 0x16a) { return EastAsianWidth.N; }
		if (codePoint == 0x16b) { return EastAsianWidth.A; }
		if (codePoint >= 0x16c && codePoint <= 0x1cd) { return EastAsianWidth.N; }
		if (codePoint == 0x1ce) { return EastAsianWidth.A; }
		if (codePoint == 0x1cf) { return EastAsianWidth.N; }
		if (codePoint == 0x1d0) { return EastAsianWidth.A; }
		if (codePoint == 0x1d1) { return EastAsianWidth.N; }
		if (codePoint == 0x1d2) { return EastAsianWidth.A; }
		if (codePoint == 0x1d3) { return EastAsianWidth.N; }
		if (codePoint == 0x1d4) { return EastAsianWidth.A; }
		if (codePoint == 0x1d5) { return EastAsianWidth.N; }
		if (codePoint == 0x1d6) { return EastAsianWidth.A; }
		if (codePoint == 0x1d7) { return EastAsianWidth.N; }
		if (codePoint == 0x1d8) { return EastAsianWidth.A; }
		if (codePoint == 0x1d9) { return EastAsianWidth.N; }
		if (codePoint == 0x1da) { return EastAsianWidth.A; }
		if (codePoint == 0x1db) { return EastAsianWidth.N; }
		if (codePoint == 0x1dc) { return EastAsianWidth.A; }
		if (codePoint >= 0x1dd && codePoint <= 0x250) { return EastAsianWidth.N; }
		if (codePoint == 0x251) { return EastAsianWidth.A; }
		if (codePoint >= 0x252 && codePoint <= 0x260) { return EastAsianWidth.N; }
		if (codePoint == 0x261) { return EastAsianWidth.A; }
		if (codePoint >= 0x262 && codePoint <= 0x2c3) { return EastAsianWidth.N; }
		if (codePoint == 0x2c4) { return EastAsianWidth.A; }
		if (codePoint >= 0x2c5 && codePoint <= 0x2c6) { return EastAsianWidth.N; }
		if (codePoint == 0x2c7) { return EastAsianWidth.A; }
		if (codePoint == 0x2c8) { return EastAsianWidth.N; }
		if (codePoint >= 0x2c9 && codePoint <= 0x2cb) { return EastAsianWidth.A; }
		if (codePoint == 0x2cc) { return EastAsianWidth.N; }
		if (codePoint == 0x2cd) { return EastAsianWidth.A; }
		if (codePoint >= 0x2ce && codePoint <= 0x2cf) { return EastAsianWidth.N; }
		if (codePoint == 0x2d0) { return EastAsianWidth.A; }
		if (codePoint >= 0x2d1 && codePoint <= 0x2d7) { return EastAsianWidth.N; }
		if (codePoint >= 0x2d8 && codePoint <= 0x2db) { return EastAsianWidth.A; }
		if (codePoint == 0x2dc) { return EastAsianWidth.N; }
		if (codePoint == 0x2dd) { return EastAsianWidth.A; }
		if (codePoint == 0x2de) { return EastAsianWidth.N; }
		if (codePoint == 0x2df) { return EastAsianWidth.A; }
		if (codePoint >= 0x2e0 && codePoint <= 0x2ff) { return EastAsianWidth.N; }
		if (codePoint >= 0x300 && codePoint <= 0x36f) { return EastAsianWidth.A; }
		if (codePoint >= 0x370 && codePoint <= 0x377) { return EastAsianWidth.N; }
		if (codePoint >= 0x37a && codePoint <= 0x37f) { return EastAsianWidth.N; }
		if (codePoint >= 0x384 && codePoint <= 0x38a) { return EastAsianWidth.N; }
		if (codePoint == 0x38c) { return EastAsianWidth.N; }
		if (codePoint >= 0x38e && codePoint <= 0x390) { return EastAsianWidth.N; }
		if (codePoint >= 0x391 && codePoint <= 0x3a1) { return EastAsianWidth.A; }
		if (codePoint >= 0x3a3 && codePoint <= 0x3a9) { return EastAsianWidth.A; }
		if (codePoint >= 0x3aa && codePoint <= 0x3b0) { return EastAsianWidth.N; }
		if (codePoint >= 0x3b1 && codePoint <= 0x3c1) { return EastAsianWidth.A; }
		if (codePoint == 0x3c2) { return EastAsianWidth.N; }
		if (codePoint >= 0x3c3 && codePoint <= 0x3c9) { return EastAsianWidth.A; }
		if (codePoint >= 0x3ca && codePoint <= 0x400) { return EastAsianWidth.N; }
		if (codePoint == 0x401) { return EastAsianWidth.A; }
		if (codePoint >= 0x402 && codePoint <= 0x40f) { return EastAsianWidth.N; }
		if (codePoint >= 0x410 && codePoint <= 0x44f) { return EastAsianWidth.A; }
		if (codePoint == 0x450) { return EastAsianWidth.N; }
		if (codePoint == 0x451) { return EastAsianWidth.A; }
		if (codePoint >= 0x452 && codePoint <= 0x52f) { return EastAsianWidth.N; }
		if (codePoint >= 0x531 && codePoint <= 0x556) { return EastAsianWidth.N; }
		if (codePoint >= 0x559 && codePoint <= 0x55f) { return EastAsianWidth.N; }
		if (codePoint >= 0x561 && codePoint <= 0x587) { return EastAsianWidth.N; }
		if (codePoint >= 0x589 && codePoint <= 0x58a) { return EastAsianWidth.N; }
		if (codePoint >= 0x58d && codePoint <= 0x58f) { return EastAsianWidth.N; }
		if (codePoint >= 0x591 && codePoint <= 0x5c7) { return EastAsianWidth.N; }
		if (codePoint >= 0x5d0 && codePoint <= 0x5ea) { return EastAsianWidth.N; }
		if (codePoint >= 0x5f0 && codePoint <= 0x5f4) { return EastAsianWidth.N; }
		if (codePoint >= 0x600 && codePoint <= 0x61c) { return EastAsianWidth.N; }
		if (codePoint >= 0x61e && codePoint <= 0x70d) { return EastAsianWidth.N; }
		if (codePoint >= 0x70f && codePoint <= 0x74a) { return EastAsianWidth.N; }
		if (codePoint >= 0x74d && codePoint <= 0x7b1) { return EastAsianWidth.N; }
		if (codePoint >= 0x7c0 && codePoint <= 0x7fa) { return EastAsianWidth.N; }
		if (codePoint >= 0x800 && codePoint <= 0x82d) { return EastAsianWidth.N; }
		if (codePoint >= 0x830 && codePoint <= 0x83e) { return EastAsianWidth.N; }
		if (codePoint >= 0x840 && codePoint <= 0x85b) { return EastAsianWidth.N; }
		if (codePoint == 0x85e) { return EastAsianWidth.N; }
		if (codePoint >= 0x8a0 && codePoint <= 0x8b2) { return EastAsianWidth.N; }
		if (codePoint >= 0x8e4 && codePoint <= 0x983) { return EastAsianWidth.N; }
		if (codePoint >= 0x985 && codePoint <= 0x98c) { return EastAsianWidth.N; }
		if (codePoint >= 0x98f && codePoint <= 0x990) { return EastAsianWidth.N; }
		if (codePoint >= 0x993 && codePoint <= 0x9a8) { return EastAsianWidth.N; }
		if (codePoint >= 0x9aa && codePoint <= 0x9b0) { return EastAsianWidth.N; }
		if (codePoint == 0x9b2) { return EastAsianWidth.N; }
		if (codePoint >= 0x9b6 && codePoint <= 0x9b9) { return EastAsianWidth.N; }
		if (codePoint >= 0x9bc && codePoint <= 0x9c4) { return EastAsianWidth.N; }
		if (codePoint >= 0x9c7 && codePoint <= 0x9c8) { return EastAsianWidth.N; }
		if (codePoint >= 0x9cb && codePoint <= 0x9ce) { return EastAsianWidth.N; }
		if (codePoint == 0x9d7) { return EastAsianWidth.N; }
		if (codePoint >= 0x9dc && codePoint <= 0x9dd) { return EastAsianWidth.N; }
		if (codePoint >= 0x9df && codePoint <= 0x9e3) { return EastAsianWidth.N; }
		if (codePoint >= 0x9e6 && codePoint <= 0x9fb) { return EastAsianWidth.N; }
		if (codePoint >= 0xa01 && codePoint <= 0xa03) { return EastAsianWidth.N; }
		if (codePoint >= 0xa05 && codePoint <= 0xa0a) { return EastAsianWidth.N; }
		if (codePoint >= 0xa0f && codePoint <= 0xa10) { return EastAsianWidth.N; }
		if (codePoint >= 0xa13 && codePoint <= 0xa28) { return EastAsianWidth.N; }
		if (codePoint >= 0xa2a && codePoint <= 0xa30) { return EastAsianWidth.N; }
		if (codePoint >= 0xa32 && codePoint <= 0xa33) { return EastAsianWidth.N; }
		if (codePoint >= 0xa35 && codePoint <= 0xa36) { return EastAsianWidth.N; }
		if (codePoint >= 0xa38 && codePoint <= 0xa39) { return EastAsianWidth.N; }
		if (codePoint == 0xa3c) { return EastAsianWidth.N; }
		if (codePoint >= 0xa3e && codePoint <= 0xa42) { return EastAsianWidth.N; }
		if (codePoint >= 0xa47 && codePoint <= 0xa48) { return EastAsianWidth.N; }
		if (codePoint >= 0xa4b && codePoint <= 0xa4d) { return EastAsianWidth.N; }
		if (codePoint == 0xa51) { return EastAsianWidth.N; }
		if (codePoint >= 0xa59 && codePoint <= 0xa5c) { return EastAsianWidth.N; }
		if (codePoint == 0xa5e) { return EastAsianWidth.N; }
		if (codePoint >= 0xa66 && codePoint <= 0xa75) { return EastAsianWidth.N; }
		if (codePoint >= 0xa81 && codePoint <= 0xa83) { return EastAsianWidth.N; }
		if (codePoint >= 0xa85 && codePoint <= 0xa8d) { return EastAsianWidth.N; }
		if (codePoint >= 0xa8f && codePoint <= 0xa91) { return EastAsianWidth.N; }
		if (codePoint >= 0xa93 && codePoint <= 0xaa8) { return EastAsianWidth.N; }
		if (codePoint >= 0xaaa && codePoint <= 0xab0) { return EastAsianWidth.N; }
		if (codePoint >= 0xab2 && codePoint <= 0xab3) { return EastAsianWidth.N; }
		if (codePoint >= 0xab5 && codePoint <= 0xab9) { return EastAsianWidth.N; }
		if (codePoint >= 0xabc && codePoint <= 0xac5) { return EastAsianWidth.N; }
		if (codePoint >= 0xac7 && codePoint <= 0xac9) { return EastAsianWidth.N; }
		if (codePoint >= 0xacb && codePoint <= 0xacd) { return EastAsianWidth.N; }
		if (codePoint == 0xad0) { return EastAsianWidth.N; }
		if (codePoint >= 0xae0 && codePoint <= 0xae3) { return EastAsianWidth.N; }
		if (codePoint >= 0xae6 && codePoint <= 0xaf1) { return EastAsianWidth.N; }
		if (codePoint >= 0xb01 && codePoint <= 0xb03) { return EastAsianWidth.N; }
		if (codePoint >= 0xb05 && codePoint <= 0xb0c) { return EastAsianWidth.N; }
		if (codePoint >= 0xb0f && codePoint <= 0xb10) { return EastAsianWidth.N; }
		if (codePoint >= 0xb13 && codePoint <= 0xb28) { return EastAsianWidth.N; }
		if (codePoint >= 0xb2a && codePoint <= 0xb30) { return EastAsianWidth.N; }
		if (codePoint >= 0xb32 && codePoint <= 0xb33) { return EastAsianWidth.N; }
		if (codePoint >= 0xb35 && codePoint <= 0xb39) { return EastAsianWidth.N; }
		if (codePoint >= 0xb3c && codePoint <= 0xb44) { return EastAsianWidth.N; }
		if (codePoint >= 0xb47 && codePoint <= 0xb48) { return EastAsianWidth.N; }
		if (codePoint >= 0xb4b && codePoint <= 0xb4d) { return EastAsianWidth.N; }
		if (codePoint >= 0xb56 && codePoint <= 0xb57) { return EastAsianWidth.N; }
		if (codePoint >= 0xb5c && codePoint <= 0xb5d) { return EastAsianWidth.N; }
		if (codePoint >= 0xb5f && codePoint <= 0xb63) { return EastAsianWidth.N; }
		if (codePoint >= 0xb66 && codePoint <= 0xb77) { return EastAsianWidth.N; }
		if (codePoint >= 0xb82 && codePoint <= 0xb83) { return EastAsianWidth.N; }
		if (codePoint >= 0xb85 && codePoint <= 0xb8a) { return EastAsianWidth.N; }
		if (codePoint >= 0xb8e && codePoint <= 0xb90) { return EastAsianWidth.N; }
		if (codePoint >= 0xb92 && codePoint <= 0xb95) { return EastAsianWidth.N; }
		if (codePoint >= 0xb99 && codePoint <= 0xb9a) { return EastAsianWidth.N; }
		if (codePoint == 0xb9c) { return EastAsianWidth.N; }
		if (codePoint >= 0xb9e && codePoint <= 0xb9f) { return EastAsianWidth.N; }
		if (codePoint >= 0xba3 && codePoint <= 0xba4) { return EastAsianWidth.N; }
		if (codePoint >= 0xba8 && codePoint <= 0xbaa) { return EastAsianWidth.N; }
		if (codePoint >= 0xbae && codePoint <= 0xbb9) { return EastAsianWidth.N; }
		if (codePoint >= 0xbbe && codePoint <= 0xbc2) { return EastAsianWidth.N; }
		if (codePoint >= 0xbc6 && codePoint <= 0xbc8) { return EastAsianWidth.N; }
		if (codePoint >= 0xbca && codePoint <= 0xbcd) { return EastAsianWidth.N; }
		if (codePoint == 0xbd0) { return EastAsianWidth.N; }
		if (codePoint == 0xbd7) { return EastAsianWidth.N; }
		if (codePoint >= 0xbe6 && codePoint <= 0xbfa) { return EastAsianWidth.N; }
		if (codePoint >= 0xc00 && codePoint <= 0xc03) { return EastAsianWidth.N; }
		if (codePoint >= 0xc05 && codePoint <= 0xc0c) { return EastAsianWidth.N; }
		if (codePoint >= 0xc0e && codePoint <= 0xc10) { return EastAsianWidth.N; }
		if (codePoint >= 0xc12 && codePoint <= 0xc28) { return EastAsianWidth.N; }
		if (codePoint >= 0xc2a && codePoint <= 0xc39) { return EastAsianWidth.N; }
		if (codePoint >= 0xc3d && codePoint <= 0xc44) { return EastAsianWidth.N; }
		if (codePoint >= 0xc46 && codePoint <= 0xc48) { return EastAsianWidth.N; }
		if (codePoint >= 0xc4a && codePoint <= 0xc4d) { return EastAsianWidth.N; }
		if (codePoint >= 0xc55 && codePoint <= 0xc56) { return EastAsianWidth.N; }
		if (codePoint >= 0xc58 && codePoint <= 0xc59) { return EastAsianWidth.N; }
		if (codePoint >= 0xc60 && codePoint <= 0xc63) { return EastAsianWidth.N; }
		if (codePoint >= 0xc66 && codePoint <= 0xc6f) { return EastAsianWidth.N; }
		if (codePoint >= 0xc78 && codePoint <= 0xc7f) { return EastAsianWidth.N; }
		if (codePoint >= 0xc81 && codePoint <= 0xc83) { return EastAsianWidth.N; }
		if (codePoint >= 0xc85 && codePoint <= 0xc8c) { return EastAsianWidth.N; }
		if (codePoint >= 0xc8e && codePoint <= 0xc90) { return EastAsianWidth.N; }
		if (codePoint >= 0xc92 && codePoint <= 0xca8) { return EastAsianWidth.N; }
		if (codePoint >= 0xcaa && codePoint <= 0xcb3) { return EastAsianWidth.N; }
		if (codePoint >= 0xcb5 && codePoint <= 0xcb9) { return EastAsianWidth.N; }
		if (codePoint >= 0xcbc && codePoint <= 0xcc4) { return EastAsianWidth.N; }
		if (codePoint >= 0xcc6 && codePoint <= 0xcc8) { return EastAsianWidth.N; }
		if (codePoint >= 0xcca && codePoint <= 0xccd) { return EastAsianWidth.N; }
		if (codePoint >= 0xcd5 && codePoint <= 0xcd6) { return EastAsianWidth.N; }
		if (codePoint == 0xcde) { return EastAsianWidth.N; }
		if (codePoint >= 0xce0 && codePoint <= 0xce3) { return EastAsianWidth.N; }
		if (codePoint >= 0xce6 && codePoint <= 0xcef) { return EastAsianWidth.N; }
		if (codePoint >= 0xcf1 && codePoint <= 0xcf2) { return EastAsianWidth.N; }
		if (codePoint >= 0xd01 && codePoint <= 0xd03) { return EastAsianWidth.N; }
		if (codePoint >= 0xd05 && codePoint <= 0xd0c) { return EastAsianWidth.N; }
		if (codePoint >= 0xd0e && codePoint <= 0xd10) { return EastAsianWidth.N; }
		if (codePoint >= 0xd12 && codePoint <= 0xd3a) { return EastAsianWidth.N; }
		if (codePoint >= 0xd3d && codePoint <= 0xd44) { return EastAsianWidth.N; }
		if (codePoint >= 0xd46 && codePoint <= 0xd48) { return EastAsianWidth.N; }
		if (codePoint >= 0xd4a && codePoint <= 0xd4e) { return EastAsianWidth.N; }
		if (codePoint == 0xd57) { return EastAsianWidth.N; }
		if (codePoint >= 0xd60 && codePoint <= 0xd63) { return EastAsianWidth.N; }
		if (codePoint >= 0xd66 && codePoint <= 0xd75) { return EastAsianWidth.N; }
		if (codePoint >= 0xd79 && codePoint <= 0xd7f) { return EastAsianWidth.N; }
		if (codePoint >= 0xd82 && codePoint <= 0xd83) { return EastAsianWidth.N; }
		if (codePoint >= 0xd85 && codePoint <= 0xd96) { return EastAsianWidth.N; }
		if (codePoint >= 0xd9a && codePoint <= 0xdb1) { return EastAsianWidth.N; }
		if (codePoint >= 0xdb3 && codePoint <= 0xdbb) { return EastAsianWidth.N; }
		if (codePoint == 0xdbd) { return EastAsianWidth.N; }
		if (codePoint >= 0xdc0 && codePoint <= 0xdc6) { return EastAsianWidth.N; }
		if (codePoint == 0xdca) { return EastAsianWidth.N; }
		if (codePoint >= 0xdcf && codePoint <= 0xdd4) { return EastAsianWidth.N; }
		if (codePoint == 0xdd6) { return EastAsianWidth.N; }
		if (codePoint >= 0xdd8 && codePoint <= 0xddf) { return EastAsianWidth.N; }
		if (codePoint >= 0xde6 && codePoint <= 0xdef) { return EastAsianWidth.N; }
		if (codePoint >= 0xdf2 && codePoint <= 0xdf4) { return EastAsianWidth.N; }
		if (codePoint >= 0xe01 && codePoint <= 0xe3a) { return EastAsianWidth.N; }
		if (codePoint >= 0xe3f && codePoint <= 0xe5b) { return EastAsianWidth.N; }
		if (codePoint >= 0xe81 && codePoint <= 0xe82) { return EastAsianWidth.N; }
		if (codePoint == 0xe84) { return EastAsianWidth.N; }
		if (codePoint >= 0xe87 && codePoint <= 0xe88) { return EastAsianWidth.N; }
		if (codePoint == 0xe8a) { return EastAsianWidth.N; }
		if (codePoint == 0xe8d) { return EastAsianWidth.N; }
		if (codePoint >= 0xe94 && codePoint <= 0xe97) { return EastAsianWidth.N; }
		if (codePoint >= 0xe99 && codePoint <= 0xe9f) { return EastAsianWidth.N; }
		if (codePoint >= 0xea1 && codePoint <= 0xea3) { return EastAsianWidth.N; }
		if (codePoint == 0xea5) { return EastAsianWidth.N; }
		if (codePoint == 0xea7) { return EastAsianWidth.N; }
		if (codePoint >= 0xeaa && codePoint <= 0xeab) { return EastAsianWidth.N; }
		if (codePoint >= 0xead && codePoint <= 0xeb9) { return EastAsianWidth.N; }
		if (codePoint >= 0xebb && codePoint <= 0xebd) { return EastAsianWidth.N; }
		if (codePoint >= 0xec0 && codePoint <= 0xec4) { return EastAsianWidth.N; }
		if (codePoint == 0xec6) { return EastAsianWidth.N; }
		if (codePoint >= 0xec8 && codePoint <= 0xecd) { return EastAsianWidth.N; }
		if (codePoint >= 0xed0 && codePoint <= 0xed9) { return EastAsianWidth.N; }
		if (codePoint >= 0xedc && codePoint <= 0xedf) { return EastAsianWidth.N; }
		if (codePoint >= 0xf00 && codePoint <= 0xf47) { return EastAsianWidth.N; }
		if (codePoint >= 0xf49 && codePoint <= 0xf6c) { return EastAsianWidth.N; }
		if (codePoint >= 0xf71 && codePoint <= 0xf97) { return EastAsianWidth.N; }
		if (codePoint >= 0xf99 && codePoint <= 0xfbc) { return EastAsianWidth.N; }
		if (codePoint >= 0xfbe && codePoint <= 0xfcc) { return EastAsianWidth.N; }
		if (codePoint >= 0xfce && codePoint <= 0xfda) { return EastAsianWidth.N; }
		if (codePoint >= 0x1000 && codePoint <= 0x10c5) { return EastAsianWidth.N; }
		if (codePoint == 0x10c7) { return EastAsianWidth.N; }
		if (codePoint == 0x10cd) { return EastAsianWidth.N; }
		if (codePoint >= 0x10d0 && codePoint <= 0x10ff) { return EastAsianWidth.N; }
		if (codePoint >= 0x1100 && codePoint <= 0x115f) { return EastAsianWidth.W; }
		if (codePoint >= 0x1160 && codePoint <= 0x1248) { return EastAsianWidth.N; }
		if (codePoint >= 0x124a && codePoint <= 0x124d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1250 && codePoint <= 0x1256) { return EastAsianWidth.N; }
		if (codePoint == 0x1258) { return EastAsianWidth.N; }
		if (codePoint >= 0x125a && codePoint <= 0x125d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1260 && codePoint <= 0x1288) { return EastAsianWidth.N; }
		if (codePoint >= 0x128a && codePoint <= 0x128d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1290 && codePoint <= 0x12b0) { return EastAsianWidth.N; }
		if (codePoint >= 0x12b2 && codePoint <= 0x12b5) { return EastAsianWidth.N; }
		if (codePoint >= 0x12b8 && codePoint <= 0x12be) { return EastAsianWidth.N; }
		if (codePoint == 0x12c0) { return EastAsianWidth.N; }
		if (codePoint >= 0x12c2 && codePoint <= 0x12c5) { return EastAsianWidth.N; }
		if (codePoint >= 0x12c8 && codePoint <= 0x12d6) { return EastAsianWidth.N; }
		if (codePoint >= 0x12d8 && codePoint <= 0x1310) { return EastAsianWidth.N; }
		if (codePoint >= 0x1312 && codePoint <= 0x1315) { return EastAsianWidth.N; }
		if (codePoint >= 0x1318 && codePoint <= 0x135a) { return EastAsianWidth.N; }
		if (codePoint >= 0x135d && codePoint <= 0x137c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1380 && codePoint <= 0x1399) { return EastAsianWidth.N; }
		if (codePoint >= 0x13a0 && codePoint <= 0x13f4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1400 && codePoint <= 0x169c) { return EastAsianWidth.N; }
		if (codePoint >= 0x16a0 && codePoint <= 0x16f8) { return EastAsianWidth.N; }
		if (codePoint >= 0x1700 && codePoint <= 0x170c) { return EastAsianWidth.N; }
		if (codePoint >= 0x170e && codePoint <= 0x1714) { return EastAsianWidth.N; }
		if (codePoint >= 0x1720 && codePoint <= 0x1736) { return EastAsianWidth.N; }
		if (codePoint >= 0x1740 && codePoint <= 0x1753) { return EastAsianWidth.N; }
		if (codePoint >= 0x1760 && codePoint <= 0x176c) { return EastAsianWidth.N; }
		if (codePoint >= 0x176e && codePoint <= 0x1770) { return EastAsianWidth.N; }
		if (codePoint >= 0x1772 && codePoint <= 0x1773) { return EastAsianWidth.N; }
		if (codePoint >= 0x1780 && codePoint <= 0x17dd) { return EastAsianWidth.N; }
		if (codePoint >= 0x17e0 && codePoint <= 0x17e9) { return EastAsianWidth.N; }
		if (codePoint >= 0x17f0 && codePoint <= 0x17f9) { return EastAsianWidth.N; }
		if (codePoint >= 0x1800 && codePoint <= 0x180e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1810 && codePoint <= 0x1819) { return EastAsianWidth.N; }
		if (codePoint >= 0x1820 && codePoint <= 0x1877) { return EastAsianWidth.N; }
		if (codePoint >= 0x1880 && codePoint <= 0x18aa) { return EastAsianWidth.N; }
		if (codePoint >= 0x18b0 && codePoint <= 0x18f5) { return EastAsianWidth.N; }
		if (codePoint >= 0x1900 && codePoint <= 0x191e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1920 && codePoint <= 0x192b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1930 && codePoint <= 0x193b) { return EastAsianWidth.N; }
		if (codePoint == 0x1940) { return EastAsianWidth.N; }
		if (codePoint >= 0x1944 && codePoint <= 0x196d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1970 && codePoint <= 0x1974) { return EastAsianWidth.N; }
		if (codePoint >= 0x1980 && codePoint <= 0x19ab) { return EastAsianWidth.N; }
		if (codePoint >= 0x19b0 && codePoint <= 0x19c9) { return EastAsianWidth.N; }
		if (codePoint >= 0x19d0 && codePoint <= 0x19da) { return EastAsianWidth.N; }
		if (codePoint >= 0x19de && codePoint <= 0x1a1b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1a1e && codePoint <= 0x1a5e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1a60 && codePoint <= 0x1a7c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1a7f && codePoint <= 0x1a89) { return EastAsianWidth.N; }
		if (codePoint >= 0x1a90 && codePoint <= 0x1a99) { return EastAsianWidth.N; }
		if (codePoint >= 0x1aa0 && codePoint <= 0x1aad) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ab0 && codePoint <= 0x1abe) { return EastAsianWidth.N; }
		if (codePoint >= 0x1b00 && codePoint <= 0x1b4b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1b50 && codePoint <= 0x1b7c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1b80 && codePoint <= 0x1bf3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1bfc && codePoint <= 0x1c37) { return EastAsianWidth.N; }
		if (codePoint >= 0x1c3b && codePoint <= 0x1c49) { return EastAsianWidth.N; }
		if (codePoint >= 0x1c4d && codePoint <= 0x1c7f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1cc0 && codePoint <= 0x1cc7) { return EastAsianWidth.N; }
		if (codePoint >= 0x1cd0 && codePoint <= 0x1cf6) { return EastAsianWidth.N; }
		if (codePoint >= 0x1cf8 && codePoint <= 0x1cf9) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d00 && codePoint <= 0x1df5) { return EastAsianWidth.N; }
		if (codePoint >= 0x1dfc && codePoint <= 0x1f15) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f18 && codePoint <= 0x1f1d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f20 && codePoint <= 0x1f45) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f48 && codePoint <= 0x1f4d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f50 && codePoint <= 0x1f57) { return EastAsianWidth.N; }
		if (codePoint == 0x1f59) { return EastAsianWidth.N; }
		if (codePoint == 0x1f5b) { return EastAsianWidth.N; }
		if (codePoint == 0x1f5d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f5f && codePoint <= 0x1f7d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f80 && codePoint <= 0x1fb4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1fb6 && codePoint <= 0x1fc4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1fc6 && codePoint <= 0x1fd3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1fd6 && codePoint <= 0x1fdb) { return EastAsianWidth.N; }
		if (codePoint >= 0x1fdd && codePoint <= 0x1fef) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ff2 && codePoint <= 0x1ff4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ff6 && codePoint <= 0x1ffe) { return EastAsianWidth.N; }
		if (codePoint >= 0x2000 && codePoint <= 0x200f) { return EastAsianWidth.N; }
		if (codePoint == 0x2010) { return EastAsianWidth.A; }
		if (codePoint >= 0x2011 && codePoint <= 0x2012) { return EastAsianWidth.N; }
		if (codePoint >= 0x2013 && codePoint <= 0x2016) { return EastAsianWidth.A; }
		if (codePoint == 0x2017) { return EastAsianWidth.N; }
		if (codePoint >= 0x2018 && codePoint <= 0x2019) { return EastAsianWidth.A; }
		if (codePoint >= 0x201a && codePoint <= 0x201b) { return EastAsianWidth.N; }
		if (codePoint >= 0x201c && codePoint <= 0x201d) { return EastAsianWidth.A; }
		if (codePoint >= 0x201e && codePoint <= 0x201f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2020 && codePoint <= 0x2022) { return EastAsianWidth.A; }
		if (codePoint == 0x2023) { return EastAsianWidth.N; }
		if (codePoint >= 0x2024 && codePoint <= 0x2027) { return EastAsianWidth.A; }
		if (codePoint >= 0x2028 && codePoint <= 0x202f) { return EastAsianWidth.N; }
		if (codePoint == 0x2030) { return EastAsianWidth.A; }
		if (codePoint == 0x2031) { return EastAsianWidth.N; }
		if (codePoint >= 0x2032 && codePoint <= 0x2033) { return EastAsianWidth.A; }
		if (codePoint == 0x2034) { return EastAsianWidth.N; }
		if (codePoint == 0x2035) { return EastAsianWidth.A; }
		if (codePoint >= 0x2036 && codePoint <= 0x203a) { return EastAsianWidth.N; }
		if (codePoint == 0x203b) { return EastAsianWidth.A; }
		if (codePoint >= 0x203c && codePoint <= 0x203d) { return EastAsianWidth.N; }
		if (codePoint == 0x203e) { return EastAsianWidth.A; }
		if (codePoint >= 0x203f && codePoint <= 0x2064) { return EastAsianWidth.N; }
		if (codePoint >= 0x2066 && codePoint <= 0x2071) { return EastAsianWidth.N; }
		if (codePoint == 0x2074) { return EastAsianWidth.A; }
		if (codePoint >= 0x2075 && codePoint <= 0x207e) { return EastAsianWidth.N; }
		if (codePoint == 0x207f) { return EastAsianWidth.A; }
		if (codePoint == 0x2080) { return EastAsianWidth.N; }
		if (codePoint >= 0x2081 && codePoint <= 0x2084) { return EastAsianWidth.A; }
		if (codePoint >= 0x2085 && codePoint <= 0x208e) { return EastAsianWidth.N; }
		if (codePoint >= 0x2090 && codePoint <= 0x209c) { return EastAsianWidth.N; }
		if (codePoint >= 0x20a0 && codePoint <= 0x20a8) { return EastAsianWidth.N; }
		if (codePoint == 0x20a9) { return EastAsianWidth.H; }
		if (codePoint >= 0x20aa && codePoint <= 0x20ab) { return EastAsianWidth.N; }
		if (codePoint == 0x20ac) { return EastAsianWidth.A; }
		if (codePoint >= 0x20ad && codePoint <= 0x20bd) { return EastAsianWidth.N; }
		if (codePoint >= 0x20d0 && codePoint <= 0x20f0) { return EastAsianWidth.N; }
		if (codePoint >= 0x2100 && codePoint <= 0x2102) { return EastAsianWidth.N; }
		if (codePoint == 0x2103) { return EastAsianWidth.A; }
		if (codePoint == 0x2104) { return EastAsianWidth.N; }
		if (codePoint == 0x2105) { return EastAsianWidth.A; }
		if (codePoint >= 0x2106 && codePoint <= 0x2108) { return EastAsianWidth.N; }
		if (codePoint == 0x2109) { return EastAsianWidth.A; }
		if (codePoint >= 0x210a && codePoint <= 0x2112) { return EastAsianWidth.N; }
		if (codePoint == 0x2113) { return EastAsianWidth.A; }
		if (codePoint >= 0x2114 && codePoint <= 0x2115) { return EastAsianWidth.N; }
		if (codePoint == 0x2116) { return EastAsianWidth.A; }
		if (codePoint >= 0x2117 && codePoint <= 0x2120) { return EastAsianWidth.N; }
		if (codePoint >= 0x2121 && codePoint <= 0x2122) { return EastAsianWidth.A; }
		if (codePoint >= 0x2123 && codePoint <= 0x2125) { return EastAsianWidth.N; }
		if (codePoint == 0x2126) { return EastAsianWidth.A; }
		if (codePoint >= 0x2127 && codePoint <= 0x212a) { return EastAsianWidth.N; }
		if (codePoint == 0x212b) { return EastAsianWidth.A; }
		if (codePoint >= 0x212c && codePoint <= 0x2152) { return EastAsianWidth.N; }
		if (codePoint >= 0x2153 && codePoint <= 0x2154) { return EastAsianWidth.A; }
		if (codePoint >= 0x2155 && codePoint <= 0x215a) { return EastAsianWidth.N; }
		if (codePoint >= 0x215b && codePoint <= 0x215e) { return EastAsianWidth.A; }
		if (codePoint == 0x215f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2160 && codePoint <= 0x216b) { return EastAsianWidth.A; }
		if (codePoint >= 0x216c && codePoint <= 0x216f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2170 && codePoint <= 0x2179) { return EastAsianWidth.A; }
		if (codePoint >= 0x217a && codePoint <= 0x2188) { return EastAsianWidth.N; }
		if (codePoint == 0x2189) { return EastAsianWidth.A; }
		if (codePoint >= 0x2190 && codePoint <= 0x2199) { return EastAsianWidth.A; }
		if (codePoint >= 0x219a && codePoint <= 0x21b7) { return EastAsianWidth.N; }
		if (codePoint >= 0x21b8 && codePoint <= 0x21b9) { return EastAsianWidth.A; }
		if (codePoint >= 0x21ba && codePoint <= 0x21d1) { return EastAsianWidth.N; }
		if (codePoint == 0x21d2) { return EastAsianWidth.A; }
		if (codePoint == 0x21d3) { return EastAsianWidth.N; }
		if (codePoint == 0x21d4) { return EastAsianWidth.A; }
		if (codePoint >= 0x21d5 && codePoint <= 0x21e6) { return EastAsianWidth.N; }
		if (codePoint == 0x21e7) { return EastAsianWidth.A; }
		if (codePoint >= 0x21e8 && codePoint <= 0x21ff) { return EastAsianWidth.N; }
		if (codePoint == 0x2200) { return EastAsianWidth.A; }
		if (codePoint == 0x2201) { return EastAsianWidth.N; }
		if (codePoint >= 0x2202 && codePoint <= 0x2203) { return EastAsianWidth.A; }
		if (codePoint >= 0x2204 && codePoint <= 0x2206) { return EastAsianWidth.N; }
		if (codePoint >= 0x2207 && codePoint <= 0x2208) { return EastAsianWidth.A; }
		if (codePoint >= 0x2209 && codePoint <= 0x220a) { return EastAsianWidth.N; }
		if (codePoint == 0x220b) { return EastAsianWidth.A; }
		if (codePoint >= 0x220c && codePoint <= 0x220e) { return EastAsianWidth.N; }
		if (codePoint == 0x220f) { return EastAsianWidth.A; }
		if (codePoint == 0x2210) { return EastAsianWidth.N; }
		if (codePoint == 0x2211) { return EastAsianWidth.A; }
		if (codePoint >= 0x2212 && codePoint <= 0x2214) { return EastAsianWidth.N; }
		if (codePoint == 0x2215) { return EastAsianWidth.A; }
		if (codePoint >= 0x2216 && codePoint <= 0x2219) { return EastAsianWidth.N; }
		if (codePoint == 0x221a) { return EastAsianWidth.A; }
		if (codePoint >= 0x221b && codePoint <= 0x221c) { return EastAsianWidth.N; }
		if (codePoint >= 0x221d && codePoint <= 0x2220) { return EastAsianWidth.A; }
		if (codePoint >= 0x2221 && codePoint <= 0x2222) { return EastAsianWidth.N; }
		if (codePoint == 0x2223) { return EastAsianWidth.A; }
		if (codePoint == 0x2224) { return EastAsianWidth.N; }
		if (codePoint == 0x2225) { return EastAsianWidth.A; }
		if (codePoint == 0x2226) { return EastAsianWidth.N; }
		if (codePoint >= 0x2227 && codePoint <= 0x222c) { return EastAsianWidth.A; }
		if (codePoint == 0x222d) { return EastAsianWidth.N; }
		if (codePoint == 0x222e) { return EastAsianWidth.A; }
		if (codePoint >= 0x222f && codePoint <= 0x2233) { return EastAsianWidth.N; }
		if (codePoint >= 0x2234 && codePoint <= 0x2237) { return EastAsianWidth.A; }
		if (codePoint >= 0x2238 && codePoint <= 0x223b) { return EastAsianWidth.N; }
		if (codePoint >= 0x223c && codePoint <= 0x223d) { return EastAsianWidth.A; }
		if (codePoint >= 0x223e && codePoint <= 0x2247) { return EastAsianWidth.N; }
		if (codePoint == 0x2248) { return EastAsianWidth.A; }
		if (codePoint >= 0x2249 && codePoint <= 0x224b) { return EastAsianWidth.N; }
		if (codePoint == 0x224c) { return EastAsianWidth.A; }
		if (codePoint >= 0x224d && codePoint <= 0x2251) { return EastAsianWidth.N; }
		if (codePoint == 0x2252) { return EastAsianWidth.A; }
		if (codePoint >= 0x2253 && codePoint <= 0x225f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2260 && codePoint <= 0x2261) { return EastAsianWidth.A; }
		if (codePoint >= 0x2262 && codePoint <= 0x2263) { return EastAsianWidth.N; }
		if (codePoint >= 0x2264 && codePoint <= 0x2267) { return EastAsianWidth.A; }
		if (codePoint >= 0x2268 && codePoint <= 0x2269) { return EastAsianWidth.N; }
		if (codePoint >= 0x226a && codePoint <= 0x226b) { return EastAsianWidth.A; }
		if (codePoint >= 0x226c && codePoint <= 0x226d) { return EastAsianWidth.N; }
		if (codePoint >= 0x226e && codePoint <= 0x226f) { return EastAsianWidth.A; }
		if (codePoint >= 0x2270 && codePoint <= 0x2281) { return EastAsianWidth.N; }
		if (codePoint >= 0x2282 && codePoint <= 0x2283) { return EastAsianWidth.A; }
		if (codePoint >= 0x2284 && codePoint <= 0x2285) { return EastAsianWidth.N; }
		if (codePoint >= 0x2286 && codePoint <= 0x2287) { return EastAsianWidth.A; }
		if (codePoint >= 0x2288 && codePoint <= 0x2294) { return EastAsianWidth.N; }
		if (codePoint == 0x2295) { return EastAsianWidth.A; }
		if (codePoint >= 0x2296 && codePoint <= 0x2298) { return EastAsianWidth.N; }
		if (codePoint == 0x2299) { return EastAsianWidth.A; }
		if (codePoint >= 0x229a && codePoint <= 0x22a4) { return EastAsianWidth.N; }
		if (codePoint == 0x22a5) { return EastAsianWidth.A; }
		if (codePoint >= 0x22a6 && codePoint <= 0x22be) { return EastAsianWidth.N; }
		if (codePoint == 0x22bf) { return EastAsianWidth.A; }
		if (codePoint >= 0x22c0 && codePoint <= 0x2311) { return EastAsianWidth.N; }
		if (codePoint == 0x2312) { return EastAsianWidth.A; }
		if (codePoint >= 0x2313 && codePoint <= 0x2328) { return EastAsianWidth.N; }
		if (codePoint >= 0x2329 && codePoint <= 0x232a) { return EastAsianWidth.W; }
		if (codePoint >= 0x232b && codePoint <= 0x23fa) { return EastAsianWidth.N; }
		if (codePoint >= 0x2400 && codePoint <= 0x2426) { return EastAsianWidth.N; }
		if (codePoint >= 0x2440 && codePoint <= 0x244a) { return EastAsianWidth.N; }
		if (codePoint >= 0x2460 && codePoint <= 0x24e9) { return EastAsianWidth.A; }
		if (codePoint == 0x24ea) { return EastAsianWidth.N; }
		if (codePoint >= 0x24eb && codePoint <= 0x254b) { return EastAsianWidth.A; }
		if (codePoint >= 0x254c && codePoint <= 0x254f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2550 && codePoint <= 0x2573) { return EastAsianWidth.A; }
		if (codePoint >= 0x2574 && codePoint <= 0x257f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2580 && codePoint <= 0x258f) { return EastAsianWidth.A; }
		if (codePoint >= 0x2590 && codePoint <= 0x2591) { return EastAsianWidth.N; }
		if (codePoint >= 0x2592 && codePoint <= 0x2595) { return EastAsianWidth.A; }
		if (codePoint >= 0x2596 && codePoint <= 0x259f) { return EastAsianWidth.N; }
		if (codePoint >= 0x25a0 && codePoint <= 0x25a1) { return EastAsianWidth.A; }
		if (codePoint == 0x25a2) { return EastAsianWidth.N; }
		if (codePoint >= 0x25a3 && codePoint <= 0x25a9) { return EastAsianWidth.A; }
		if (codePoint >= 0x25aa && codePoint <= 0x25b1) { return EastAsianWidth.N; }
		if (codePoint >= 0x25b2 && codePoint <= 0x25b3) { return EastAsianWidth.A; }
		if (codePoint >= 0x25b4 && codePoint <= 0x25b5) { return EastAsianWidth.N; }
		if (codePoint >= 0x25b6 && codePoint <= 0x25b7) { return EastAsianWidth.A; }
		if (codePoint >= 0x25b8 && codePoint <= 0x25bb) { return EastAsianWidth.N; }
		if (codePoint >= 0x25bc && codePoint <= 0x25bd) { return EastAsianWidth.A; }
		if (codePoint >= 0x25be && codePoint <= 0x25bf) { return EastAsianWidth.N; }
		if (codePoint >= 0x25c0 && codePoint <= 0x25c1) { return EastAsianWidth.A; }
		if (codePoint >= 0x25c2 && codePoint <= 0x25c5) { return EastAsianWidth.N; }
		if (codePoint >= 0x25c6 && codePoint <= 0x25c8) { return EastAsianWidth.A; }
		if (codePoint >= 0x25c9 && codePoint <= 0x25ca) { return EastAsianWidth.N; }
		if (codePoint == 0x25cb) { return EastAsianWidth.A; }
		if (codePoint >= 0x25cc && codePoint <= 0x25cd) { return EastAsianWidth.N; }
		if (codePoint >= 0x25ce && codePoint <= 0x25d1) { return EastAsianWidth.A; }
		if (codePoint >= 0x25d2 && codePoint <= 0x25e1) { return EastAsianWidth.N; }
		if (codePoint >= 0x25e2 && codePoint <= 0x25e5) { return EastAsianWidth.A; }
		if (codePoint >= 0x25e6 && codePoint <= 0x25ee) { return EastAsianWidth.N; }
		if (codePoint == 0x25ef) { return EastAsianWidth.A; }
		if (codePoint >= 0x25f0 && codePoint <= 0x2604) { return EastAsianWidth.N; }
		if (codePoint >= 0x2605 && codePoint <= 0x2606) { return EastAsianWidth.A; }
		if (codePoint >= 0x2607 && codePoint <= 0x2608) { return EastAsianWidth.N; }
		if (codePoint == 0x2609) { return EastAsianWidth.A; }
		if (codePoint >= 0x260a && codePoint <= 0x260d) { return EastAsianWidth.N; }
		if (codePoint >= 0x260e && codePoint <= 0x260f) { return EastAsianWidth.A; }
		if (codePoint >= 0x2610 && codePoint <= 0x2613) { return EastAsianWidth.N; }
		if (codePoint >= 0x2614 && codePoint <= 0x2615) { return EastAsianWidth.A; }
		if (codePoint >= 0x2616 && codePoint <= 0x261b) { return EastAsianWidth.N; }
		if (codePoint == 0x261c) { return EastAsianWidth.A; }
		if (codePoint == 0x261d) { return EastAsianWidth.N; }
		if (codePoint == 0x261e) { return EastAsianWidth.A; }
		if (codePoint >= 0x261f && codePoint <= 0x263f) { return EastAsianWidth.N; }
		if (codePoint == 0x2640) { return EastAsianWidth.A; }
		if (codePoint == 0x2641) { return EastAsianWidth.N; }
		if (codePoint == 0x2642) { return EastAsianWidth.A; }
		if (codePoint >= 0x2643 && codePoint <= 0x265f) { return EastAsianWidth.N; }
		if (codePoint >= 0x2660 && codePoint <= 0x2661) { return EastAsianWidth.A; }
		if (codePoint == 0x2662) { return EastAsianWidth.N; }
		if (codePoint >= 0x2663 && codePoint <= 0x2665) { return EastAsianWidth.A; }
		if (codePoint == 0x2666) { return EastAsianWidth.N; }
		if (codePoint >= 0x2667 && codePoint <= 0x266a) { return EastAsianWidth.A; }
		if (codePoint == 0x266b) { return EastAsianWidth.N; }
		if (codePoint >= 0x266c && codePoint <= 0x266d) { return EastAsianWidth.A; }
		if (codePoint == 0x266e) { return EastAsianWidth.N; }
		if (codePoint == 0x266f) { return EastAsianWidth.A; }
		if (codePoint >= 0x2670 && codePoint <= 0x269d) { return EastAsianWidth.N; }
		if (codePoint >= 0x269e && codePoint <= 0x269f) { return EastAsianWidth.A; }
		if (codePoint >= 0x26a0 && codePoint <= 0x26bd) { return EastAsianWidth.N; }
		if (codePoint >= 0x26be && codePoint <= 0x26bf) { return EastAsianWidth.A; }
		if (codePoint >= 0x26c0 && codePoint <= 0x26c3) { return EastAsianWidth.N; }
		if (codePoint >= 0x26c4 && codePoint <= 0x26cd) { return EastAsianWidth.A; }
		if (codePoint == 0x26ce) { return EastAsianWidth.N; }
		if (codePoint >= 0x26cf && codePoint <= 0x26e1) { return EastAsianWidth.A; }
		if (codePoint == 0x26e2) { return EastAsianWidth.N; }
		if (codePoint == 0x26e3) { return EastAsianWidth.A; }
		if (codePoint >= 0x26e4 && codePoint <= 0x26e7) { return EastAsianWidth.N; }
		if (codePoint >= 0x26e8 && codePoint <= 0x26ff) { return EastAsianWidth.A; }
		if (codePoint >= 0x2700 && codePoint <= 0x273c) { return EastAsianWidth.N; }
		if (codePoint == 0x273d) { return EastAsianWidth.A; }
		if (codePoint >= 0x273e && codePoint <= 0x2756) { return EastAsianWidth.N; }
		if (codePoint == 0x2757) { return EastAsianWidth.A; }
		if (codePoint >= 0x2758 && codePoint <= 0x2775) { return EastAsianWidth.N; }
		if (codePoint >= 0x2776 && codePoint <= 0x277f) { return EastAsianWidth.A; }
		if (codePoint >= 0x2780 && codePoint <= 0x2b54) { return EastAsianWidth.N; }
		if (codePoint >= 0x2b55 && codePoint <= 0x2b59) { return EastAsianWidth.A; }
		if (codePoint >= 0x2b5a && codePoint <= 0x2b73) { return EastAsianWidth.N; }
		if (codePoint >= 0x2b76 && codePoint <= 0x2b95) { return EastAsianWidth.N; }
		if (codePoint >= 0x2b98 && codePoint <= 0x2bb9) { return EastAsianWidth.N; }
		if (codePoint >= 0x2bbd && codePoint <= 0x2bc8) { return EastAsianWidth.N; }
		if (codePoint >= 0x2bca && codePoint <= 0x2bd1) { return EastAsianWidth.N; }
		if (codePoint >= 0x2c00 && codePoint <= 0x2c2e) { return EastAsianWidth.N; }
		if (codePoint >= 0x2c30 && codePoint <= 0x2c5e) { return EastAsianWidth.N; }
		if (codePoint >= 0x2c60 && codePoint <= 0x2cf3) { return EastAsianWidth.N; }
		if (codePoint >= 0x2cf9 && codePoint <= 0x2d25) { return EastAsianWidth.N; }
		if (codePoint == 0x2d27) { return EastAsianWidth.N; }
		if (codePoint == 0x2d2d) { return EastAsianWidth.N; }
		if (codePoint >= 0x2d30 && codePoint <= 0x2d67) { return EastAsianWidth.N; }
		if (codePoint >= 0x2d6f && codePoint <= 0x2d70) { return EastAsianWidth.N; }
		if (codePoint >= 0x2d7f && codePoint <= 0x2d96) { return EastAsianWidth.N; }
		if (codePoint >= 0x2da0 && codePoint <= 0x2da6) { return EastAsianWidth.N; }
		if (codePoint >= 0x2da8 && codePoint <= 0x2dae) { return EastAsianWidth.N; }
		if (codePoint >= 0x2db0 && codePoint <= 0x2db6) { return EastAsianWidth.N; }
		if (codePoint >= 0x2db8 && codePoint <= 0x2dbe) { return EastAsianWidth.N; }
		if (codePoint >= 0x2dc0 && codePoint <= 0x2dc6) { return EastAsianWidth.N; }
		if (codePoint >= 0x2dc8 && codePoint <= 0x2dce) { return EastAsianWidth.N; }
		if (codePoint >= 0x2dd0 && codePoint <= 0x2dd6) { return EastAsianWidth.N; }
		if (codePoint >= 0x2dd8 && codePoint <= 0x2dde) { return EastAsianWidth.N; }
		if (codePoint >= 0x2de0 && codePoint <= 0x2e42) { return EastAsianWidth.N; }
		if (codePoint >= 0x2e80 && codePoint <= 0x2e99) { return EastAsianWidth.W; }
		if (codePoint >= 0x2e9b && codePoint <= 0x2ef3) { return EastAsianWidth.W; }
		if (codePoint >= 0x2f00 && codePoint <= 0x2fd5) { return EastAsianWidth.W; }
		if (codePoint >= 0x2ff0 && codePoint <= 0x2ffb) { return EastAsianWidth.W; }
		if (codePoint == 0x3000) { return EastAsianWidth.F; }
		if (codePoint >= 0x3001 && codePoint <= 0x303e) { return EastAsianWidth.W; }
		if (codePoint == 0x303f) { return EastAsianWidth.N; }
		if (codePoint >= 0x3041 && codePoint <= 0x3096) { return EastAsianWidth.W; }
		if (codePoint >= 0x3099 && codePoint <= 0x30ff) { return EastAsianWidth.W; }
		if (codePoint >= 0x3105 && codePoint <= 0x312d) { return EastAsianWidth.W; }
		if (codePoint >= 0x3131 && codePoint <= 0x318e) { return EastAsianWidth.W; }
		if (codePoint >= 0x3190 && codePoint <= 0x31ba) { return EastAsianWidth.W; }
		if (codePoint >= 0x31c0 && codePoint <= 0x31e3) { return EastAsianWidth.W; }
		if (codePoint >= 0x31f0 && codePoint <= 0x321e) { return EastAsianWidth.W; }
		if (codePoint >= 0x3220 && codePoint <= 0x3247) { return EastAsianWidth.W; }
		if (codePoint >= 0x3248 && codePoint <= 0x324f) { return EastAsianWidth.A; }
		if (codePoint >= 0x3250 && codePoint <= 0x32fe) { return EastAsianWidth.W; }
		if (codePoint >= 0x3300 && codePoint <= 0x4dbf) { return EastAsianWidth.W; }
		if (codePoint >= 0x4dc0 && codePoint <= 0x4dff) { return EastAsianWidth.N; }
		if (codePoint >= 0x4e00 && codePoint <= 0xa48c) { return EastAsianWidth.W; }
		if (codePoint >= 0xa490 && codePoint <= 0xa4c6) { return EastAsianWidth.W; }
		if (codePoint >= 0xa4d0 && codePoint <= 0xa62b) { return EastAsianWidth.N; }
		if (codePoint >= 0xa640 && codePoint <= 0xa69d) { return EastAsianWidth.N; }
		if (codePoint >= 0xa69f && codePoint <= 0xa6f7) { return EastAsianWidth.N; }
		if (codePoint >= 0xa700 && codePoint <= 0xa78e) { return EastAsianWidth.N; }
		if (codePoint >= 0xa790 && codePoint <= 0xa7ad) { return EastAsianWidth.N; }
		if (codePoint >= 0xa7b0 && codePoint <= 0xa7b1) { return EastAsianWidth.N; }
		if (codePoint >= 0xa7f7 && codePoint <= 0xa82b) { return EastAsianWidth.N; }
		if (codePoint >= 0xa830 && codePoint <= 0xa839) { return EastAsianWidth.N; }
		if (codePoint >= 0xa840 && codePoint <= 0xa877) { return EastAsianWidth.N; }
		if (codePoint >= 0xa880 && codePoint <= 0xa8c4) { return EastAsianWidth.N; }
		if (codePoint >= 0xa8ce && codePoint <= 0xa8d9) { return EastAsianWidth.N; }
		if (codePoint >= 0xa8e0 && codePoint <= 0xa8fb) { return EastAsianWidth.N; }
		if (codePoint >= 0xa900 && codePoint <= 0xa953) { return EastAsianWidth.N; }
		if (codePoint == 0xa95f) { return EastAsianWidth.N; }
		if (codePoint >= 0xa960 && codePoint <= 0xa97c) { return EastAsianWidth.W; }
		if (codePoint >= 0xa980 && codePoint <= 0xa9cd) { return EastAsianWidth.N; }
		if (codePoint >= 0xa9cf && codePoint <= 0xa9d9) { return EastAsianWidth.N; }
		if (codePoint >= 0xa9de && codePoint <= 0xa9fe) { return EastAsianWidth.N; }
		if (codePoint >= 0xaa00 && codePoint <= 0xaa36) { return EastAsianWidth.N; }
		if (codePoint >= 0xaa40 && codePoint <= 0xaa4d) { return EastAsianWidth.N; }
		if (codePoint >= 0xaa50 && codePoint <= 0xaa59) { return EastAsianWidth.N; }
		if (codePoint >= 0xaa5c && codePoint <= 0xaac2) { return EastAsianWidth.N; }
		if (codePoint >= 0xaadb && codePoint <= 0xaaf6) { return EastAsianWidth.N; }
		if (codePoint >= 0xab01 && codePoint <= 0xab06) { return EastAsianWidth.N; }
		if (codePoint >= 0xab09 && codePoint <= 0xab0e) { return EastAsianWidth.N; }
		if (codePoint >= 0xab11 && codePoint <= 0xab16) { return EastAsianWidth.N; }
		if (codePoint >= 0xab20 && codePoint <= 0xab26) { return EastAsianWidth.N; }
		if (codePoint >= 0xab28 && codePoint <= 0xab2e) { return EastAsianWidth.N; }
		if (codePoint >= 0xab30 && codePoint <= 0xab5f) { return EastAsianWidth.N; }
		if (codePoint >= 0xab64 && codePoint <= 0xab65) { return EastAsianWidth.N; }
		if (codePoint >= 0xabc0 && codePoint <= 0xabed) { return EastAsianWidth.N; }
		if (codePoint >= 0xabf0 && codePoint <= 0xabf9) { return EastAsianWidth.N; }
		if (codePoint >= 0xac00 && codePoint <= 0xd7a3) { return EastAsianWidth.W; }
		if (codePoint >= 0xd7b0 && codePoint <= 0xd7c6) { return EastAsianWidth.N; }
		if (codePoint >= 0xd7cb && codePoint <= 0xd7fb) { return EastAsianWidth.N; }
		if (codePoint >= 0xd800 && codePoint <= 0xdfff) { return EastAsianWidth.N; }
		if (codePoint >= 0xe000 && codePoint <= 0xf8ff) { return EastAsianWidth.A; }
		if (codePoint >= 0xf900 && codePoint <= 0xfaff) { return EastAsianWidth.W; }
		if (codePoint >= 0xfb00 && codePoint <= 0xfb06) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb13 && codePoint <= 0xfb17) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb1d && codePoint <= 0xfb36) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb38 && codePoint <= 0xfb3c) { return EastAsianWidth.N; }
		if (codePoint == 0xfb3e) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb40 && codePoint <= 0xfb41) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb43 && codePoint <= 0xfb44) { return EastAsianWidth.N; }
		if (codePoint >= 0xfb46 && codePoint <= 0xfbc1) { return EastAsianWidth.N; }
		if (codePoint >= 0xfbd3 && codePoint <= 0xfd3f) { return EastAsianWidth.N; }
		if (codePoint >= 0xfd50 && codePoint <= 0xfd8f) { return EastAsianWidth.N; }
		if (codePoint >= 0xfd92 && codePoint <= 0xfdc7) { return EastAsianWidth.N; }
		if (codePoint >= 0xfdf0 && codePoint <= 0xfdfd) { return EastAsianWidth.N; }
		if (codePoint >= 0xfe00 && codePoint <= 0xfe0f) { return EastAsianWidth.A; }
		if (codePoint >= 0xfe10 && codePoint <= 0xfe19) { return EastAsianWidth.W; }
		if (codePoint >= 0xfe20 && codePoint <= 0xfe2d) { return EastAsianWidth.N; }
		if (codePoint >= 0xfe30 && codePoint <= 0xfe52) { return EastAsianWidth.W; }
		if (codePoint >= 0xfe54 && codePoint <= 0xfe66) { return EastAsianWidth.W; }
		if (codePoint >= 0xfe68 && codePoint <= 0xfe6b) { return EastAsianWidth.W; }
		if (codePoint >= 0xfe70 && codePoint <= 0xfe74) { return EastAsianWidth.N; }
		if (codePoint >= 0xfe76 && codePoint <= 0xfefc) { return EastAsianWidth.N; }
		if (codePoint == 0xfeff) { return EastAsianWidth.N; }
		if (codePoint >= 0xff01 && codePoint <= 0xff60) { return EastAsianWidth.F; }
		if (codePoint >= 0xff61 && codePoint <= 0xffbe) { return EastAsianWidth.H; }
		if (codePoint >= 0xffc2 && codePoint <= 0xffc7) { return EastAsianWidth.H; }
		if (codePoint >= 0xffca && codePoint <= 0xffcf) { return EastAsianWidth.H; }
		if (codePoint >= 0xffd2 && codePoint <= 0xffd7) { return EastAsianWidth.H; }
		if (codePoint >= 0xffda && codePoint <= 0xffdc) { return EastAsianWidth.H; }
		if (codePoint >= 0xffe0 && codePoint <= 0xffe6) { return EastAsianWidth.F; }
		if (codePoint >= 0xffe8 && codePoint <= 0xffee) { return EastAsianWidth.H; }
		if (codePoint >= 0xfff9 && codePoint <= 0xfffc) { return EastAsianWidth.N; }
		if (codePoint == 0xfffd) { return EastAsianWidth.A; }
		if (codePoint >= 0x10000 && codePoint <= 0x1000b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1000d && codePoint <= 0x10026) { return EastAsianWidth.N; }
		if (codePoint >= 0x10028 && codePoint <= 0x1003a) { return EastAsianWidth.N; }
		if (codePoint >= 0x1003c && codePoint <= 0x1003d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1003f && codePoint <= 0x1004d) { return EastAsianWidth.N; }
		if (codePoint >= 0x10050 && codePoint <= 0x1005d) { return EastAsianWidth.N; }
		if (codePoint >= 0x10080 && codePoint <= 0x100fa) { return EastAsianWidth.N; }
		if (codePoint >= 0x10100 && codePoint <= 0x10102) { return EastAsianWidth.N; }
		if (codePoint >= 0x10107 && codePoint <= 0x10133) { return EastAsianWidth.N; }
		if (codePoint >= 0x10137 && codePoint <= 0x1018c) { return EastAsianWidth.N; }
		if (codePoint >= 0x10190 && codePoint <= 0x1019b) { return EastAsianWidth.N; }
		if (codePoint == 0x101a0) { return EastAsianWidth.N; }
		if (codePoint >= 0x101d0 && codePoint <= 0x101fd) { return EastAsianWidth.N; }
		if (codePoint >= 0x10280 && codePoint <= 0x1029c) { return EastAsianWidth.N; }
		if (codePoint >= 0x102a0 && codePoint <= 0x102d0) { return EastAsianWidth.N; }
		if (codePoint >= 0x102e0 && codePoint <= 0x102fb) { return EastAsianWidth.N; }
		if (codePoint >= 0x10300 && codePoint <= 0x10323) { return EastAsianWidth.N; }
		if (codePoint >= 0x10330 && codePoint <= 0x1034a) { return EastAsianWidth.N; }
		if (codePoint >= 0x10350 && codePoint <= 0x1037a) { return EastAsianWidth.N; }
		if (codePoint >= 0x10380 && codePoint <= 0x1039d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1039f && codePoint <= 0x103c3) { return EastAsianWidth.N; }
		if (codePoint >= 0x103c8 && codePoint <= 0x103d5) { return EastAsianWidth.N; }
		if (codePoint >= 0x10400 && codePoint <= 0x1049d) { return EastAsianWidth.N; }
		if (codePoint >= 0x104a0 && codePoint <= 0x104a9) { return EastAsianWidth.N; }
		if (codePoint >= 0x10500 && codePoint <= 0x10527) { return EastAsianWidth.N; }
		if (codePoint >= 0x10530 && codePoint <= 0x10563) { return EastAsianWidth.N; }
		if (codePoint == 0x1056f) { return EastAsianWidth.N; }
		if (codePoint >= 0x10600 && codePoint <= 0x10736) { return EastAsianWidth.N; }
		if (codePoint >= 0x10740 && codePoint <= 0x10755) { return EastAsianWidth.N; }
		if (codePoint >= 0x10760 && codePoint <= 0x10767) { return EastAsianWidth.N; }
		if (codePoint >= 0x10800 && codePoint <= 0x10805) { return EastAsianWidth.N; }
		if (codePoint == 0x10808) { return EastAsianWidth.N; }
		if (codePoint >= 0x1080a && codePoint <= 0x10835) { return EastAsianWidth.N; }
		if (codePoint >= 0x10837 && codePoint <= 0x10838) { return EastAsianWidth.N; }
		if (codePoint == 0x1083c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1083f && codePoint <= 0x10855) { return EastAsianWidth.N; }
		if (codePoint >= 0x10857 && codePoint <= 0x1089e) { return EastAsianWidth.N; }
		if (codePoint >= 0x108a7 && codePoint <= 0x108af) { return EastAsianWidth.N; }
		if (codePoint >= 0x10900 && codePoint <= 0x1091b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1091f && codePoint <= 0x10939) { return EastAsianWidth.N; }
		if (codePoint == 0x1093f) { return EastAsianWidth.N; }
		if (codePoint >= 0x10980 && codePoint <= 0x109b7) { return EastAsianWidth.N; }
		if (codePoint >= 0x109be && codePoint <= 0x109bf) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a00 && codePoint <= 0x10a03) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a05 && codePoint <= 0x10a06) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a0c && codePoint <= 0x10a13) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a15 && codePoint <= 0x10a17) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a19 && codePoint <= 0x10a33) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a38 && codePoint <= 0x10a3a) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a3f && codePoint <= 0x10a47) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a50 && codePoint <= 0x10a58) { return EastAsianWidth.N; }
		if (codePoint >= 0x10a60 && codePoint <= 0x10a9f) { return EastAsianWidth.N; }
		if (codePoint >= 0x10ac0 && codePoint <= 0x10ae6) { return EastAsianWidth.N; }
		if (codePoint >= 0x10aeb && codePoint <= 0x10af6) { return EastAsianWidth.N; }
		if (codePoint >= 0x10b00 && codePoint <= 0x10b35) { return EastAsianWidth.N; }
		if (codePoint >= 0x10b39 && codePoint <= 0x10b55) { return EastAsianWidth.N; }
		if (codePoint >= 0x10b58 && codePoint <= 0x10b72) { return EastAsianWidth.N; }
		if (codePoint >= 0x10b78 && codePoint <= 0x10b91) { return EastAsianWidth.N; }
		if (codePoint >= 0x10b99 && codePoint <= 0x10b9c) { return EastAsianWidth.N; }
		if (codePoint >= 0x10ba9 && codePoint <= 0x10baf) { return EastAsianWidth.N; }
		if (codePoint >= 0x10c00 && codePoint <= 0x10c48) { return EastAsianWidth.N; }
		if (codePoint >= 0x10e60 && codePoint <= 0x10e7e) { return EastAsianWidth.N; }
		if (codePoint >= 0x11000 && codePoint <= 0x1104d) { return EastAsianWidth.N; }
		if (codePoint >= 0x11052 && codePoint <= 0x1106f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1107f && codePoint <= 0x110c1) { return EastAsianWidth.N; }
		if (codePoint >= 0x110d0 && codePoint <= 0x110e8) { return EastAsianWidth.N; }
		if (codePoint >= 0x110f0 && codePoint <= 0x110f9) { return EastAsianWidth.N; }
		if (codePoint >= 0x11100 && codePoint <= 0x11134) { return EastAsianWidth.N; }
		if (codePoint >= 0x11136 && codePoint <= 0x11143) { return EastAsianWidth.N; }
		if (codePoint >= 0x11150 && codePoint <= 0x11176) { return EastAsianWidth.N; }
		if (codePoint >= 0x11180 && codePoint <= 0x111c8) { return EastAsianWidth.N; }
		if (codePoint == 0x111cd) { return EastAsianWidth.N; }
		if (codePoint >= 0x111d0 && codePoint <= 0x111da) { return EastAsianWidth.N; }
		if (codePoint >= 0x111e1 && codePoint <= 0x111f4) { return EastAsianWidth.N; }
		if (codePoint >= 0x11200 && codePoint <= 0x11211) { return EastAsianWidth.N; }
		if (codePoint >= 0x11213 && codePoint <= 0x1123d) { return EastAsianWidth.N; }
		if (codePoint >= 0x112b0 && codePoint <= 0x112ea) { return EastAsianWidth.N; }
		if (codePoint >= 0x112f0 && codePoint <= 0x112f9) { return EastAsianWidth.N; }
		if (codePoint >= 0x11301 && codePoint <= 0x11303) { return EastAsianWidth.N; }
		if (codePoint >= 0x11305 && codePoint <= 0x1130c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1130f && codePoint <= 0x11310) { return EastAsianWidth.N; }
		if (codePoint >= 0x11313 && codePoint <= 0x11328) { return EastAsianWidth.N; }
		if (codePoint >= 0x1132a && codePoint <= 0x11330) { return EastAsianWidth.N; }
		if (codePoint >= 0x11332 && codePoint <= 0x11333) { return EastAsianWidth.N; }
		if (codePoint >= 0x11335 && codePoint <= 0x11339) { return EastAsianWidth.N; }
		if (codePoint >= 0x1133c && codePoint <= 0x11344) { return EastAsianWidth.N; }
		if (codePoint >= 0x11347 && codePoint <= 0x11348) { return EastAsianWidth.N; }
		if (codePoint >= 0x1134b && codePoint <= 0x1134d) { return EastAsianWidth.N; }
		if (codePoint == 0x11357) { return EastAsianWidth.N; }
		if (codePoint >= 0x1135d && codePoint <= 0x11363) { return EastAsianWidth.N; }
		if (codePoint >= 0x11366 && codePoint <= 0x1136c) { return EastAsianWidth.N; }
		if (codePoint >= 0x11370 && codePoint <= 0x11374) { return EastAsianWidth.N; }
		if (codePoint >= 0x11480 && codePoint <= 0x114c7) { return EastAsianWidth.N; }
		if (codePoint >= 0x114d0 && codePoint <= 0x114d9) { return EastAsianWidth.N; }
		if (codePoint >= 0x11580 && codePoint <= 0x115b5) { return EastAsianWidth.N; }
		if (codePoint >= 0x115b8 && codePoint <= 0x115c9) { return EastAsianWidth.N; }
		if (codePoint >= 0x11600 && codePoint <= 0x11644) { return EastAsianWidth.N; }
		if (codePoint >= 0x11650 && codePoint <= 0x11659) { return EastAsianWidth.N; }
		if (codePoint >= 0x11680 && codePoint <= 0x116b7) { return EastAsianWidth.N; }
		if (codePoint >= 0x116c0 && codePoint <= 0x116c9) { return EastAsianWidth.N; }
		if (codePoint >= 0x118a0 && codePoint <= 0x118f2) { return EastAsianWidth.N; }
		if (codePoint == 0x118ff) { return EastAsianWidth.N; }
		if (codePoint >= 0x11ac0 && codePoint <= 0x11af8) { return EastAsianWidth.N; }
		if (codePoint >= 0x12000 && codePoint <= 0x12398) { return EastAsianWidth.N; }
		if (codePoint >= 0x12400 && codePoint <= 0x1246e) { return EastAsianWidth.N; }
		if (codePoint >= 0x12470 && codePoint <= 0x12474) { return EastAsianWidth.N; }
		if (codePoint >= 0x13000 && codePoint <= 0x1342e) { return EastAsianWidth.N; }
		if (codePoint >= 0x16800 && codePoint <= 0x16a38) { return EastAsianWidth.N; }
		if (codePoint >= 0x16a40 && codePoint <= 0x16a5e) { return EastAsianWidth.N; }
		if (codePoint >= 0x16a60 && codePoint <= 0x16a69) { return EastAsianWidth.N; }
		if (codePoint >= 0x16a6e && codePoint <= 0x16a6f) { return EastAsianWidth.N; }
		if (codePoint >= 0x16ad0 && codePoint <= 0x16aed) { return EastAsianWidth.N; }
		if (codePoint >= 0x16af0 && codePoint <= 0x16af5) { return EastAsianWidth.N; }
		if (codePoint >= 0x16b00 && codePoint <= 0x16b45) { return EastAsianWidth.N; }
		if (codePoint >= 0x16b50 && codePoint <= 0x16b59) { return EastAsianWidth.N; }
		if (codePoint >= 0x16b5b && codePoint <= 0x16b61) { return EastAsianWidth.N; }
		if (codePoint >= 0x16b63 && codePoint <= 0x16b77) { return EastAsianWidth.N; }
		if (codePoint >= 0x16b7d && codePoint <= 0x16b8f) { return EastAsianWidth.N; }
		if (codePoint >= 0x16f00 && codePoint <= 0x16f44) { return EastAsianWidth.N; }
		if (codePoint >= 0x16f50 && codePoint <= 0x16f7e) { return EastAsianWidth.N; }
		if (codePoint >= 0x16f8f && codePoint <= 0x16f9f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1b000 && codePoint <= 0x1b001) { return EastAsianWidth.W; }
		if (codePoint >= 0x1bc00 && codePoint <= 0x1bc6a) { return EastAsianWidth.N; }
		if (codePoint >= 0x1bc70 && codePoint <= 0x1bc7c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1bc80 && codePoint <= 0x1bc88) { return EastAsianWidth.N; }
		if (codePoint >= 0x1bc90 && codePoint <= 0x1bc99) { return EastAsianWidth.N; }
		if (codePoint >= 0x1bc9c && codePoint <= 0x1bca3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d000 && codePoint <= 0x1d0f5) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d100 && codePoint <= 0x1d126) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d129 && codePoint <= 0x1d1dd) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d200 && codePoint <= 0x1d245) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d300 && codePoint <= 0x1d356) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d360 && codePoint <= 0x1d371) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d400 && codePoint <= 0x1d454) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d456 && codePoint <= 0x1d49c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d49e && codePoint <= 0x1d49f) { return EastAsianWidth.N; }
		if (codePoint == 0x1d4a2) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d4a5 && codePoint <= 0x1d4a6) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d4a9 && codePoint <= 0x1d4ac) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d4ae && codePoint <= 0x1d4b9) { return EastAsianWidth.N; }
		if (codePoint == 0x1d4bb) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d4bd && codePoint <= 0x1d4c3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d4c5 && codePoint <= 0x1d505) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d507 && codePoint <= 0x1d50a) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d50d && codePoint <= 0x1d514) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d516 && codePoint <= 0x1d51c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d51e && codePoint <= 0x1d539) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d53b && codePoint <= 0x1d53e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d540 && codePoint <= 0x1d544) { return EastAsianWidth.N; }
		if (codePoint == 0x1d546) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d54a && codePoint <= 0x1d550) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d552 && codePoint <= 0x1d6a5) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d6a8 && codePoint <= 0x1d7cb) { return EastAsianWidth.N; }
		if (codePoint >= 0x1d7ce && codePoint <= 0x1d7ff) { return EastAsianWidth.N; }
		if (codePoint >= 0x1e800 && codePoint <= 0x1e8c4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1e8c7 && codePoint <= 0x1e8d6) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee00 && codePoint <= 0x1ee03) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee05 && codePoint <= 0x1ee1f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee21 && codePoint <= 0x1ee22) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee24) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee27) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee29 && codePoint <= 0x1ee32) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee34 && codePoint <= 0x1ee37) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee39) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee3b) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee42) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee47) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee49) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee4b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee4d && codePoint <= 0x1ee4f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee51 && codePoint <= 0x1ee52) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee54) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee57) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee59) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee5b) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee5d) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee5f) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee61 && codePoint <= 0x1ee62) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee64) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee67 && codePoint <= 0x1ee6a) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee6c && codePoint <= 0x1ee72) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee74 && codePoint <= 0x1ee77) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee79 && codePoint <= 0x1ee7c) { return EastAsianWidth.N; }
		if (codePoint == 0x1ee7e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee80 && codePoint <= 0x1ee89) { return EastAsianWidth.N; }
		if (codePoint >= 0x1ee8b && codePoint <= 0x1ee9b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1eea1 && codePoint <= 0x1eea3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1eea5 && codePoint <= 0x1eea9) { return EastAsianWidth.N; }
		if (codePoint >= 0x1eeab && codePoint <= 0x1eebb) { return EastAsianWidth.N; }
		if (codePoint >= 0x1eef0 && codePoint <= 0x1eef1) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f000 && codePoint <= 0x1f02b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f030 && codePoint <= 0x1f093) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f0a0 && codePoint <= 0x1f0ae) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f0b1 && codePoint <= 0x1f0bf) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f0c1 && codePoint <= 0x1f0cf) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f0d1 && codePoint <= 0x1f0f5) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f100 && codePoint <= 0x1f10a) { return EastAsianWidth.A; }
		if (codePoint >= 0x1f10b && codePoint <= 0x1f10c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f110 && codePoint <= 0x1f12d) { return EastAsianWidth.A; }
		if (codePoint == 0x1f12e) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f130 && codePoint <= 0x1f169) { return EastAsianWidth.A; }
		if (codePoint >= 0x1f16a && codePoint <= 0x1f16b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f170 && codePoint <= 0x1f19a) { return EastAsianWidth.A; }
		if (codePoint >= 0x1f1e6 && codePoint <= 0x1f1ff) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f200 && codePoint <= 0x1f202) { return EastAsianWidth.W; }
		if (codePoint >= 0x1f210 && codePoint <= 0x1f23a) { return EastAsianWidth.W; }
		if (codePoint >= 0x1f240 && codePoint <= 0x1f248) { return EastAsianWidth.W; }
		if (codePoint >= 0x1f250 && codePoint <= 0x1f251) { return EastAsianWidth.W; }
		if (codePoint >= 0x1f300 && codePoint <= 0x1f32c) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f330 && codePoint <= 0x1f37d) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f380 && codePoint <= 0x1f3ce) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f3d4 && codePoint <= 0x1f3f7) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f400 && codePoint <= 0x1f4fe) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f500 && codePoint <= 0x1f54a) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f550 && codePoint <= 0x1f579) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f57b && codePoint <= 0x1f5a3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f5a5 && codePoint <= 0x1f642) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f645 && codePoint <= 0x1f6cf) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f6e0 && codePoint <= 0x1f6ec) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f6f0 && codePoint <= 0x1f6f3) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f700 && codePoint <= 0x1f773) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f780 && codePoint <= 0x1f7d4) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f800 && codePoint <= 0x1f80b) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f810 && codePoint <= 0x1f847) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f850 && codePoint <= 0x1f859) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f860 && codePoint <= 0x1f887) { return EastAsianWidth.N; }
		if (codePoint >= 0x1f890 && codePoint <= 0x1f8ad) { return EastAsianWidth.N; }
		if (codePoint >= 0x20000 && codePoint <= 0x2fffd) { return EastAsianWidth.W; }
		if (codePoint >= 0x30000 && codePoint <= 0x3fffd) { return EastAsianWidth.W; }
		if (codePoint == 0xe0001) { return EastAsianWidth.N; }
		if (codePoint >= 0xe0020 && codePoint <= 0xe007f) { return EastAsianWidth.N; }
		if (codePoint >= 0xe0100 && codePoint <= 0xe01ef) { return EastAsianWidth.A; }
		if (codePoint >= 0xf0000 && codePoint <= 0xffffd) { return EastAsianWidth.A; }
		if (codePoint >= 0x100000 && codePoint <= 0x10fffd) { return EastAsianWidth.A; }
		// missing
		if (codePoint >= 0x0 && codePoint <= 0x10ffff) { return EastAsianWidth.N; }
		// default W
		if (codePoint >= 0x3400 && codePoint <= 0x4dbf) { return EastAsianWidth.W; }
		if (codePoint >= 0x4e00 && codePoint <= 0x9fff) { return EastAsianWidth.W; }
		if (codePoint >= 0xf900 && codePoint <= 0xfaff) { return EastAsianWidth.W; }
		if (codePoint >= 0x20000 && codePoint <= 0x2a6df) { return EastAsianWidth.W; }
		if (codePoint >= 0x2a700 && codePoint <= 0x2b73f) { return EastAsianWidth.W; }
		if (codePoint >= 0x2b740 && codePoint <= 0x2b81f) { return EastAsianWidth.W; }
		if (codePoint >= 0x2f800 && codePoint <= 0x2fa1f) { return EastAsianWidth.W; }
		if (codePoint >= 0x20000 && codePoint <= 0x2fffd) { return EastAsianWidth.W; }
		if (codePoint >= 0x30000 && codePoint <= 0x3fffd) { return EastAsianWidth.W; }
		// default N
		return EastAsianWidth.N;
	}
}
