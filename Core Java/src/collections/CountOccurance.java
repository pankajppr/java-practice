package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurance {

	public static void main(String args[]) {
		String name = "Rashmi Bharti";
		
		char[] charArr =  name.toCharArray();
		
		int[] intArr =  new int[128];
		
		for(char val: charArr) {
			
			if(intArr[val] != 0) {
				intArr[val] = intArr[val]+1;
			}else {
				intArr[val] = 1;
			}
		}
		
		for(int i = 0; i<intArr.length; i++) {
			int occurance = intArr[i];
			if(occurance>0) {
				System.out.println("Number of occurance of "+ (char)i + " : " + occurance);
			}
			
		}
		
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		
//		for(char val: charArr) {
//			if(map.containsKey(val)) {
//				map.put(val, map.get(val) + 1);
//			}else {
//				Integer put = map.put(val, 1);
//				System.out.println(put);
//			}			
//		}
//		
//		//Reading the map
//		
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println("Number of occurance of "+ entry.getKey() + " : " + entry.getValue());
//		}
//		
//		//2nd way
//		Iterator<Entry<Character, Integer>> itr =  map.entrySet().iterator();
//		while(itr.hasNext()) {
//			Entry<Character, Integer> next = itr.next();
//			//System.out.println("Number of occurance of "+ next.getKey() + " : " + next.getValue());
//		}
		
		
	}
}
