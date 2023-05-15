import java.util.Scanner;

public class SecondMethodDemoClass {

	//Caller
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Input
		System.out.println("Enter First Number : ");
		int num1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=scanner.nextInt();
		//calling method sum
		sum(num1,num2);

	}

	
	/*
	 * without Return Type and with Argument
	 * 
	 * With Arguments : Input in Caller Method
	 * without Return Type : Output in Calling Method
	 */
	//Calling Method
	public static void sum(int number1,int number2) {
		//processing
		int sum=number1+number2;
		
		//output
		System.out.println("Sum of "+number1+" and "+number2+" is "+sum);
	}
}
