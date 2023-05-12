
public class MyFirstDemoClass {

	public static void main(String[] args) {
		/*
		 * count =count +1
		 * count=count-1
		 * -------------------------------
		 * pre increment and decrement
		 * while evaluating the expression first increment or decrement will happen
		 * and then expression will be evaluated
		 * ++count
		 * --count
		 * -----------------------------
		 * post increment and decrement
		 * while evaluating the expression first expression gets evaluated
		 * and then increment/decrement will happen
		 * count++
		 * count--
		 */
		
		int value=10;
		int sumValues=20 + ++value;
		System.out.println("sumValues : "+sumValues);

		int count=5;
		int productValue=10*count++;
		System.out.println("productValue : "+productValue);
		System.out.println("Count after increment : "+count);
		
		int x=10;
		System.out.println("x : "+ ++x);
//		System.out.println("x : "+x);
		
	}

}
