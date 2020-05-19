package beginner;
import java.util.Scanner;
//0 1 1 2 3 5 8 13 21 34 55 89 
public class FibonacchiSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get Fibonacchi Series :");
		int in_number = sc.nextInt();		
		print_fibonacchi(in_number);	

	}
	
	static void print_fibonacchi(int number){
		int first=0;
		int second=1;
		int temp;
		System.out.print(first+" "+second+" ");
		for(int i=0; i<number; i++){
		    temp = first+second;
			first = second;
			second = temp;
			System.out.print(temp+ " ");
		}
		
	}

}
