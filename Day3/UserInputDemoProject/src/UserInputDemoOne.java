import java.util.Scanner;

/*
 * Area of Rectangle = length of Rectangle * breadth of reactangle
 */
public class UserInputDemoOne {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle : ");
		int length=scanner.nextInt();
		
		System.out.println("Enter Breadth of Rectangle : ");
		int breadth=scanner.nextInt();
		
		int area=length*breadth;
		
		System.out.println("Area of Rectangle : "+area);

	}

}
