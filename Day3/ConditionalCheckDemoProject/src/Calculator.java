import java.util.Scanner;

public class Calculator {

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
		if(operator.equals("+")) {
			result=number1+number2;
			System.out.println("Addition : "+result);
		}
		else if(operator.equals("-")) {
			result=number1-number2;
			System.out.println("Difference : "+result);
		}
		else if(operator.equals("*")) {
			result=number1*number2;
			System.out.println("Product : "+result);
		}
		else if(operator.equals("/")) {
			result=number1/number2;
			System.out.println("Division Result : "+result);
		}
		else if(operator.equals("%")) {
			result=number1%number2;
			System.out.println("Remainder : "+result);
		}
		else {
			System.out.println("Invalid Operator");
		}

	}

}
