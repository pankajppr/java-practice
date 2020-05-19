package sorting;
public class QuickSort {
	static int[] arr = {24,2,45,20,56,75,2,56,99,53,12};
	
	public static void main(String[] args) {		
		doQuickSort(0, arr.length-1);
		for(int val: arr){
			System.out.print(val+", ");
		}
	}
	
	static void doQuickSort(int lowerIndex, int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		// calculate the pivot no, here middle element is taken as pivot
		int pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];
		//Divide into two arrays
		while(i <= j){
			/**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				//exchange Numbers
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				//move index to next position on both sides
					i++; j--;
			}
		}
		//call doQuickSort method recursively
		if(lowerIndex < j) doQuickSort(lowerIndex, j);
		if(i < higherIndex) doQuickSort(i, higherIndex);
	}

}
