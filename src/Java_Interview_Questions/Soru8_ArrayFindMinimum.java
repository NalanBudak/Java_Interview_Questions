package Java_Interview_Questions;

import java.util.Arrays;

public class Soru8_ArrayFindMinimum {

    //  Write a method that can find the minimum number from an int Array


    //   Solution 1:

  /*  public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;// butun sayilari buyuklugune gore sirala

        for (int each : n)

            if (each < min)

                min = each;


        return min;

    }

    public static void main(String[] args) {
int [] arr2= {5,9,44,55,22,11,33,77};
        System.out.println(minValue(arr2));
    }
*/
//===========================================================
  //  Solution 2:

    public static int minValue(int[] n) {

        Arrays.sort(n);

        return n[0];

    }

    public static void main(String[] args) {
        int []arr3={5,9,7,2,222,555,7};
        System.out.println(minValue(arr3));
    }



}