import java.util.Scanner;

public class ReverseNumber {

	static int number,reverse;
	static Scanner scanner=new Scanner(System.in);
	
	public static void inputNumber(int num) {
		number=num;
	}
	
	public static void calculateReverse() {
		while(number!=0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
	}
	
	public static void displayReverse() {
		System.out.println("Reverse of "+number+" is "+reverse);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		int num=scanner.nextInt();
		
		inputNumber(num);
		
		calculateReverse();
		
		displayReverse();
		

	}

}
