package interviewQuestions_1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // kullanicidan str iste. ters cevir palindrome olup olmadigini kontrol eden metod yaz
        Scanner scan =new Scanner(System.in);
        System.out.println("metin giriniz");
        String a=scan.nextLine();
        reverse(a);

        System.out.println(reverse(a));


    }

    private static String reverse(String a) {
        String ters="";
        for (int i = a.length()-1; i >=0 ; i--) {
            ters+=a.charAt(i);

        }



return ters;
    }
}
