import java.util.Scanner;

public class SumSeriesDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of n to calculate Sum of Series");
		int n=scanner.nextInt();
		
		double resultSumSeries=sumSeries(n);
		System.out.println("Sum of Series : "+resultSumSeries);
		

	}
	
	public static double sumSeries(int n) {
		double sumSer=0;
		
		for(int counter=1;counter<=n;counter++) {
			long factorial=factorial(counter);
			double divideResult=divide(factorial, counter);
			sumSer=sum(sumSer,divideResult);
			System.out.print(factorial+"/"+counter+"+");
		}
		return sumSer;
	}
	
	public static double sum(double number1,double number2) {
		return number1+number2;
	}
	
	public static double divide(long number1,int number2) {
		return number1/number2;
	}
	
	public static long factorial(int number) {
		long factorial=1;
		while(number>1)
			factorial*=number--;
		return factorial;
			
	}
	
	

}
