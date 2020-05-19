package intermediate;
import java.util.*;
public class RotationalPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		char[] starr = sc.next().toCharArray();
		int counter=0;
		for(int i=0; i<starr.length; i++){
			if(check_palindrome(starr)){
				break;
			}
			else{
				rotate(starr);
				counter++;
			}
		}
		
		System.out.println("The Given String needs "+counter+" times rotation to become palindrome.");
	}
	
	static boolean check_palindrome(char[] starr){
		
		for(int i=0,j=starr.length-1; i<starr.length/2; i++,j--){
			if(starr[i] != starr[j]){
				return false;
			}
		}
		return true;
	}
	
	static void rotate(char[] ar){
		
		 char temp = ar[0];
         int x=0;
         for(x=0;x<ar.length-1;x++){
                ar[x]=ar[x+1];
         }
         ar[x]=temp;
	}	

}
