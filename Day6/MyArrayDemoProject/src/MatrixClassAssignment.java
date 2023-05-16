import java.util.Scanner;

public class MatrixClassAssignment {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rows,cols;
		//accept rows and cols from user
		System.out.println("Enter Number of rows : ");
		rows=scanner.nextInt();
		System.out.println("Enter Number of columns : ");
		cols=scanner.nextInt();
		
		int matrix1[][]=inputMatrix(rows, cols);
		int matrix2[][]=inputMatrix(rows, cols);
		
		int sum[][]=sumMatrix(matrix1,matrix2,rows,cols);
		
		System.out.println("Matrix 1: ");
		displayMatrix(matrix1, rows, cols);
		
		System.out.println("Matrix 2: ");
		displayMatrix(matrix2, rows, cols);
		
		System.out.println("Sum of Matrix1 and Matrix 2 : ");
		displayMatrix(sum, rows, cols);
		
	}
	
	//Modularize input values into matrix
	public static int[][] inputMatrix(int rows,int cols){
		int matrix[][]=new int[rows][cols];
		Scanner scanner=new Scanner(System.in);
		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < cols; col++) {
				System.out.print("Enter Element at location :[" + row + "][" + col + "] : ");
				matrix[row][col] = scanner.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] sumMatrix(int[][] matrix1,int[][] matrix2,int rows,int cols) {
		int sum[][]=new int[rows][cols];
		
		//logic for adding two matrix
		
		return sum;
	}
	
	public static void displayMatrix(int[][] matrix,int rows,int cols) {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(matrix[row][col]+"\t");
			}
			System.out.println("");
		}
	}

}
