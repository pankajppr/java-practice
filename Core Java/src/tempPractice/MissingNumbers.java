package tempPractice;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] array = {3,5,8,9,10,15};
		int missing = 1;
		for(int val : array){
			int found = val;			
			if(missing != val){
				while(missing < found){
					System.out.print(missing+" ");
					missing++;			
				}
			}
			missing++;
			found = val;
		}
	}
}
