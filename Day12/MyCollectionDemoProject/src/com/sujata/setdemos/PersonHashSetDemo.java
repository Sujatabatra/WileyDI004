package com.sujata.setdemos;

import java.util.HashSet;

import com.sujata.generics.Person;

public class PersonHashSetDemo {

	public static void main(String[] args) {
		HashSet<Person> personList=new HashSet<Person>();
		
		personList.add(new Person(101, "AAAA"));
		personList.add(new Person(102, "BBBB"));
		personList.add(new Person(101, "AAAA"));
		personList.add(new Person(103, "CCCC"));
		personList.add(new Person(104, "DDDD"));
		
		for(Person person:personList) {
			System.out.println(person);
		}
		

	}

}
