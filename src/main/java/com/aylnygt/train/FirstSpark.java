package com.aylnygt.train;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class FirstSpark {


	public static void main(String[] args) {
		
		//Setup configuration
		String appName = "V2 Maestros";
		String sparkMaster = "local[2]";
		//String sparkMaster = "spark://169.254.86.212:7077";

		JavaSparkContext spContext = null;
	
		SparkConf conf = new SparkConf()
				.setAppName(appName)
				.setMaster(sparkMaster);
		
		//Create Spark Context from configuration
		spContext = new JavaSparkContext(conf);
		
		//Read a file into an RDD
		JavaRDD<String> tweetsRDD = spContext.textFile("data/kaza.csv");
		
		//Print first five lines
		for ( String s : tweetsRDD.take(5)) {
			System.out.println(s);
		}
		
		//Print count.
		System.out.println("Total tweets in file : " + tweetsRDD.count());
		
		/*
		//Convert to upper case
		JavaRDD<String> ucRDD = tweetsRDD.map( str -> str.toUpperCase());
		//Print upper case lines
		for ( String s : ucRDD.take(5)) {
			System.out.println(s);
		}*/
		
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	}

}