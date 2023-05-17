import java.util.Scanner;

public class MySecondDemoClass {

	public static void main(String[] args) {
		
		
		final int VALUE2=20;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Value1 : ");
		final int VALUE1=scanner.nextInt(); //for explanation assume VALUE1=10

		System.out.println("value1 : "+VALUE1);
//		value1++;
		
		swap(VALUE1,VALUE2);
		
	}
	
	public static void swap(/*final*/ int VALUE1,/*final*/ int VALUE2) {
		int temp=VALUE1;
		VALUE1=VALUE2;
		VALUE2=temp;
		
	}

}
