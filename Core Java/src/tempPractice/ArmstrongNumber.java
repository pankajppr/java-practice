package tempPractice;

import java.util.Scanner;

public class ArmstrongNumber {
	//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuber to verify Armstrong:");
		int number = sc.nextInt();
		boolean isArmstrong = checkArmstrong(number);
		System.out.println(isArmstrong);
		
		try{
			System.out.println("from try");
		}
		finally{
			System.out.println("finally can be used without catch");
		}
	}

	private static boolean checkArmstrong(int number) {
		int sum = 0;
		int tempNumb = number;
		while(tempNumb>0){
			sum = sum+  (int)Math.pow(tempNumb%10, 3);
			tempNumb = tempNumb/10;
		}
		if(sum == number) return true;
		return false;
	}
}
