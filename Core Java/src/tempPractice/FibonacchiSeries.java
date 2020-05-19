package tempPractice;
//0 1 1 2 3 5 8 13 21 34 55 89 
public class FibonacchiSeries {
	public static void main(String[] args){
		int num = 15;
		int first = 0;
		int last = 1;
		System.out.print(first+ " ");
		while(num>0){
			System.out.print(last+ " ");
			int temp = first;
			first= last;
			last = first+temp;
			num--;
		}
		
	}
}
