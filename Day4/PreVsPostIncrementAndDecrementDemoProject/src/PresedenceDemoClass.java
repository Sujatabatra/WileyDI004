
public class PresedenceDemoClass {

	public static void main(String[] args) {
		/*
		 *,/,% : higher precedence than +, -
		 */
		int result=10+5*2;
		System.out.println("result : "+result); // 20
		
		result=(10+5)*2;
		System.out.println("result : "+result); //30
		
		result=++result+5*2;
	
		System.out.println("result : "+result);
		
		
		int count=10;
		result=++count + count--;
//		         11    +   11
		System.out.println("result : "+result);//22
		System.out.println("count : "+count); //10
		
		
		int value=5;
		
		result= --value + --value * --value + value++;
//		           4    +   3     *   2     +   2
		System.out.println("result : "+result);  //12
		System.out.println("value : "+value); //3
		

	}

}
