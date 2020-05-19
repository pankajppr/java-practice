package beginner;
// Example "total" , then first non repetitive character is 'o'
import java.util.*;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String:");
		String input = sc.next();
		char[] array = input.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();		
		
		for(int i=0; i<array.length; i++){
			if(!m.containsKey(array[i])){
				m.put(array[i], 1);
			}
			else{
				int count= m.get(array[i]);
				m.put(array[i], ++count);
			}
			
		}
		System.out.println("Data in m is: "+m);
		for(Map.Entry<Character,Integer> entry:m.entrySet()){
			if(entry.getValue()==1){
				System.out.println("The First Non Repetitive character is:"+entry.getKey());
				break;
			}
		}
	}

}
