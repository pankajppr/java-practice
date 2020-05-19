package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array = {24,2,45,20,56,75,2,56,99,53,12};
		int key = 53;
		for (int i=0; i<array.length; i++){
			if(key==array[i]){
				System.out.println("Found Key at Position:"+i);
				break;
			}
		}

	}

}
