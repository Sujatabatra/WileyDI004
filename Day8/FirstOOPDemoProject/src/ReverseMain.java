import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		
		ReverseNumber reverseNum=new ReverseNumber();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num=scanner.nextInt();
		
		reverseNum.setNumber(num);
		
		System.out.println("Reverse Number of "+num+" is "+reverseNum.getReverse());

	}

}
