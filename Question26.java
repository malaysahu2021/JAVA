// . Write a Java program that returns the missing letter from an array of
// increasing letters (upper or lower). Assume there will always be one letter
// missing in the array.
// Example:
// Original array of elements: [p, q, s, t]
// Missing letter in the said array: r
import java.util.Scanner;
import java.util.Arrays;

public class Question26 {

  public static void main(String[] args) {
      int i;
     String[] str_arra = {"p", "r", "s", "t"};
     String result;
     result="";
     int c = str_arra[0].charAt(0) + 1;
    for ( i = 1; i < str_arra.length; i++, c++)
      if (str_arra[i].charAt(0) != c)
        result= String.valueOf((char) c);
    System.out.printf("\nMissing letter in the said array: " + result);
  }
  }
