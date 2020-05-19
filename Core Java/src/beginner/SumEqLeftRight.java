package beginner;

public class SumEqLeftRight {
	static int[] array = {14,4,2,10,8};
	public static void main(String[] args) {		
		for(int i=1; i<array.length-1; i++){
			if(check(i)){
				System.out.println("Left and rigth elements of Position "+i+ " are equal");
			}			
		}

	}
	
	static boolean check(int i){
		int sum_left=0, sum_right=0;
		for(int j=0; j<i;j++){
			sum_left +=array[j];
		}
		for(int j=i+1; j<array.length;j++){
			sum_right +=array[j];
		}
		if(sum_left==sum_right){
			return true;
		}
		else return false;
	}

}
