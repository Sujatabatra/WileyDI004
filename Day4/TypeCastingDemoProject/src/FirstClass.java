
public class FirstClass {

	public static void main(String[] args) {
		byte dog=10;
		
		long elephant;
		
		elephant=dog;
		System.out.println("dog : "+dog);
		System.out.println("elephant : "+elephant);
		
		long elephant2=135;
		
		byte dog2; //127 to 128
		dog2=(byte)elephant2;
		System.out.println("elephant2 : "+elephant2);
		System.out.println("dog2 : "+dog2);
		
		

	}

}
