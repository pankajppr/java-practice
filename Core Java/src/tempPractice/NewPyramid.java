package tempPractice;

public class NewPyramid {

	public static void main(String[] args) {
		int n=10;
		for(int i=0; i<n; i++){
			int mid = 2*n/2;
			for(int j=0; j<2*n;j++){
				if(j>= mid-i && j<= mid+i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
