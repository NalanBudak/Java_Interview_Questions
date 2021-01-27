package Java_Interview_Practice;

import java.util.Arrays;
import java.util.Collections;

public class Soru3_String_Find_The_Unique {

    /*  Write a return  method that can find the unique characters from the String

             Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";    */

    public static String unique(String str) {

        String result = "";
        for (String each : str.split("")) {

            result += (Collections.frequency(Arrays.asList(str.split("")), each)) == 1 ? each : "";

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(unique("AAAGSJJHJnnnKKKMNBGHJJJ"));
    }
}
/*Collections.frequency() method===> returns the number of elements in the specified collection
                                  equal to the specified object.

  split()===> used for splitting a String into its substrings based on the given delimiter or regular expression
 */