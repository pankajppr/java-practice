package tempPractice;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = null;
		System.out.println("Enter String to be reversed: ");
		input = sc.next();
		
		//Using toCharArray
		int stringLength = input.length();
		//char[] charArray = new char[stringLength];
		char[] charArray = input.toCharArray();
		for(int i=0, j= stringLength-1; i<stringLength/2; i++, j--){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		String reverseString = new String(charArray);
		
		//using recursion
		reverseString = printRecursively(input);
		System.out.println("Reversed String: "+ reverseString);
		
	}

	private static String printRecursively(String input) {
		int length = input.length();
		if(length<=1) return input;
		return input.charAt(length-1)+printRecursively(input.substring(1, length-1))+input.charAt(0);
	}
}
