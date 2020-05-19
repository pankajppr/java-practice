package beginner.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	static{
		System.out.println();
	}
    public static void main(String[] args) {


        System.out.println(((int)Math.pow(2,2))*2);
        System.out.println(1 << 30);
        Set<String> s = new HashSet();
    }
    
    static boolean isAnagram(String a, String b) {
        char[] aarr = a.toCharArray();
        char[] barr = b.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : aarr){
            if(map.containsKey(Character.toUpperCase(c))){
                    int newval = (int)map.get(Character.toUpperCase(c));
                    map.put(Character.toUpperCase(c), new Integer(++newval));
                }
            else{ 
                    map.put(Character.toUpperCase(c), new Integer(1));
                }
            }
        System.out.println(map);
        return false;
    }
}