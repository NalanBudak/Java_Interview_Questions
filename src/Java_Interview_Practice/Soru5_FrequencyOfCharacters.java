package Java_Interview_Practice;

public class Soru5_FrequencyOfCharacters {
/*
Nested Loop==> loop inside another loop

When do we need nested?====> only if we need to repeat a loop

  TASK=  Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2    */

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

//charAt(): Accept an index number and
//          return back the character at that specific position

}
