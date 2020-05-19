package intermediate;

import java.util.Scanner;

public class PalindromeRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");		
		String inputString = sc.next();
		System.out.println(checkPalindrome(inputString)?inputString+ " is a palindrome." :  inputString+ "is not a palindrome.");

	}

	private static boolean checkPalindrome(String inputString) {
		
		if(inputString.length()==0 || inputString.length()==1){
			return true;
		}
		if(inputString.charAt(0)==inputString.charAt(inputString.length()-1)){
			return checkPalindrome(inputString.substring(1, inputString.length()-1));
		}
		return false;
	}

}
