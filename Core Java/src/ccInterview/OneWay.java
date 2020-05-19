package ccInterview;

public class OneWay {

	public static void main(String[] args) {
		String s1 = "palelas";
		String s2 = "bales";
		boolean result = findOneWay(s1, s2);
		System.out.println(result);

	}


	private static boolean findOneWay(String s1, String s2) {
		int s1Length = s1.length();
		int s2Length = s2.length();
		char[] arr;
		
		if(s1Length > s2Length){
			arr = s1.toCharArray();
			return findResult(arr, s2);
		}
		
		return findResult(s2.toCharArray(), s1);
	}

	private static boolean findResult(char[] arr, String s) {
		int position=0, diffCount=0;
		if(arr.length == s.length()){
			for(int i=0; i<arr.length; i++){
				if(arr[i] == s.charAt(i)){}
				else{
					position=i; diffCount++;
				}					
			}
			if(diffCount ==1 || diffCount == 0) return true;
			return false;
		}
		for(int i=0,j=0; i<s.length();){
			if(arr[j] == s.charAt(i)){i++;j++;}
			else{
				j++;diffCount++;
			}
		}
		if(diffCount ==1 || diffCount == 0) return true;
		return false;
	}

}
