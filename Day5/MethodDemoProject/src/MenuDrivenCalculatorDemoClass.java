import java.util.Scanner;

public class MenuDrivenCalculatorDemoClass {

	public static void showMenu() {
		System.out.println("1. Add");
		System.out.println("2. Difference");
		System.out.println("3. Product ");
		System.out.println("4. Division");
		System.out.println("5. Exit");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			showMenu();
			
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			
			performMenu(choice);
		}

	}
	
	public static void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		int number1=0,number2=0;
		if(choice>=1 && choice<=4) {
			System.out.println("Enter First Number : ");
			number1=scanner.nextInt();
			System.out.println("Enter Second Number : ");
			number2=scanner.nextInt();
		}
			
		switch (choice) {
		case 1:
			System.out.println("Sum : "+(number1+number2));
			break;
		case 2:
			System.out.println("Difference : "+(number1-number2));
			break;
		case 3:
			System.out.println("Product : "+(number1*number2));
			break;
		case 4:
			System.out.println("Quotient : "+(number1/number2));
			break;
		case 5:
			System.out.println("Thanks for using our Calculator App");
			System.exit(0);
		default:
			System.out.println("Invalid Choice Entered");
		}
	}

}
