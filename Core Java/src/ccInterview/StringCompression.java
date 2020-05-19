package ccInterview;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println('a'+1); //98
		String input = "aaabbcddddaaaah";
		String compressedString = compress(input);
		System.out.println(compressedString);

	}
	static String compress(String input){
		int count=0;
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<input.length()-1; i++){
			if(input.charAt(i) == input.charAt(i+1)){
				count++;
			}
			else{
				sb.append(String.valueOf(input.charAt(i))+(count));
				count=1;
			}
		}
		if(input.charAt(input.length()-1) == input.charAt(input.length()-1))
		sb.append(String.valueOf(input.charAt(input.length()-1))+(count));
		else
			sb.append(String.valueOf(input.charAt(input.length()-1))+1);
		
		if(sb.toString().length()<input.length()) 
			return sb.toString();
		return input;
	}
	

}
