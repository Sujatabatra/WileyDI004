package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySecondDemoClass {

	public static void main(String[] args) {
		List<String> collection=Arrays.asList("Zara","Sujata","Rosie","Lilly","Jessica","Allie");
		
		collection.stream()
		.filter(name-> name.length()>=6)  //predicate
		.forEach(name->System.out.println(name));  //Consumer

		collection.stream()
		.filter(name-> name.length()>=6)  //predicate
		.map(name->name.toLowerCase())
		.forEach(name->System.out.println(name));  //Consumer (terminate)
		
		List<String> finalList=collection.stream()
		.filter(name-> name.length()>=6)  //intermediate function
		.map(name->name.toLowerCase())   //intermediate
		.collect(Collectors.toList());    //terminate function
		
		System.out.println(finalList);
		
		
		long totalCount=collection.stream()
		.filter(name-> name.length()>=6)  //intermediate function
		.count(); //terminate function
		
		System.out.println("Total Number of names with length more than 5 characters "+totalCount);
		
	}

}
