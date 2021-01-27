package Java_Interview_Questions;

public class Soru6_String_SumOfDigitsInAstring {

    //      Write a method that can return the sum of the digits in a string


    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();// array in icindeki butun karakterleri istiyor

        for(char each: ch) {  // array in icindeki butun karakterleri istiyor

            if(Character.isDigit(each)) {  // burada sadece karakterlerin sayilarini verdirir

                total += Integer.valueOf(""+each);  //

            }

        }

        return total;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("16Bursa"));
    }

}
