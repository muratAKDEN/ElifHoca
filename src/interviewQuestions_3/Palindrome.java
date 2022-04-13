package interviewQuestions_3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //tras nicin  sart/ Nurses run / elele/ kazak/ Ey edip Adanada pide ye

        Scanner scan = new Scanner(System.in);
        System.out.println(" yaziniz....");
        String a = scan.nextLine();
        String ters = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            ters += a.charAt(i);

        }

        if (a.equalsIgnoreCase(ters)) {
            System.out.println("palindromedir");

        } else System.out.println("not palindrome");

        System.out.println("*********************");

        Scanner scan1 = new Scanner(System.in);
        System.out.println(" yaziniz....");
        String aa = scan.nextLine();
        StringBuilder asdf = new StringBuilder(aa);// parantez icine aa yazmak append etmek gibidir
        String tersten = asdf.reverse().toString();// to string metodu ile String yaptim

        if (aa.equalsIgnoreCase(tersten)) {
             System.out.println("palindromedir");

        } else System.out.println("not palindrome");


    }
}
