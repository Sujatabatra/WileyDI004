import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day;
		String choice;
		do {
			System.out.println("Enter Day No to display day Name : (1-7)");
			day = scanner.nextInt();
			switch (day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tueday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day Number");
			}

			System.out.println("Do you wish to enter more day number to see day name");
			choice = scanner.next();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Good Bye, Have a Nice Day!");
	}

}
