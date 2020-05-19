package beginner;

import java.util.Scanner;

public class ArmstrongNumber {
//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get Armstrong Number :");
		int in_number = sc.nextInt();
		
		System.out.println("Given number is Armstrong no? "+checkArmstrong(in_number));
	}
	
	static boolean checkArmstrong(int number){
		int temp = number;
		int sum=0;
		int remainder;
		while(temp>0){
			remainder=temp%10;
			sum += remainder*remainder*remainder;
			temp=temp/10;
		}
		
		if(sum==number){
			return true;
		}
		else return false;
	}

}
