package manhattan.first;
//WAP to find fabnocci series using recursion.
import java.util.Scanner;

public class FibonacchiRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit range:");
		int limit = sc.nextInt();
		sc.close();
		int first =0, second=1;
		System.out.print(first+","+second+",");
		fibonacchiRecursively(first, second, limit);
	}
	static void fibonacchiRecursively(int first, int second, int limit){
		if(limit>0){
			int temp = first+second;
			System.out.print(temp+",");
			first = second;
			second = temp;
			fibonacchiRecursively(first, second, --limit);
		}
		
	}

}
