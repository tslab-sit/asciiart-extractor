package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.TextReader;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.KskipNgramCounter;

public class RLSKsNgAttributesExtractor {

	public static void main(String[] args) {
		RLSKsNgDataSetPrinter dataSetPrinter = null;

		if (args.length < 6) {
			System.err.println("usage: AttributeExtractor <format> <max_window_size> <k> <ngram_file> <class> <file1> <file2> ...");
			System.exit(1);
		}

		int argIndex=0;
		String format = args[argIndex++];
		if (format.equals("arff") || format.equals("ARFF")) {
			dataSetPrinter = new RLSKsNgARFFDataSetPrinter();
		} else if (format.equals("svm") || format.equals("SVM")) {
			dataSetPrinter = new RLSKsNgSVMDataSetPrinter();
		} else {
			System.err.println("<format> must be arff or svm");
			System.exit(1);
		}

		int maxWindowSize = Integer.parseInt(args[argIndex++]);
		if (maxWindowSize < 1) {
			System.err.println("Window size must be greater than or equal to 1.");
			System.exit(1);
		}

		int kSkip = Integer.parseInt(args[argIndex++]);
		if (kSkip < 0) {
			System.err.println("The skip k must be greater than or equal to 0.");
			System.exit(1);
		}

		String ngramFileName = args[argIndex++];
		KskipNgramCounter ngCounter = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(ngramFileName));
			ArrayList<String> ngrams = new ArrayList<String>();
			String line;
			while((line = br.readLine())!=null){
				ngrams.add(line);
			}
			br.close();
			ngCounter = new KskipNgramCounter(ngrams, kSkip);
		} catch(Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		
		String cls = args[argIndex++];
		if (cls.equals(ARFFAttributes.ASCIIART_CLASS_NAME) != true &&
			cls.equals(ARFFAttributes.NON_ASCIIART_CLASS_NAME) != true) {
			System.err.println("<class> must be either " + ARFFAttributes.ASCIIART_CLASS_NAME + " or " + ARFFAttributes.NON_ASCIIART_CLASS_NAME + ".");
			System.exit(1);
		}

		try {
			dataSetPrinter.printHeader();
			RLSKsNgAttributesFactory attrFactory = new RLSKsNgAttributesFactory(ngCounter);
			for(;argIndex < args.length; argIndex++) {
				String fileName = args[argIndex];
				for(int windowSize=1; windowSize<=maxWindowSize; windowSize++){
					ArrayList<String> contents = new ArrayList<String>();
					BufferedReader br = new BufferedReader(new FileReader(fileName));
					String line;
					while((line = br.readLine()) != null) {
						contents.add(line);
					}
					TextReader tr = new TextReader(contents, windowSize);
					br.close();
					Window window;
					while((window = tr.getNextWindow()) != null) {
						RLSKsNgAttributes attr = attrFactory.create(window);
						dataSetPrinter.printAttributes(cls, attr);
					}
				}
			}
			dataSetPrinter.printFooter();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}

}
