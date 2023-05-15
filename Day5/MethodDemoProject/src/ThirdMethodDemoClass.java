import java.util.Scanner;

public class ThirdMethodDemoClass {

	public static void main(String[] args) {
		
		int returnSum=sum();
		//Output
		System.out.println("Sum : "+returnSum);

	}
	
	/*
	 * with Return Type and without Arguments
	 * Without Arguments : Input in Calling Method
	 * With Return type : Output in Caller Method
	 */

	public static int sum() {
		Scanner scanner=new Scanner(System.in);
		//input
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		//processing
		int sum=number1+number2;
		
		//return statement is used to return value to the caller method
		return sum;
		
	}
}
