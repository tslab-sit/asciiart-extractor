package jp.ac.shibaura_it.se.tslab.aaextractor.predicate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SVMScaleFile implements SVMScaler {
	double minScale = -1;
	double maxScale = 1;
	HashMap<Integer,Double> minAttr = new HashMap<>();
	HashMap<Integer,Double> maxAttr = new HashMap<>();
	
	boolean isValidFirstLine(String line) {
		return line.equals("x");
	}

	Pattern scale_min_max_pattern = Pattern.compile("^(-?\\d+)\\s(-?\\d+)$");
	boolean isValidScaleMinMaxLine(String line) {
		Matcher m = scale_min_max_pattern.matcher(line);
		if (m.find()) {
			minScale = Double.parseDouble(m.group(1));
			maxScale = Double.parseDouble(m.group(2));
			return true;
		}
		return false;
	}

	Pattern attr_index_min_max_pattern = Pattern.compile("^(\\d+)\\s(-?\\d+(?:\\.?\\d+)?)\\s(-?\\d+(?:\\.?\\d+)?)$");
	boolean isValidAttrIndexMinMaxLine(String line) {
		Matcher m = attr_index_min_max_pattern.matcher(line);
		if (m.find()) {
			int i = Integer.parseInt(m.group(1));
			double min = Double.parseDouble(m.group(2));
			double max = Double.parseDouble(m.group(3));
			minAttr.put(i, min);
			maxAttr.put(i, max);
			return true;
		}
		return false;
	}

	SVMScaleFile() {
	}

	public SVMScaleFile(String fileName) throws Exception {
		
		try {
			int lineNum = 0;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;			
			while((line = br.readLine()) != null) {
				if (lineNum == 0) {
					if (isValidFirstLine(line) == false) {
						// １行目は"x"
						br.close();
						throw new Exception("Invalid scale file: " + fileName);
					}
				} else if (lineNum == 1) {
					// scale 最小値 最大値を記録
					if (isValidScaleMinMaxLine(line) == false) {
						br.close();
						throw new Exception("Invalid scale file: " + fileName);
					}
				} else {
					// index 最小値 最大値を記録
					if (isValidAttrIndexMinMaxLine(line) == false) {
						br.close();
						throw new Exception("Invalid scale file: " + fileName);
					}
				}
				lineNum++;
			}
			br.close();
			if (lineNum < 3) {
				throw new Exception("Invalid scale file: " + fileName);
			}
		} catch(Exception e) {
			throw e;
		}
	}

	@Override
	public double scaledValue(int index, double attr) {
		Double min = minAttr.get(index);
		Double max = maxAttr.get(index);
		if (min == null || max == null) {
			return attr;
		}
		return minScale + (maxScale - minScale) * (attr - min) / (max - min);
	}

}
