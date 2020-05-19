package tempPractice;

public class QuickShort {
	static int arr[] = {5,5,8,4,2,4,65,52,7,2,3,4,1,1};
	public static void main(String... arges){
		quickSort(0, arr.length-1, arr);
		for(int val: arr){
			System.out.print(val+", ");
		}
	}
	private static void quickSort(int lowerIndex, int higherIndex, int[] arr) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = arr[lowerIndex+1]; //arr[lowerIndex+(higherIndex-lowerIndex)/2];
		while(i<=j)	{
			while(arr[i] < pivot) i++;
			while(arr[j] > pivot) j--;
			if(i<=j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				//move index to next position on both sides
				i++; j--;
			}
		}
		
		if(lowerIndex<j) quickSort(lowerIndex, j, arr);
		if(i<higherIndex) quickSort(i,higherIndex, arr);
	}
}
