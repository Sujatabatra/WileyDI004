import java.util.Scanner;

/*
 * returntype methodName(argumentlist){
 * 	statements;
 * }
 */
public class FirstMethodDemoClass {

	public static void main(String[] args) {
		//caller method
		sumTwoNumbers();
		
		sumTwoNumbers();
		
		System.out.println("Again doing some of two number");
		sumTwoNumbers();

	}

	//calling
	/*
	 * without return type and without argument
	 * without argument : Input in calling method
	 * without return type : Output in calling method
	 */
	public static void sumTwoNumbers() {
		Scanner scanner=new Scanner(System.in);
		//Input
		System.out.println("Enter First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber=scanner.nextInt();
		
		//processing
		int sum=firstNumber+secondNumber;
		
		//Output
		System.out.println("Sum of "+firstNumber+" and "+secondNumber+" = "+sum);
	}
}
