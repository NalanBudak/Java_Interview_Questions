package Java_Interview_Practice;

import java.util.Arrays;

public class Soru8_ArrayFindMinimum {

    //  Write a method that can find the minimum number from an int Array


    public static int minValue(int[] n) {

        Arrays.sort(n);   // Arrays.sort(array)==========> sorts the array in ascending order

        return n[0];

    }

    public static void main(String[] args) {
        int []arr3={5,9,7,2,222,555,7};
        System.out.println(minValue(arr3));
    }
}
