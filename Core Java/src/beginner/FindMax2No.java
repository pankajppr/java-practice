package beginner;
//Find two maximum numbers in array in one iteration
public class FindMax2No {


	public static void main(String[] args) {
		int[] array = { 66, 7, 9, 70, 89, 11, 2, 93 };
		int max=0;
		int second_max = 0;
		for(int val:array){
			if(val>max){
				second_max=max;
				max=val;
			}
			else if(val>second_max){
				second_max=val;
			}
			
		}
		System.out.println("Max:"+max+" Second Max:"+second_max);
	}

}
