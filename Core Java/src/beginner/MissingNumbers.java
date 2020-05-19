package beginner;
//Missing numbers between 1 to 15 in sorted array
public class MissingNumbers {

	public static void main(String[] args) {
		int[] array = {3,5,8,9,10};
		int index = 0;
		System.out.println(array.length);
		for(int i=0; i<=15; i++){
			if( index<array.length && i==array[index]){ // checking to the length of array should be done first
				index++;
			}
			else{
				System.out.print(i+" ");
			}
		}

	}

}
