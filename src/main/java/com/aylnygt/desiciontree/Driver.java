package com.aylnygt.desiciontree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Driver {
	static String[][]KAZA= {  {"il","havadurumu","aracsayisi","cinsi","gun","risk"},

			{"0","true","2","1","1","1"},
			{"0","true","1","1","4","1"},
			{"0","true","1","1","1","1"},
			{"0","true","2","1","7","1"},
			{"0","true","1","1","5","1"},
			{"0","true","1","1","5","1"},
			{"0","true","1","1","4","1"},
			{"0","true","2","1","5","1"},
			{"0","true","2","1","5","1"},
			{"1","false","2","1","4","1"},
			{"0","true","2","1","5","1"},
			{"0","false","1","1","2","1"},
			{"0","true","2","1","4","1"},
			{"0","true","2","1","5","1"},
			{"0","true","3","1","2","1"},
			{"0","true","2","1","2","1"},
			{"0","true","3","1","1","1"},
			{"0","true","3","1","5","1"},
			{"0","false","2","1","5","1"},
			{"1","true","3","1","5","0"},
			{"1","true","2","1","2","0"},
			{"1","true","2","0","2","0"},
			{"0","true","3","1","3","0"},
			{"0","true","2","1","5","1"},
			{"0","false","2","1","6","1"},
			{"0","true","1","1","6","1"},
			{"1","false","1","1","4","1"},
			{"0","true","1","1","4","1"},
			{"1","true","1","1","4","1"},
			{"0","true","1","1","4","1"},
			{"0","false","2","1","3","1"},
			{"0","true","1","1","2","1"},
			{"0","true","2","1","6","1"},
			{"0","true","1","1","5","1"},
			{"0","true","1","1","4","1"},	
			{"0","false","2","0","3","0"}};

	
	public static void main(String[] args) {
		Driver driver=new Driver();
		HashMap<String, String[][]> datas=new HashMap<String ,String[][]>();
		datas.put("KAZA",KAZA);
		datas.keySet().forEach(data ->{
		HashMap<Feature ,Double> featuresInfoGain = new HashMap<Feature ,Double>();
		DataSet dataSet=new DataSet(datas.get(data));
		IntStream.range(0, datas.get(data)[0].length-1).forEach(column ->{
			Feature feature=new Feature(datas.get(data),column);
			ArrayList<DataSet>dataSets =new ArrayList<DataSet>();	
			feature.getValues().stream().forEach(featureValue ->
			    dataSets.add(driver.createDataSet(featureValue, column,datas.get(data))));
			double summation = 0;
			for(int i=0;i < dataSets.size();i++)
				summation +=((double)(dataSets.get(i).getData().length -1)/(datas.get(data).length -1))*dataSets.get(i).getEntropy();
			featuresInfoGain.put(feature,dataSet.getEntropy()-summation);
			  
			
		  });	 
		  System.out.println("<"+data+" DATASET>:\n"+ dataSet);
		  System.out.println(driver.generateInfoGainDisplayTable(featuresInfoGain));
		  System.out.println("Best feature to split on is" +driver.determineSplitOnFeature(featuresInfoGain)+"\n");
		  System.out.println("\n\n");
		});	
	}
	
	DataSet createDataSet(FeatureValue featureValue,int column ,String[][] data) {
		String[][] returnData =new String[featureValue.getOccurences()+1][data[0].length];
		returnData[0] = data[0];
		int counter=1;
		for(int row = 1;row < data.length ;row++)
			if(data[row][column]==featureValue.getName()) returnData[counter++] =data[row];
		return new DataSet(deleteColumn(returnData,column));
	}
	
	Feature determineSplitOnFeature(HashMap<Feature ,Double>featuresInfoGain) {
		Feature splitOnFeature =null;
		Iterator<Feature> iterator =featuresInfoGain.keySet().iterator();
		while(iterator.hasNext()) {
			Feature feature=iterator.next();
			if(splitOnFeature==null)splitOnFeature =feature;
			if(featuresInfoGain.get(splitOnFeature) < featuresInfoGain .get(feature)) splitOnFeature=feature;	
		}
		return splitOnFeature;
	}
	
	
	StringBuffer generateInfoGainDisplayTable(HashMap<Feature ,Double> featuresInfoGain) {
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer .append("Feature         Information Gain\n");
		IntStream.range(0,38).forEach(i ->stringBuffer.append("-"));
		stringBuffer.append("\n");
		Iterator<Feature>iterator =featuresInfoGain.keySet().iterator();
		while(iterator.hasNext()) {
			Feature feature= iterator.next();
			stringBuffer.append(feature);
			IntStream.range(0,20 - feature.getName().length()).forEach(i -> stringBuffer.append(" "));
			stringBuffer.append(String.format("%.8f",featuresInfoGain.get(feature))+"\n");	
		}
		return stringBuffer;	
	}
	
	
	String[][] deleteColumn(String[][] data,int deleteColumn){
		String returnData[][]= new String[data.length][data[0].length - 1];
		for(int row=0;row<data.length;row++) {
			int columnCounter=0;
			for(int column=0;column<data[0].length;column++)
				if(column !=deleteColumn) returnData[row][columnCounter++]=data[row][column];
		}
		return returnData;
	}
	         
}


