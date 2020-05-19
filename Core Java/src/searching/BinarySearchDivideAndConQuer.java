package searching;

public class BinarySearchDivideAndConQuer {
	public static void main(String[] args) {
		int[] arr = {2,2,12,20,24,45,53,56,56,75,99};
		int key=25;
		
		int start=0;
		int end = arr.length-1;
		while(start <= end){
			int mid = (start+end)/2;
			if(key == arr[mid]){
				System.out.println("Found key at position:"+mid);
				System.exit(0);
			}
			else if(key < arr[mid]) 
				end = mid-1;
			else 
				start = mid+1;
		}
		System.out.println("Key is not in the input Array");
		

	}

}
