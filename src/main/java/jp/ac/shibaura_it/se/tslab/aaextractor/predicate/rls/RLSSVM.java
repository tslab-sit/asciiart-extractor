package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rls;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.Recognizer;
import libsvm.svm;
import libsvm.svm_model;
import libsvm.svm_node;

public class RLSSVM implements Recognizer {
	private svm_model model;
	private RLSAttributesFactory attrFactory;

	public RLSSVM(svm_model model) {
		this.model = model;
		this.attrFactory = new RLSAttributesFactory();
	}

	@Override
	public boolean isASCIIArt(Window window) {
		RLSAttributes attrs = this.attrFactory.create(window);
		// 判別対象にしたいデータ
		svm_node[] input = new svm_node[3];
		input[0] = new svm_node();
		input[1] = new svm_node();
		input[2] = new svm_node();

		// ラベルをセット
		input[0].index = 1;
		input[1].index = 2;
		input[2].index = 3;

		// 値をセット
		input[0].value = attrs.getR();
		input[1].value = attrs.getL();
		input[2].value = attrs.getS();

		//判別の実行
		double[] prob_estinmates = new double[2]; // two classes of "1" and "-1"
		svm.svm_predict_probability(model, input, prob_estinmates);
		return prob_estinmates[0] >= 0.5;
	}

}
