import java.util.Scanner; 

public class MyFirstDemoClass {

	/*final*/ static int number=0;
//	number=95;  //Statement
	static long reverse=0L;
	static Scanner scanner;
	
	
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
		inputNumber();
		reverseNumber();
		displayReverse();

	}
	
	public static void inputNumber() {	
//		Scanner scanner=new Scanner(System.in);
		scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		number=scanner.nextInt();
		
	}

	public static void reverseNumber() {

//		while(number>0) {
//			reverse=reverse*10+number%10;
//			number=number/10;
//		}
		int num=number;
		while(num>0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		
	}
	
	public static void displayReverse() {
		System.out.println("Reverse of "+number+" = "+reverse);
	}
	
}
