package Java_Interview_Questions;

public class Soru10_Numbers_OddEven {

    /* Write  a method which can identifies given number is even or odd
    EXAMPLE
    identify(5) ->  "Odd"

    identify(6) ->  "Even"    */



   // Solution :

    public  static  String  identifyOddEven( int  n ) {

        return  n%2==0 ? "Even" : "odd" ;

    }

    public static void main(String[] args) {
        System.out.println(identifyOddEven(66));
    }
}
