package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] input_arr = {15,5,6,25,6,52,1,7};
		int size = input_arr.length;
		
		for(int val:input_arr){
			System.out.print(val+" ");
		}
		// sorting of array
		int swap;
		for(int i=0; i<(size-1); i++){
			for(int j=0; j<(size-i-1); j++){
				
				if(input_arr[j] > input_arr[j+1]){ // use < for sorting in decending order
					swap = input_arr[j];
					input_arr[j]=input_arr[j+1];
					input_arr[j+1]=swap;
				}
			}
		}
		
		System.out.println("Sorted Array:");
		for(int val:input_arr){
			System.out.print(val+" ");
		}
	}

}
