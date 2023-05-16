import java.util.Scanner;

public class SecondOneDArrayDemo {

	public static void main(String args[]) {
		int intValues[] = new int[10];

		Scanner scanner = new Scanner(System.in);
		for (int index = 0; index < 10; index++) {
			System.out.println("Enter " + (index + 1) + " value : ");
			intValues[index] = scanner.nextInt();
		}

		int totalEven = 0;
		int totalOdd = 0;
		for (int index = 0; index < 10; index++) {
			if (checkEven(intValues[index])) { 
				totalEven++;
			} else {
				totalOdd++;
			}
		}
		
		System.out.println("Total No of Even elements in an array : "+totalEven);
		System.out.println("Total No of Odd elements in an array : "+totalOdd);
		

	}

	public static boolean checkEven(int number) {
		return number % 2 == 0;
	}
}
