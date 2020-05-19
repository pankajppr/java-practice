package sorting;
public class MergeSort{
	static int[] array = {24,2,45,20,56,75,2,56,99,53,12};
	static int[] tempMergArr = new int[array.length];
	public static void main(String...args){
		doMergeSort(0, array.length-1);
		for(int val:array){
			System.out.print(val+",");
		}		
	}
	static void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			//Below steps sorts the left side of the array
			doMergeSort(lowerIndex,middle);
			//Below steps sorts the right side of the array
			doMergeSort(middle+1,higherIndex);
			//Now Merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}
	static void mergeParts(int lowerIndex, int middle, int higherIndex){
		for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        } 
	}	
}