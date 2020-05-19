package tempPractice;

public class Pattern1 {
	public static void main(String[] args){
		int num=20;
		for(int i=0; i<num; i++){
			
			if(i<num/2){
			int j=i;
				while(j>0){
					System.out.print("*");
					j--;
				}
			}
			else{
				int j = num-i;
				while(j>0){
					System.out.print("*");
					j--;
				}
			}
			System.out.println();
		}
		
	}
}
