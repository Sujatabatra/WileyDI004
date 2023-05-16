import java.util.Scanner;

public class FirstTwoDArrayDemo {

	public static void main(String[] args) {
		int matrix[][];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No of Rows in a Matrix : ");
		int rows = scanner.nextInt();
		System.out.println("Enter No of Columns in a Matrix : ");
		int cols = scanner.nextInt();

		matrix = new int[rows][cols];

		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < cols; col++) {
				System.out.print("Enter Element at location :[" + row + "][" + col + "] : ");
				matrix[row][col] = scanner.nextInt();
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(matrix[row][col]+"\t");
			}
			System.out.println("");
		}

	}

}
