package intermediate;
import java.util.LinkedHashSet;
import java.util.Set;
//Find out all possible unique subString present in a given string in java

public class CombinationsInStrings {

	public static void main(String[] args) {
		String str = "hello";
		Set<String> set = new LinkedHashSet<String>();
		char[] ch_arr = str.toCharArray();
		
		for(int i=0; i<ch_arr.length; i++){
			for(int j=i+1; j<=ch_arr.length; j++){
				String sub = str.substring(i, j);
				if(!set.contains(sub)){
					set.add(sub);
				}
			}			
		}
		System.out.println("Size of set: "+set.size());
		System.out.println(set);
		
	}

}
