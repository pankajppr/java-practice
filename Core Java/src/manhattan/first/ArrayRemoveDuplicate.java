package manhattan.first;

public class ArrayRemoveDuplicate {
	public static void main(String[] args) {
		int[] ar = {1,2,5,5,6,7,7,8,8,8,10};
		int size=0;
		int temp=0;
		for(int val:ar){
			if(val!=temp){
				temp =val;
				size++;
			}
		}
		int[] ar_d = new int[size];
		temp=0;
		for(int i=0,j=0; i<size;){
			if(ar[j] !=temp){
				ar_d[i]= ar[j];
				temp=ar[j];
				System.out.print(ar_d[i]+",");
				i++; j++;
			}
			else j++;
		}
	}

}
