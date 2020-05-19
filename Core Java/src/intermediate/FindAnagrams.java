package intermediate;
import java.util.*;
public class FindAnagrams {
	//Find the anagram groups in the given paragraph
	public static void main(String...args){
	String[] words = {"cat", "dog", "tac", "god", "act","mary","Mary","army"};	
	Map<String,Integer> map = new HashMap<String,Integer>();
		for(String val:words){
			int hash = getHash(val);
			map.put(val, hash);
		}
		Map<Integer,List<String>> maplist = new HashMap<Integer,List<String>>();
		
		for(Map.Entry<String, Integer> me:map.entrySet()){
			if(!maplist.containsKey(me.getValue())){
				List<String> ls = new ArrayList<String>();
				ls.add(me.getKey());
				maplist.put(me.getValue(), ls);								
			}
			else{
				List<String> ls = maplist.get(me.getValue());
				ls.add(me.getKey());
			}			
		}
		int group = 1;
		for(Map.Entry<Integer, List<String>> me: maplist.entrySet()){
			System.out.println(me.getKey()+": List-"+(group++)+": "+me.getValue());
		}		
	}
	
	static int getHash(String val){
		char[] c = val.toCharArray();
		int hash = 0;
		for(char ch:c){
			String sc = String.valueOf(ch);
			hash+=sc.hashCode();
		}
		return hash;
	}	
}
