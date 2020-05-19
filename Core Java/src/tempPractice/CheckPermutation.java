package tempPractice;

public class CheckPermutation {

	public static void main(String[] args) {
		String input = "Tact COA A";
		System.out.println(checkPermutationPallindrome(input));

	}

	private static boolean checkPermutationPallindrome(String input) {
		int oddCount = 0;
		int[] countAr = new int[128];
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==' ')
				continue;
			int intVal = Character.toLowerCase(input.charAt(i));
			countAr[intVal]++;
			if(countAr[intVal]%2 != 0)
				oddCount++;
			else
				oddCount--;
		}
		if(oddCount == 1 || oddCount == 0)
			return true;
		return false;
	}

}
