package beginner;
//if input is: 1110 output is 14, 1111 : 15
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number:");
		int binary = sc.nextInt();
		
		int power=0;
		int decimal = 0;
		while(binary>0){
			int remainder = binary%10;
			
			if(remainder == 0 || remainder == 1){
				binary=binary/10;
				decimal+=remainder*(int) Math.pow(2, power++);
			}			
			else{
				System.out.println("Not A Binary Number");
				System.exit(0);
			}
		}
		System.out.println("Decimal is:"+decimal);

	}

}
