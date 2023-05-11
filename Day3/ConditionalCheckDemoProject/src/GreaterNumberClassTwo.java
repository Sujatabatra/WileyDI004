import java.util.Scanner;

public class GreaterNumberClassTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		System.out.println("Enter First Number : ");
		number1 = scanner.nextInt();
//		number1=Integer.parseInt(scanner.next());
		System.out.println("Enter Second Number : ");
		number2 = scanner.nextInt();
		/*
		 * Conditional Check if...else
		 * 
		 * switch.... case
		 * 
		 * Synatx of if...else if(condition){ statements; //if condition is true } else{
		 * statements; //if condition is false }
		 * 
		 */

		if (number1 > number2)
			System.out.println(number1 + " is greater");
		else if (number1 == number2)
			System.out.println("Both " + number1 + " and " + number2 + " are equal");
		else
			System.out.println(number2 + " is greater");

	}

}
