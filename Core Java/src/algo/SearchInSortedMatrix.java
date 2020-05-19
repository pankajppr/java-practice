package algo;

/*
 * Write an efficient algorithm that searches for a value in a m x n matrix
 */
public class SearchInSortedMatrix {

  public static void main(String args[]) {
    int mxArr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

    boolean result = searchforKey(11, mxArr);
    System.out.println(result);
  }

  private static boolean searchforKey(int val, int[][] mxArr) {

    for (int i = 0; i < mxArr.length; i++) {

      int[] subArr = mxArr[i];
      if (val >= subArr[0] && val <= subArr[subArr.length - 1]) {

        return isValExist(val, subArr);
      }
    }
    return false;
  }

  private static boolean isValExist(int val, int[] sortedArr) {

    // Following is the search implementation of binary search
    int start = 0;
    int end = sortedArr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (sortedArr[mid] == val)
        return true;

      if (val < sortedArr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }

    }

    return false;

    // Arrays util class can also be used here
    // return Arrays.binarySearch(sortedArr, val) >= 0 ? true : false;
  }
}
