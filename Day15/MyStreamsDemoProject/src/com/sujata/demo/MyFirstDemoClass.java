package com.sujata.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstDemoClass {

	
	public static void main(String[] args) {
//		List<Integer> elementList=Arrays.asList(12,67,34,89,90);
		
		List<Integer> elementList=new ArrayList<Integer>();
		elementList.add(12);
		elementList.add(-67);
		elementList.add(-34);
		elementList.add(89);
		elementList.add(90);
		
//		for(int index=0;index<=5;index++) {
//			System.out.println(elementList.get(index));
//		}
		
		elementList.stream().forEach(ele->System.out.println(ele));
		System.out.println("Listing even Elements");
		elementList.stream()
		.filter(element->element%2==0)
		.forEach(ele->System.out.println(ele));
		
		System.out.println("Printing negative values after converting negative value to positive");
		elementList.stream()
		.filter(n->n<0)
		.map(n->n*-1)
		.forEach(n->System.out.println(n));
		

	}

}
