package beginner;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int input = sc.nextInt();
		
		String binary = "";
		int remainder;
		
		while(input>0){
			remainder = input%2;
			input = input/2;
			binary = remainder+binary;
		}
		System.out.println("Binary is:"+binary);

	}

}

