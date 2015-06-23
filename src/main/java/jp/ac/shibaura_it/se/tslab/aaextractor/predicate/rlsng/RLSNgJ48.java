package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.rlsng;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.Recognizer;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.attributes.NgramCounter;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

public class RLSNgJ48 implements Recognizer {
	private J48 recognizer;
	private RLSNgAttributesFactory attrFactory;

	public RLSNgJ48(J48 recognizer, NgramCounter ngramCounter) {
		this.recognizer = recognizer;
		this.attrFactory = new RLSNgAttributesFactory(ngramCounter);
	}

	private Instances getInstances() {
		Attribute rleRateAttr = new Attribute(ARFFAttributes.DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE);
		Attribute linesAttr = new Attribute(ARFFAttributes.NUMBER_OF_LINES_ATTRIBUTE);
		Attribute sizeAttr = new Attribute(ARFFAttributes.TEXT_SIZE_ATTRIBUTE);
		Attribute ngramAttr = new Attribute(ARFFAttributes.NUMBER_OF_NGRAMS_ATTRIBUTE);

		// Create nominal attribute "class" 
		FastVector my_nominal_values = new FastVector(2); 
		my_nominal_values.addElement(ARFFAttributes.ASCIIART_CLASS_NAME); 
		my_nominal_values.addElement(ARFFAttributes.NON_ASCIIART_CLASS_NAME); 
		Attribute className = new Attribute(ARFFAttributes.CLASS_ATTRIBUTE, my_nominal_values);

		FastVector attributes = new FastVector(5);
		attributes.addElement(rleRateAttr);
		attributes.addElement(linesAttr);
		attributes.addElement(sizeAttr);
		attributes.addElement(ngramAttr);
		attributes.addElement(className);

		// Create the empty dataset "textart" with above attributes
		Instances instances = new Instances(ARFFAttributes.RELATION_NAME, attributes, 0);
		instances.setClassIndex(className.index());
		return instances;
	}

	private final int classIndex = 4;

	private boolean isTextartClass(Instances instances, double classValue) {
		String className = instances.classAttribute().value((int)classValue);
		return className.equals(ARFFAttributes.ASCIIART_CLASS_NAME);
	}

	Instance getInstance(RLSNgAttributes attr) {
		double[] data = new double[5];
		data[0] = attr.getR();
		data[1] = attr.getL();
		data[2] = attr.getS();
		data[3] = attr.getNg();
		data[this.classIndex] = 0; // dummy
		Instance instance = new Instance(1.0, data);
		return instance;
	}
	@Override
	public boolean isASCIIArt(Window window) {
		Instances instances = getInstances();
		instances.setClassIndex(this.classIndex);
	
		RLSNgAttributes attr = this.attrFactory.create(window);
		instances.add(getInstance(attr));
		
		try {
			Instance instance = instances.instance(0);
			double pred = this.recognizer.classifyInstance(instance);
			if (isTextartClass(instances, pred)) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
