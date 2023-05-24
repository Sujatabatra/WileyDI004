package com.sujata.mapdemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * HashMap is the unordered collection of Key-Value Pairs,
		 * where Key are unique and value can be duplicated,
		 * unordering w.r.t,Keys.
		 */
		HashMap<String, Integer> months=new HashMap<String, Integer>();

		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		
		System.out.println("Size of months hashmap: "+months.size());
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		
		for(String monthName:monthsName) {
			System.out.println(monthName+" contains "+months.get(monthName)+" days!");
		}
		
		Collection<Integer> days=months.values();
		System.out.println(days);
		
	}

}
