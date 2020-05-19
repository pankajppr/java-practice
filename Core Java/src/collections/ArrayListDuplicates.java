package collections;
import java.util.*;

public class ArrayListDuplicates {
	public static void main(String[] args){
		Set s = new HashSet();
		List<String> al = new ArrayList<String>();
		// add elements to al, including duplicates
		al.add("Pankaj");
		al.add("Amit");
		al.add("Pankaj");
		al.add("Varun");
		al.add("Ajit");
		System.out.println(al);
		//Collections.sort(al);
		Set<String> hs = new LinkedHashSet<>(); // new LinkedHashSet<>(); to retain order, TreeSet<>() sorted order and remove duplicate
		hs.addAll(al); //Copy ArrayList data to HashSet
		al.clear(); // Empty the existing ArrayList elements
		al.addAll(hs); // Copy the HashSet elements to ArrayList
		System.out.println(al);
		System.out.println("Using TOString()");
		
		Object[] duplicateArray = (Object[]) al.toArray();
		for(Object element : duplicateArray){
			System.out.print(element.toString()+", ");
		}
		
	}
}
