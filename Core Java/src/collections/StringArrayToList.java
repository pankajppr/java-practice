package collections;
import java.util.*;

import java.util.Arrays;

public class StringArrayToList {

	static {
		
		System.out.println("S");
	}
	public static void main(String[] args) {
		
		String[] stringArr = {"Hello", "How", "Happend"};
		List<String> ls = new ArrayList<String>();
		
		//ls = Arrays.asList(stringArr);
		
		System.out.println("List Of Strings: "+ls);
		
		// ls.add("addded"); (will give a runtime error: java.lang.UnsupportedOperationException)
		Collections.addAll(ls,stringArr);
		ls.add("added");
		System.out.println("List Of Strings: "+ls);
		
		//Converting List of String to Arrays of String
		Object[] strAr = new Object[ls.size()];
		strAr = ls.toArray();
		for(Object val: strAr){
			System.out.print(val+" ");
		}
		

	}

}
