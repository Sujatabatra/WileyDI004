
public class PerfectSquareNumbersClass {

	static int evenPerfectSqaureNumbers;
	
	public static void main(String[] args) {
		int i=100;
		
		System.out.println("TotalPerfect Sqaures : "+calculateCount(i));
		System.out.println("Even Perfect Sqaure : "+evenPerfectSqaureNumbers);

	}
	public static int calculateCount(int i) {
		int perfectSquaresCount=0;
		for(int number=1;number<i;number++) {
			if(isPerfectSquare(number)) {
				perfectSquaresCount++;
				if(number%2==0) {
					evenPerfectSqaureNumbers++;
				}
				
			}
		}
		
		return perfectSquaresCount;
	}

	public static boolean isPerfectSquare(int number) {
		double sqrt=Math.sqrt(number);
		return sqrt-Math.floor(sqrt)==0;
	}
}
