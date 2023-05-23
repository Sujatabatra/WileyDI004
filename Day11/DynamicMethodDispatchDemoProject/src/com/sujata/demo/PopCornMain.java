package com.sujata.demo;


/*
 * Dynamic Method Dispatch :
 * Base class reference variable is type compatible derived class object,
 * and whatever derived class object reference variable will going to hold ,
 * that class version of overridden method will get called from base class reference variable
 */
public class PopCornMain {

	public static void main(String[] args) {
//		PopCorn popCorn=new PopCorn();
//		popCorn.pop();
//		
//		ButterPopCorn popCorn2=new ButterPopCorn();
//		popCorn2.pop();
//		
//		CaramelPopCorn popCorn3=new CaramelPopCorn();
//		popCorn3.pop();

		//base class reference variable
//		PopCorn popCorn;
//		
//		popCorn=new ButterPopCorn();
//		popCorn.pop();
//		
//		popCorn=new CaramelPopCorn();
//		popCorn.pop();
		
		PopCornCart di004cart=new PopCornCart();
		di004cart.setPopCorn(new ButterPopCorn());
		di004cart.buy();
		
		di004cart.setPopCorn(new CaramelPopCorn());
		di004cart.buy();
		
		
	}

}
