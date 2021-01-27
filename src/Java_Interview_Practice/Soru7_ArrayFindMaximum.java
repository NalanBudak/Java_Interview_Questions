package Java_Interview_Practice;

import java.util.Arrays;

public class Soru7_ArrayFindMaximum {

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
// Arrays.sort(array)==========> sorts the array in ascending order
