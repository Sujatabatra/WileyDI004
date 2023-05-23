package com.sujata.demo;


/*
 * Dynamic Method Dispatch :
 * Base class reference variable is type compatible derived class object,
 * and whatever derived class object reference variable will going to hold ,
 * that class version of overridden method will get called from base class reference variable
 */
public class PopCornMain {

	public static void main(String[] args) {
		PopCorn popCorn;
		
		PopCornCart di004cart=new PopCornCart();
		
		popCorn=new ButterPopCorn(6, "Butter PopCorn", 2);
		/*
		 * With Parent Class Reference variable,
		 * we can only call the functionality coming from parent,
		 * we can't call the extended functionality of child with parent reference variable;
		 */
//		popCorn.setButterQuanttity(4);
		di004cart.setPopCorn(popCorn);
		di004cart.buy();
		
		
		
	}

}
