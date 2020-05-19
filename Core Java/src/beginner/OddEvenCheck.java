package beginner;
import java.util.*;
public class OddEvenCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int number = sc.nextInt();
			// Using Modulus operator
			System.out.println("number%2 : "+ number%2);
			//Using division operator
			System.out.println("(number/2)*2 : " +(number/2)*2);
			//Using right shift operator
			System.out.println("(number >> 1) <<1 : "+ ((number >> 1) <<1)); // For even it will always return same number
			
			//Using Bitwise operator
			System.out.println("number&1 : "+ (number&1)); // For even number it will be 0
	}

}
