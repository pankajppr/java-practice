package testRun;

public class DuplicatesInString {

	public static void main(String[] args) {
		findDuplicates("Pankaj");
		findDuplicatesUsingIndex("Pankaj");

	}
	
	private static void findDuplicatesUsingIndex(String string) {
		String s = "";
		for(int i=0; i<string.length(); i++){
			if(s.indexOf(string.charAt(i))>=0){
				System.out.println("Found Duplicate char at position: "+i);
			}
			else{
				s = s+ string.charAt(i);
			}
		}
	}

	static void findDuplicates(String input){
		int intArr[] = new int[122];
		for(int i=0; i<input.length(); i++){
			int index = (int)input.charAt(i);
			if(intArr[index] == 1) System.out.println("Duplicate:"+input.charAt(i));
			else intArr[index] =1;
		}
	}

}
