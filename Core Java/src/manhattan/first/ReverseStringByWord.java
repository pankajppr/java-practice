package manhattan.first;
//WAP to reverse the string word by word
public class ReverseStringByWord {

	public static void main(String[] args) {
		String str = "Who am I";
		
		System.out.println("Reversing Using Split()");
		String[] str_ar = str.split(" ");
		for(int i= str_ar.length-1; i>=0; i--){
			System.out.print(str_ar[i]+" ");
		}
		
		System.out.println("\nReversing Using toCharrArray()");
		
		char[] char_ar = str.toCharArray();
		String temp = "";
		String new_str = "";
		for(int i = char_ar.length-1; i>=0; i--){
			if(char_ar[i] != ' ') temp = char_ar[i]+temp;
			else {
				new_str = new_str+temp+" ";
				temp = "";
			}			
		}
		new_str = new_str+temp;
		System.out.print(new_str);
	}

}
