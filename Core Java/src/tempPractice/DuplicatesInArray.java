package tempPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	public static void main(String[] args){
		int[] duplicateArray = {22, 33, 2, 3, 3 ,5 ,6, 34, 20, 22};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int val : duplicateArray){
			if(set.contains(val)){
				System.out.println("Duplicate found: "+ val);
			}
			else{
				set.add(val);
			}
		}
		
	}
}
