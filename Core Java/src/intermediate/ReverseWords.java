package intermediate;

//Original String   : i am doing good
//String after reversing words in sentence : good doing am i
public class ReverseWords {

	public static void main(String[] args) {
		String str ="i am doing good";
		
		print_using_split(str);
		System.out.println("\nUsing loop:");
		String reverse = print_reverse(str);
		System.out.println(reverse);
	}

	private static void print_using_split(String str) {
		String[] parts = str.split(" "); // splits the string on the basis of " " and results in a arrays if Strings
		for(int i=parts.length-1; i>=0; i--){
			System.out.print(parts[i]+" ");
		}		
	}
	
	private static String print_reverse(String str) {
		char[] chararray = str.toCharArray();
		String reverse="";
		int index=0;
		String s = "";		
		for(int i=0; i<chararray.length; i++){
			if(chararray[i]== ' '){
				reverse = s+" "+reverse;
				s = "";				
			}
			else{
				s+=chararray[i];
			}			
		}
		return s+" "+reverse;
		
	}

}
