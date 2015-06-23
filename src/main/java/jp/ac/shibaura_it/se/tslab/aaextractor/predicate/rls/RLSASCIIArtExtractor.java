package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.PredicateBasedASCIIArtExtractor;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.Recognizer;

import libsvm.svm;
import libsvm.svm_model;
import weka.classifiers.trees.J48;

public class RLSASCIIArtExtractor {
	/**
	 * TextArtExtractor model file
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		if (args.length != 4) {
			System.err.println("ASCIIArtExtractor <recognizer_type> <model> <width> <file>");
			System.exit(1);
		}
		Recognizer recognizer = null;
		ArrayList<String> contents = new ArrayList<String>();
		int width=1;
		try {
			int argIndex=0;
			String format=args[argIndex++];
			if (format.equals("j48") || format.equals("J48")) {
				J48 j48 = (J48)weka.core.SerializationHelper.read(args[argIndex++]);
				recognizer = new RLSJ48(j48);
			} else if (format.equals("svm") || format.equals("SVM")) {
				svm_model model = svm.svm_load_model(args[argIndex++]);
				recognizer = new RLSSVM(model);
			} else {
				System.err.println("<recognizer_type> must be j48 or svm");
				System.exit(1);
			}
			// width
			width = Integer.parseInt(args[argIndex++]);

			//
			BufferedReader br = new BufferedReader(new FileReader(args[argIndex++]));
			String line;
			while((line = br.readLine()) != null) {
				contents.add(line);
			}
			br.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		
		PredicateBasedASCIIArtExtractor extractor = new PredicateBasedASCIIArtExtractor(recognizer, width, contents);
		List<Window> windows = extractor.extract();

		System.out.print(windows.size());
		for(Window w: windows) {
			System.out.print("," + w.getStartingLine() + "," + w.getEndLine());
		}
		System.out.println();
	}
}
