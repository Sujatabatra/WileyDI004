package com.batra.demo;

import com.sujata.demo.FirstClass;
//import com.sujata.training.FirstClass;

//Different Class and Different package : only public members are visible
public class MyMainClass {

	public static void main(String[] args) {
		FirstClass firstClass1=new FirstClass();
		firstClass1.third();
		
		com.sujata.training.FirstClass firstClass2=new com.sujata.training.FirstClass();
		
		firstClass2.third();

	}

}
