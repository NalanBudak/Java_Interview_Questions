package Java_Interview_Practice;

public class Soru2_String_Rempove_Duplicates {
 /*
   Write a return method that can remove the duplicated values from String

         Ex:  removeDup("AAABBBCCC")  ==> ABC */

    public static void main(String[] args) {

        String str = "AABBNNKKYYEETT";
        String result = "";

        for (int i = 0; i < str.length(); i++) {   // length()-1 olmadigi icin biz i<str.length() verdik . = vermedik
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);

            }
        }
        System.out.println(result);
    }
}
//charAt(): Accept an index number and
//          return back the character at that specific position