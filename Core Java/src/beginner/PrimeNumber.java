package beginner;
import java.util.*;
//A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
//A natural number greater than 1 that is not a prime number is called a composite number.
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = sc.nextInt();
		boolean flag = true;
		if(input == 1){System.out.println("The Number is Not Prime"); System.exit(0);}
		for(int i=2; i<input; i++){
			if(input%i == 0){
				flag = false;
				break;
			}			
		}
		System.out.println("The Number is Prime:"+flag);
	}

}
