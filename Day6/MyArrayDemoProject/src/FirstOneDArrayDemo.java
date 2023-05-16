import java.util.Scanner;

public class FirstOneDArrayDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Declaring Array
		int ageArray[];
		
		System.out.println("Enter how many persons age you want to store : ");
		int totalPerson=scanner.nextInt();

		//Initializing memory
		ageArray=new int[totalPerson];
		
		for(int index=0;index<totalPerson;index++) {
			System.out.println("Enter "+(index+1)+" Person age : ");
			ageArray[index]=scanner.nextInt();
		}
		
		for(int index=0;index<totalPerson;index++) {
			System.out.println("Age of "+(index+1)+" person : "+ageArray[index]);
		}
		
		

	}

}
