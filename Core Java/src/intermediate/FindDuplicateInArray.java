package intermediate;

import java.util.HashSet;
import java.util.Set;

//Find Duplicates in an array in one iteration 
public class FindDuplicateInArray {
	
	static int ar[]={3,7,3,5,8,9,24,8,9}; //given array
	public static void main(String[] args) {
		findDuplicatesHash(ar);
		findDuplicatesGen(ar);
	}
	private static void findDuplicatesGen(int[] ar2) {
		System.out.println("Printing Using Array");
		int[] check_arr = new int[100];
		for(int i=0; i<ar2.length; i++){
			if(check_arr[ar2[i]] == 0){
				check_arr[ar2[i]]=1;
			}
			else System.out.println("Duplicate Found:"+ar2[i]+" at position:"+i);
		}
		
	}
	private static void findDuplicatesHash(int[] ar2) {
		System.out.println("Printing Using HashSet");
		Set<Integer> hs = new HashSet<Integer>();
		for(int i=0; i<ar2.length; i++){
			if(!hs.contains(ar2[i])){
				hs.add(ar2[i]);
			}
			else System.out.println("Duplicate Found:"+ar2[i]+" at position:"+i);
		}
		
	}

}
