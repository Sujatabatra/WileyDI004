import java.util.Scanner;

public class FourthMethodDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Input
		System.out.println("Enter First Number : ");
		int num1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=scanner.nextInt();
		
		//Calling method 
		int returnSum=sum(num1,num2);
		
		//Output
		System.out.println("Sum : "+returnSum);
		

	}
	
	/*
	 * with argument : Input in caller Method
	 * with Returntype : Output in caller Method
	 */
	
	public static int sum(int number1,int number2) {
		//processing
		int sum=number1+number2;
		
		return sum;
	}

}
