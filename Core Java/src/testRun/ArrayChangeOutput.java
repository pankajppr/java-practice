package testRun;

import java.util.Scanner;

public class ArrayChangeOutput {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number till which you want in reverse order:");
		int num = sc.nextInt();
		for(int i=num-1, j=num; j<arr.length;){
			if(i>=0){
				System.out.print(arr[i]+" ,");
				i--;
			}
			else{
				System.out.print(arr[j]+" ,");
				j++;
			}
		}

	}

}
