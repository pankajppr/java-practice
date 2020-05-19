package beginner;
import java.util.*;
//Find out duplicates in an array
public class DuplicateNoArray {


	public static void main(String[] args) {
		int[] array = {1,4,2,4,8,9,23,33,45,1};
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i: array){
			if(s.contains(i)){
				System.out.println("Duplicate Found:"+i);
			}
			else{
				s.add(i);
			}
		}

	}

}
