package collections;
import java.util.*;

public class ArrayListSortGenerics {
	
	public static void main(String[] args){
	List<String> arraylist = new ArrayList<String>();
	arraylist.add("India");
	arraylist.add("INdia");// duplicates are allowed in Arraylist
	arraylist.add("Japan");
	arraylist.add("China");
	arraylist.add("Indonesia");
	arraylist.add("Singapore");
	
	System.out.println("Before Sorting:"+arraylist);
	//Sort the Arraylist
	Collections.sort(arraylist);
		System.out.println("After Sorting:"+arraylist);
	
	System.out.println("Printing in reverse order");
	Collections.sort(arraylist,Collections.reverseOrder());
	//Collections.reverse(arraylist);
		System.out.println("After Sorting:"+arraylist);
	
	
	}

}
