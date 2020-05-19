package manhattan.first;

public class SumRecursive {

	public static void main(String[] args) {

		int sum = getSumRecursive(12034, 0);
		System.out.println(sum);

	}
	static int getSumRecursive(int number, int sum){
		if(number == 0){
			return sum;
		}
		else{
			sum = sum + number%10;
			number = number/10;
			return getSumRecursive(number, sum);
		}
	}

}
