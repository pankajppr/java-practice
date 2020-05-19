package string;

import java.util.HashSet;
import java.util.Set;

public class ToStringWays {
	public static void main(String[] args) {
		//String class methods to get String object from primitives
		String intString = String.valueOf(1); //integer to String
		intString = Integer.toString(4); // using wrapper class toStrin method
		for(byte b : intString.getBytes())
		System.out.println(b);
		StringBuilder sb = new StringBuilder();

		System.out.println(check("azABaabza"));//ABaab
	}

	static  int check(String str){

		for(int i=0; i< str.length(); i++){
			for(int j=i+1; j<str.length()-1; j++){
				String subStr = str.substring(i,j);
				if(checkForBal(subStr)){
					System.out.println(subStr);
					return subStr.length();
				}
			}
		}

		return -1;
	}
	static  boolean checkForBal(String str){
		System.out.println("Checking for: "+ str);
		int[] intArr = new int[128];
		for(char c: str.toCharArray()){
			int intVal = (int)c;
			intArr[intVal]++;
		}
		for(int i=0; i<intArr.length; i++){
			int val = intArr[i];
			if(val >0){
				if(val>90 && intArr[i]-32 != val){//small letter
					return false;
				}
				if(val<90 && intArr[i]+32 != val){//small letter
					return false;
				}
			}

		}
		return true;
	}

	static int checkForBalance(String str) {

		for (int k = 1; k <= str.length(); k++) {
			for (int i = 0; i < str.length() - k + 1; i++) {
				Set<Character> lowerSet = new HashSet<>();
				Set<Character> upperSet = new HashSet<>();
				String temp = str.substring(i, i + k);
				char[] tempCharArr = temp.toCharArray();
				for (char ch : tempCharArr) {
					if (Character.isLowerCase(ch))
						lowerSet.add(ch);
					else
						upperSet.add(ch);
				}
				if (containsAllElements(lowerSet, upperSet) && containsAllElements(upperSet, lowerSet)) {
					return temp.length();
				}
			}
		}
		return -1;
	}
	static boolean containsAllElements(Set<Character> first, Set<Character> second){
		Set<Character> lower1 = new HashSet<>();
		Set<Character> lower2 = new HashSet<>();
		first.forEach((e) -> {
			lower1.add(Character.toLowerCase(e));
		});
		second.forEach((e) -> {
			lower2.add(Character.toLowerCase(e));
		});
		return lower1.containsAll(lower2);
	}
}