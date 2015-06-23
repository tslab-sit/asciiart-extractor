package jp.ac.shibaura_it.se.tslab.aaextractor.predicate.grls;

import jp.ac.shibaura_it.se.tslab.aaextractor.Window;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.ARFFAttributes;
import jp.ac.shibaura_it.se.tslab.aaextractor.predicate.Recognizer;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

public class GRLSJ48 implements Recognizer {
	private J48 recognizer;
	private GRLSAttributesFactory attrFactory;
	public GRLSJ48(J48 recognizer) {
		this.recognizer = recognizer;
		this.attrFactory = new GRLSAttributesFactory();
	}

	private Instances getInstances() {
		Attribute gzipRateAttr = new Attribute(ARFFAttributes.DATA_COMPRESSION_RATE_BY_GZIP_ATTRIBUTE);
		Attribute rleRateAttr = new Attribute(ARFFAttributes.DATA_COMPRESSION_RATE_BY_RLE_ATTRIBUTE);
		Attribute linesAttr = new Attribute(ARFFAttributes.NUMBER_OF_LINES_ATTRIBUTE);
		Attribute sizeAttr = new Attribute(ARFFAttributes.TEXT_SIZE_ATTRIBUTE);

		// Create nominal attribute "class" 
		FastVector my_nominal_values = new FastVector(2); 
		my_nominal_values.addElement(ARFFAttributes.ASCIIART_CLASS_NAME); 
		my_nominal_values.addElement(ARFFAttributes.NON_ASCIIART_CLASS_NAME); 
		Attribute className = new Attribute(ARFFAttributes.CLASS_ATTRIBUTE, my_nominal_values);

		FastVector attributes = new FastVector(5);
		attributes.addElement(gzipRateAttr);
		attributes.addElement(rleRateAttr);
		attributes.addElement(linesAttr);
		attributes.addElement(sizeAttr);
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

	Instance getInstance(GRLSAttributes attr) {
		double[] data = new double[5];
		data[0] = attr.getG();
		data[1] = attr.getR();
		data[2] = attr.getL();
		data[3] = attr.getS();
		data[this.classIndex] = 0; // dummy
		Instance instance = new Instance(1.0, data);
		return instance;
	}
	@Override
	public boolean isASCIIArt(Window window) {
		Instances instances = getInstances();
		instances.setClassIndex(this.classIndex);
	
		GRLSAttributes attr = this.attrFactory.create(window);
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
