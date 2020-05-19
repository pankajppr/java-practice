package tempPractice;

import java.util.Arrays;

public class PyramidPrint {

	public static void main(String[] args) {
		int len = 11;
		int count=0;
		for(int i=0; i<len;i++){
			for(int j=0; j<2*len; j++){
				if(j>=(len-i) && j<=(len+i)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<len+1; i++){
			for(int j=0; j<2*len+1; j++){
				if(j>=i && j<=(2*len)-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
