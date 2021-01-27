package Java_Interview_Questions;

public class Soru2_String_RemoveDuplicates {

    /*
   Write a return method that can remove the duplicated values from String

         Ex:  removeDup("AAABBBCCC")  ==> ABC

  Solution 1:


    public static String removeDup(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i)))

                result += ""+ str.charAt(i);

        }  // for un parantezi

        return result;

    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));

    }

/*Solution 2:

public static String removeDup(String str) {

str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

str = str.replace(", " ,  "" ).replace("[","").replace("]","");

    return  str;

}   */


    public static void main(String[] args) {

        String str = "AABBCCDDEE";
        String result ="";

        for(int i=0 ; i<str.length(); i++){

            if (!result.contains("" + str.charAt(i))){

                result += "" +str.charAt(i);

            }
        }
        System.out.println(result);
    }

}

