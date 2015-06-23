package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes;

import java.util.ArrayList;

/**
 * A list of strings
 *   "12３45", 
 *   "aＢc", 
 *   "xyzw"
 * will be translated to a string "1axyＢ23Ｂzwc３45".
 * @author tetsuya
 *
 */
public class StringVerticalWinder {
	private static String wind(StringBuffer sb, ArrayList<String> contents, ArrayList<String> reversedContents, int index) {
		int sbLength = sb.length();
		for(String s: contents) {
			if (s.length() > index) {
				sb.append(s.charAt(index));
			}
		}
		if (sb.length() == sbLength) {
			return sb.toString();
		}
		return wind(sb, reversedContents, contents, index+1);
	}

	private static ArrayList<String> getReverseArrayList(ArrayList<String> array){
		ArrayList<String> reversed = new ArrayList<String>();
		for(int i=array.size()-1; i>=0; i--) {
			reversed.add(array.get(i));
		}
		return reversed;
	}

	public static String duplicateFullWidth(String s) {
		StringBuffer sb = new StringBuffer();
		int length = s.length();
		for(int i=0; i<length; i++){
			sb.append(s.substring(i, i+1));
			if (EastAsianWidth.isFullWidth(s.substring(i, i+1).codePointAt(0))){
				sb.append(s.substring(i, i+1));
			}
		}
		return sb.toString();
	}

//	public String wind(ArrayList<String> contents) {
//		return wind(new StringBuffer(), contents, getReverseArrayList(contents), 0);
//	}

	public static String wind(ArrayList<String> contents) {
		ArrayList<String> c = new ArrayList<String>();
		for(String line: contents) {
			c.add(duplicateFullWidth(line));
		}
		return wind(new StringBuffer(), c, getReverseArrayList(c), 0);
	}
}
