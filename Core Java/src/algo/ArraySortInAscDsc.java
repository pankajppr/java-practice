package algo;

import java.util.Arrays;

/*
 * Given an array of integers , sort the first half of the array in ascending and second half in
 * descending order. Input: arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8 } Output: arr[] = {1, 2, 3, 4, 9, 8,
 * 7, 6, 5}
 */
public class ArraySortInAscDsc {


  public static void main(String[] args) {
    int arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int mid = arr.length / 2;
    int j = arr.length - 1;

    for (int i = mid; i < (arr.length / 4) + mid; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    System.out.println(Arrays.toString(arr));
  }

}
