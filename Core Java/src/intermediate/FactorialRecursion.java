package intermediate;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String ...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");		
		int input = sc.nextInt();
		System.out.println("Factorial Using Recursion: "+getFactorial(input));
		
		
	}

	private static int getFactorial(int input) {
		if(input==0){
			return 1;
		}
		else return input*getFactorial(input-1);
		
		
	}
}
