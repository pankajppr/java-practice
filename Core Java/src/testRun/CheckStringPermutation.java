package testRun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckStringPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		//boolean result = checkPermutation(str1, str2);
		//boolean result = checkPermutationArrays(str1, str2);
		boolean result = checkPermutationIntArray(str1, str2);
		System.out.println(str1 +" and "+ str2 +" are perutation of each other: "+ result);

	}
	/**
	 * In this method we can use int array of size 128 and then we can add the contents
	 * and update the count of characters at that position
	 * Note the assumption below. In your interview, you should always check with your interviewer about the 
	 * size of the character set. We assumed that the character set was ASCII.
	 */
	private static boolean checkPermutationIntArray(String s1, String s2){
		//check the basic conditon

		if(s1.length() != s2.length()) return false;
		
		int[] intArr = new int[128];
		for(int i=0; i<s1.length();i++) 
			intArr[s1.charAt(i)]++;
		for(int i=0; i<s2.length(); i++){
			int c = s2.charAt(i);
			if(intArr[c] <= 0)
				return false;
			intArr[c]--;
		}
		return true;
	}
	/**
	 * In this method we will use Arrays.sort to sort both the strings
	 * The we can compare the strings for equality
	 */
	private static boolean checkPermutationArrays(String s1, String s2){
		char[] sortedArrayS1 = s1.toCharArray();
		Arrays.sort(sortedArrayS1);
		List list = new ArrayList();
		String sortedS1 = String.valueOf(sortedArrayS1);
		char[] sortedArrayS2 = s2.toCharArray();
		Arrays.sort(sortedArrayS2);
		String sortedS2 = String.valueOf(sortedArrayS2);
		return sortedS1.equals(sortedS2);
	}

	private static boolean checkPermutation(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2) return false;
		for(int i = 0 ; i<len1; i++){
			
			int index = str1.indexOf(str2.charAt(i));
			if(index>=0){
				
			}
			else return false;
		}
		if(checkPermutation(str2,str1))
		return true;
		return false;
	}

}
