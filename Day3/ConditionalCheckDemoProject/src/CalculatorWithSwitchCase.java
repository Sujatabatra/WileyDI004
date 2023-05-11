import java.util.Scanner;

public class CalculatorWithSwitchCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number1,number2;
		int result=0;
		System.out.println("Enter first number : ");
		number1=scanner.nextInt();
		System.out.println("Enter second number : ");
		number2=scanner.nextInt();
		System.out.println("Enter Operator");
		String operator=scanner.next();
		/*
		 * switch(variable){
		 * case value1:
		 * 	statements;
		 * case value2:
		 * 	statements;
		 * .
		 * .
		 * .
		 * case valuen:
		 * 	statements;
		 * default:
		 * 	statements;
		 * }
		 */
		
		switch(operator) {
		case "+":
			result=number1+number2;
			System.out.println("Addition : "+result);
			break;
		case "-":
			result=number1-number2;
			System.out.println("Difference : "+result);
			break;
		case "*":
			result=number1*number2;
			System.out.println("Product : "+result);
			break;
		case "/":
			result=number1/number2;
			System.out.println("Division Result : "+result);
			break;
		case "%":
			result=number1%number2;
			System.out.println("Remainder : "+result);
			break;
		default:
			System.out.println("invalid operator");
		}
		
		System.out.println("Good Bye from main method");

	}

}
