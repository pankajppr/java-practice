package intermediate;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=1293;
			
		System.out.println(getSumOfDigits(number));

	}
	static int sum = 0;
	private static int getSumOfDigits(int number) {
			if(number==0){
				return sum;
			}			
			else{							
				sum= sum + number%10;
				getSumOfDigits(number/10);
			}
			
		return sum;
	}

}
