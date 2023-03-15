package com.aylnygt.classify;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


import weka.classifiers.trees.J48;
import weka.core.Instances;

public class Classify {
	public static void main(String[] args) throws Exception{
	    BufferedReader breader=null;
	    breader=new BufferedReader(new FileReader("src/main/resources/kaza.arff"));
	    Instances train=new Instances(breader);
	    train.setClassIndex(train.numAttributes() -1 );
	    
	    breader=new BufferedReader(new FileReader("src/main/resources/kaza1.arff"));
	    Instances test=new Instances(breader);
	    test.setClassIndex(train.numAttributes() -1);
	    
	    breader.close();
	    
	    J48 tree=new J48();
	    tree.buildClassifier(train);
	    Instances labeled=new Instances(test);
	    
	    //label instances
	    for(int i=0;i<test.numInstances();i++)
	    {
	    	double clsLabel=tree.classifyInstance(test.instance(i));
	    	labeled.instance(i).setClassValue(clsLabel);
	    }
	    
	    //save label data
	    BufferedWriter writer=new BufferedWriter(
	    		new FileWriter("src/main/resources/prediction.arff"));
	    writer.write(labeled.toString());
	    
	    writer.newLine (); 
	    writer.flush (); 
	    writer.close ();
	    
	    
	    FileReader fileReader = new FileReader("src/main/resources/prediction.arff");
	    String line;

	    BufferedReader br = new BufferedReader(fileReader);

	    while ((line = br.readLine()) != null) {

	        System.out.println(line);

	    }

	    br.close();
	    
	    
	    
	    
	    
	   }

	}
