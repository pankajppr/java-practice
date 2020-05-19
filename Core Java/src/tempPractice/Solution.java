package tempPractice;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = sc.nextInt();
        char[] charr = str.toCharArray();
        int[] intArr = new int[charr.length];
        int largeSum = 0;
        int largeIndex=  0;
        int smallIndex = 0;
        int smallSum = 0;
        for(int i=0; i<charr.length; i++){
            intArr[i] = (int)charr[i];
        }
        for(int i=0; i<len; i++){
            largeSum=largeSum+intArr[i];
        }
        smallSum=largeSum;
        for(int i=0; i<intArr.length-len; i++){
            int tempSum = 0;
            for(int j=i; j<i+len; j++){
                tempSum=tempSum+intArr[j];
            }
            if(tempSum>largeSum){
                largeSum=tempSum;
                largeIndex=i;
            }
            if(tempSum<smallSum){
                smallSum=tempSum;
                smallIndex=i;
            }
        }
        String small = ""; String large="";
        for(int i=0; i<len; i++){
            small = small+charr[smallIndex+i];
            large = large+charr[largeIndex+i];
        }
        System.out.println(small);        
        System.out.println(large);

        
    }
}