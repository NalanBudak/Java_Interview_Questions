package Java_Interview_Questions;

import java.util.Arrays;

public class Soru7_Array_FindMaximum {

    //  Write a method that can find the maximum number from an int Array

    //  Solution 1:

   /* public static int maxValue( int[]  n ) {

        int max = Integer.Min_VALUE;

        for (int each : n)

            if (each > max)

                max = each;

        return max;
    }

    public static void main(String[] args) {
     int [] arr1= {4,5,6,22,88,99,};
        System.out.println(maxValue(arr1));

    }
    }
*/


    //   Solution 2:

    public static int maxValue(int[] n) {

        Arrays.sort(n);

        return n[n.length - 1];

    }

    public static void main(String[] args) {
        int [] arr1= {4,5,6,22,88,99,};
        System.out.println(maxValue(arr1));
    }
}