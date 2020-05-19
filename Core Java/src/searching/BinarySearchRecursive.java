package searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// must be a sorted array
		int[] array = {2,2,12,20,24,45,53,56,56,75,99};
		int key = 53;
		int begin=0, end=array.length-1;
		int index = getIndex(array,begin, end, key);
		if(index>=0) System.out.println("Found at index:"+index);
		else System.out.println("Number Not Found");
	}
	
	static int getIndex(int[] array, int begin, int end, int key){
		if(begin < end){
			int mid = begin + (end-begin)/2;
			if(key < array[mid]){
				return getIndex(array, begin, mid, key);
			}
			else if(key > array[mid]){
				return getIndex(array, mid+1, end, key);
			}
			else return mid;
		}
		return   -1;
	}
}
