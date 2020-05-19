import java.util.*;
public class RemoveDuplicates {
	int val =5;
	
	public static void main(String[] args){
		String vals[] = {"10","15","20","10"};
		System.out.println(new RemoveDuplicates().val);
		List l = Arrays.asList(vals);
		Set s = new HashSet();
		s.addAll(l);
		System.out.println(s);
		
	}

	
}
