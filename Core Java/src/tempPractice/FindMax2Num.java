package tempPractice;
//Find two maximum numbers in array in one iteration
public class FindMax2Num {
	public static void main(String[] args){
		int[] array = { 66, 7, 9, 70, 89, 11, 2, 93 };
		int max = 0, secondMax=0;
		for(int val: array){
			if(val>max){
				secondMax = val;
				val = max + secondMax;
				secondMax = val - secondMax;
				max = val -  secondMax;
			}
			else if(val > secondMax){
				secondMax = val;
			}			
		}
		System.out.println("Max: "+max+ " SecondMax: "+secondMax);
	}
}
