package beginner;
import java.util.*;

public class RemoveDuplicateArray {
	public static void main(String[] args) {
		
		int[] sorted_array = {1,2,4,4,8,9,9,23,33,33,45};
		
		System.out.println("Array with Duplicates:");
		for(int i=0; i<sorted_array.length; i++){
			System.out.print(sorted_array[i]+" ");
		}
		
		int[] uniqueArray = remove_duplicate(sorted_array);
		remove_duplicate_hashSet(sorted_array);
		System.out.println("\nArray without Duplicates:");
		for(int i=0; i<uniqueArray.length; i++){
			System.out.print(sorted_array[i]+" ");
		}

	}
	

	public static int[] remove_duplicate(int[] sorted_array){
		int i=0, j=1;
		
		for(;j<sorted_array.length;){
			if(sorted_array[j]==sorted_array[i]){
				j++;
			}
			else{
				sorted_array[++i]=sorted_array[j++];
			}
		}
		
		int[] uniqueArray = new int[i+1];
		for(int x=0; x<uniqueArray.length; x++){
			uniqueArray[x] = sorted_array[x];
		}
		return uniqueArray;
	   }
	
	

	private static void remove_duplicate_hashSet(int[] sorted_array) {
		Set<Integer> ts = new TreeSet<Integer>();
		for(int val: sorted_array){
			ts.add(val);
		}
		ts.toArray();
		System.out.println("TS is:"+ts);
	}
}
