package intermediate;

import java.util.Scanner;

public class FibonacchiRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get Fibonacchi Series :");
		int in_number = sc.nextInt();	
		
		System.out.print("FibonacciSeries : 0 1 ");
		for(int i=2; i<=in_number; i++){
			
		System.out.print(printFibonacchi_recurisvely(i)+" ");
		}
	}

	private static int printFibonacchi_recurisvely(int n) {
		if(n == 1 || n == 2){
	         return 1;
	        }
	        return printFibonacchi_recurisvely(n-1) + printFibonacchi_recurisvely(n-2); //using tail recursion
		
	}

}
