package beginner;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int input = sc.nextInt();
		
		int sum=0;
		while(input>0){
			int remainder = input%10;
			sum += remainder;
			input = input/10;
		}
		System.out.println("The sum is:"+sum);

	}

}
