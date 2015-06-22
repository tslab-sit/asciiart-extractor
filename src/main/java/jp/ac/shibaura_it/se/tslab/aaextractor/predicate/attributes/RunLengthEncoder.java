package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

/**
 * Run Length Encoder
 * 
 * @author tetsuya
 *
 */
public class RunLengthEncoder {
	/**
	 * RunLengthEncoder.encode("AABCDDDDDDDDDDDああ\r\nいいい") will return "A2B1C1D11あ2\r1\n1い3".
	 * @param data a string to be encoded
	 * @return an encoded string
	 */
	public static String encode(String data) {
		StringBuffer sb = new StringBuffer();
		char[] cdata = data.toCharArray();
		int i=0;
		while(i<cdata.length) {
			char ch = cdata[i];
			int count=0;
			while(i<cdata.length){
				if (ch == cdata[i]) {
					i++;
					count++;
				} else {
					break;
				}
			}
			sb.append(ch);
			sb.append(count);
		}
		return sb.toString();
	}
}
