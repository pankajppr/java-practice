package collections;
import java.util.*;

public class HSTS {

	public static void main(String[] args) {
		//Set<Integer> s = new HashSet<>(); // TreeSet Will give the output in ascending order, Linked HashSet in same order as input
		Set<Integer> s = new HashSet<>();
		System.out.println("Size of HashSet: "+s.size()+ ", Contents: "+ s);
		
		//Adding Elements
		s.add(new Integer(100));
		s.add(new Integer(201));
		s.add(new Integer(56));
		s.add(23); // autoboxing
		s.add(23);// duplicate is simply discarded
		
		System.out.println("Size of HashSet: "+s.size()+ ", Contents: "+ s);
		
		Iterator<Integer> itr = s.iterator();
		int sum =0;
		while(itr.hasNext()){
			Integer io = itr.next();
			int val = io.intValue();
			sum+=val;
			System.out.println("Value in integer: "+ val);
		}
		System.out.println("Sum of integers:"+sum);

	}

}
