package beginner;

import java.util.Scanner;


public class StringReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String input_string = sc.next();

    // Reverse using toCharArray
    String reverse_string = reverse(input_string);
    System.out.println("Reverse of String is: " + reverse_string);

    // Reverse using StringBuffer
    StringBuffer sb = new StringBuffer(input_string);
    String reversed = sb.reverse().toString();
    System.out.println("Reverse using StringBuffer: " + reversed);

    // Reverse using recursion , charAt(-), subString(-,-)

    System.out.println("Reverse using Recursion: " + reverseRecursively(input_string));

  }

  public static String reverse(String input) {
    char[] str = input.toCharArray();
    for (int i = 0, j = str.length - 1; i < str.length / 2; i++, j--) {
      char temp = str[i];
      str[i] = str[j];
      str[j] = temp;
    }
    return new String(str);
  }

  /* reverse string recursively. */

  public static String reverseRecursively(String input) {
    int length = input.length();
    // while(length>1){
    // return input.charAt(length-1)+reverseRecursively(input.substring(1,
    // length-1))+input.charAt(0);
    // }
    // return input;

    if (input.length() <= 1) {
      return input;
    } else
      return input.charAt(length - 1) + reverseRecursively(input.substring(1, length - 1))
          + input.charAt(0);
  }

}
