import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number of time you want to print text : ");
		int total=scanner.nextInt();
		
		/*
		 * for(initialization;condition;step){
		 * 	statements;
		 * }
		 * 
		 */
		
		for(int count=1;count<=total;count++){// count=count+1
			System.out.println("Wiley!");
		}
	}

}
