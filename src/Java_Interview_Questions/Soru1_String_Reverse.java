package Java_Interview_Questions;

public class Soru1_String_Reverse {


             /* Write a return method that can reverse  String

                   Ex: Reverse("ABCD"); ==> DCBA                */

  // TODO Solution 1:  Cybertek'in yontemi


        public static void main(String[] args) {

            System.out.println(strReverse("Cybertek School"));

        }

        public static String strReverse(String str) {  // static method

            String reverse = "";  // atamasi sonradan yapilacagi icin bos tirnak koyduk

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.toCharArray()[i];
            }
                return reverse;

            }


  //==================================================================================

//TODO       Solution 2 : Cybertek Yontemi

//            public  static String  Reverse(String str) {
//               return new StringBuffer(str).reverse().toString());
                    }


//==================================================================================
   /* Aziz'in  yontemi with SCANNEER

   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        String str = scan.nextLine();  // next tek kelime print eder. nec=xtline cumle print eder
        String reverse ="";
        for (int i =str.length()-1; i >=0 ; i--) {
            reverse+= str.toCharArray()[i]; // kelimeyi tamamen sirali bir sekilde print eder
            // string.toCharAt()   kelimenin icinde bizim istedigimiz siradaki harfi print eder

        }
        System.out.println(reverse);                */


//==================================================================================

    /*   Aziz'in  yontemi

         String str ="ABCD";
         String reverse ="";

            for (int i =str.length()-1; i >=0 ; i--) {
             reverse+= str.toCharArray()[i];




          //toCharArray() kelimeyi tamamen sirali bir sekilde print eder
         // string.toCharAt()   kelimenin icinde bizim istedigimiz siradaki harfi print eder

*/



















