package beginner;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be reversed:");
		int in_number = sc.nextInt();
		
		int rev_number = reverse_number(in_number);
		System.out.println("Reversed Number is: "+ rev_number);

	}
	
	static int reverse_number(int input){
		
		int reverse=0;
		int remainder;
		while(input>0){
			remainder = input%10;
			input=input/10;
			reverse = reverse*10+remainder;
		}
		return reverse;
	}

}
