package com.sujata.misc;

import com.sujata.generics.Person;

public class EqualityCheckDemoClass {

	public static void main(String[] args) {
		int i=10,j=10;
		
		if(i==j)
			System.out.println("i and j are equal");
		else
			System.out.println("i and j are not equal");
		

		Person p1=new Person(101, "AAAA");
		Person p2=new Person(101, "AAAA");
		/*
		 * == will check whether both refrence variables referencing to same memory on heap or not
		 */
		if(p1==p2)
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
	}

}
