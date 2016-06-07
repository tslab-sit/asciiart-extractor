package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsksng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.PredicateBasedASCIIArtExtractor;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.Recognizer;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.KskipNgramCounter;
import weka.classifiers.trees.J48;

public class RLSKsNgASCIIArtExtractor {

	public static void main(String[] args) {
		if (args.length != 6) {
			System.err.println("ASCIIArtExtractor <recognizer_type> <model> <width> <k> <ngram> <file>");
			System.exit(1);
		}
		Recognizer recognizer = null;
		ArrayList<String> contents = new ArrayList<String>();
		int width=1;
		int kSkip=0;
		try {
			int argIndex=0;
			String format = args[argIndex++];
			if (format.equals("j48") || format.equals("J48")) {
				J48 j48 = (J48)weka.core.SerializationHelper.read(args[argIndex++]);
				// width
				width = Integer.parseInt(args[argIndex++]);
				// k
				kSkip = Integer.parseInt(args[argIndex++]);
				// NgramCounter
				String ngramFileName = args[argIndex++];
				try {
					BufferedReader br = new BufferedReader(new FileReader(ngramFileName));
					KskipNgramCounter ngramCounter = new KskipNgramCounter(br, kSkip);
					recognizer = new RLSKsNgJ48(j48, ngramCounter);
				} catch(Exception e) {
				}
			} else {
				System.err.println("<recognizer_type> must be j48");
				System.exit(1);
			}

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
