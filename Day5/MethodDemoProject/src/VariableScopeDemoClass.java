
/*
 * Block is the group of statement clubbed together in {....}
 * Scope of the variable is inside the block where variable is being declared 
 * within the same block we cannot declare two variables with same name
 */
public class VariableScopeDemoClass {

	public static void main(String[] args) {
		
		int x=10;
		System.out.println("x : "+x);
		//block
		{
			int y=20;
			x=30;
			System.out.println("y : "+y);
			System.out.println("x : "+x);
		}
		System.out.println("x : "+x);
//		System.out.println("y : "+y);
		
	}

}
