package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList is duplicate ordered collection of objects,
		 * collection is auto-growable and auto-shrinkable;
		 * 
		 */
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(34);  //0
		list.add(45);  //1
		list.add(65);   //2
		list.add(90);   //3
		
		System.out.println("Size of List :"+list.size());
		System.out.println(list);

		list.add(56);  //4
		list.add(45);  //5
		System.out.println("Size of List :"+list.size());
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println("Size of List :"+list.size());
		System.out.println(list);

		
		System.out.println("Traversal using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversal using for each loop");
		//for each
		for(Integer element:list) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
