import java.util.Scanner;

public class FirstClassDemo {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome everyone!");

		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		int sum=number1+number2;
		System.out.println("Sum of two numbers : "+sum);
		
		System.out.println("Welcome everyone!");  //redundancy
		
		/*
		 * Redundancy
		 */
		System.out.println("Enter First Number : ");
		int number3=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number4=scanner.nextInt();
		
		int sum1=number3+number4;
		System.out.println("Sum of two numbers : "+sum1);
		
		System.out.println("Demonstrating methods");
		System.out.println("Hope you all will appreciate soon the purpose of methods");
		
		System.out.println("Enter First Number : ");
		int number5=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number6=scanner.nextInt();
		
		int product=number5*number6;
		System.out.println("Product of two numbers : "+product);
		
		/*
		 * Redundancy
		 */
		System.out.println("Enter First Number : ");
		int number7=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number8=scanner.nextInt();
		
		int sum2=number7+number8;
		System.out.println("Sum of two numbers : "+sum2);
		
	}

}
