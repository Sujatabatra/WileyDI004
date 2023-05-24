package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is unique unordered collection of Objects,
		 * collection is auto-growable and auto-shrinkable
		 */
		HashSet<Integer> collection=new HashSet<Integer>();
		
		collection.add(10);
		collection.add(50);
		collection.add(70);
		collection.add(10);
		collection.add(60);
		
		System.out.println(collection.size());
		System.out.println(collection);
		
		collection.add(78);
		System.out.println(collection.size());
		System.out.println(collection);

		
		collection.remove(50);
		System.out.println(collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
