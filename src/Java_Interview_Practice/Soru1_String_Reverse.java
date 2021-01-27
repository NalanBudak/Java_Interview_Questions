package Java_Interview_Practice;

public class Soru1_String_Reverse {

   /* Write a return method that can reverse  String

                   Ex: Reverse("ABCD"); ==> DCBA                */


    public static String Reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Cybertek Scholl");
    }
}

/*toCharArray()=======> returns char array from string
			str = "abcd";

			str.toCharArray() ==> {'a', 'b', 'c', 'd'}  */