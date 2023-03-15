package com.aylnygt.desiciontree;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Feature {
	private String name = null;
	private HashSet<FeatureValue> values = new HashSet<FeatureValue>();
	public Feature(String[][] data,int column) {
		this.setName(data[0][column]);
		IntStream.range(1,data.length).forEach(row->values.add(new FeatureValue(data[row][column])));
		values.stream().forEach(featureValue->{
			int counter=0;
			for(int row = 1; row<data.length;row++)
				if(featureValue.getName() == data[row][column]) featureValue.setOccurences(++counter);
				
		});
		
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public HashSet<FeatureValue> getValues() {return values;}
	public String toString( ) {return name;}

}
