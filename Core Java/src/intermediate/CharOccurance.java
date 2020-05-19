package intermediate;
import java.util.*;
// Find out count of all characters in string, special characters also must be counted.
public class CharOccurance {

	public static void main(String[] args) {
		
		String inputString="This is, it";
		char[] chararray = inputString.toCharArray();
		Map<Character,Integer> m = new HashMap<>();
		
		for(char c:chararray){
			if(c == ' '){
				continue;
			}
			if(!m.containsKey(c)){
				m.put(c, 1);
			}
			else{
				int count = m.get(c);
				m.put(c, ++count);
			}
			
		}
		for(Map.Entry<Character, Integer> me:m.entrySet()){
			System.out.println(me.getKey()+" is "+ me.getValue()+" times in the String.");
		}

	}

}
