package Java_Interview_Questions;

public class Soru5_FrequencyOfCharacters {

    /*  Write a return method that can find the frequency of characters

            Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2    */


 //   solution 1:

    public static String FrequencyOfChars(String str) {  // static method

        String nonDup = "";

        for(int i=0; i < str.length(); i++)

            if(!nonDup.contains(""+str.charAt(i)))

                nonDup+= ""+str.charAt(i);



        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult +=nonDup.charAt(j)+"" + count;

        }

        return expectedResult;

    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAAUUEEEENNLLL "));
    }


    }
//==================================================================================
/*
    solution 2:

    public  static  String  FrequencyOfChars(String str) {

        String expectedResult = "";

        for( int j=0; j < str.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;

    }

//==================================================================================


    Solution 3:

    public  static  String  FrequencyOfChars(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {

            int count=0;

            for(int i=0; i<str.length(); i++){

                if(str.substring(i, i+1).equals(""+str.charAt(j)))

                    count++;

            }

            result+=b.substring(j, j+1)+count;

        }

        return result;

    }

//==================================================================================


    Solutions 4:

    public static String frequency(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }
*/



