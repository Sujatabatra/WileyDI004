import java.util.Scanner;

public class ThirdTwoDArrayDemoProject {

	public static void main(String args[]) {
		int arr[][];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Total No of rows : ");
		int rows=scanner.nextInt();
		
		arr=new int[rows][];
		
		for(int row=0;row<rows;row++) {
			System.out.println("Enter No of Columns for row "+(row+1));
			int cols=scanner.nextInt();
			
			arr[row]=new int[cols];
			
			for(int col=0;col<cols;col++) {
				System.out.println("Enter element at ["+row+"]["+col+"] location : ");
				arr[row][col]=scanner.nextInt();
			}
		}
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println("");
		}
	}
}
