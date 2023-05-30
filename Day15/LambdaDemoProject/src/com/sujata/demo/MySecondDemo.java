package com.sujata.demo;

@FunctionalInterface
interface Calculate{
	
	public long calculate(int no1,int no2);
}
public class MySecondDemo {

	public static void main(String[] args) {
		
//		Calculate sum=(no1,no2)->{
//			return no1+no2;
//		};
		
		Calculate sum=(no1,no2)->no1+no2;
		
		System.out.println(sum.calculate(34, 89));
		
		

	}

}
