package interviewQ_4;

import java.util.Scanner;

public class PrintVowelsOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yaziniz...");
        String a = scan.nextLine().toLowerCase();


        for (int i = 0; i <a.length() ; i++) {
            if (a.substring(i,i+1).equals("a")||a.substring(i,i+1).equals("e")||
                    a.substring(i,i+1).equals("i")||a.substring(i,i+1).equals("o")
                    ||a.substring(i,i+1).equals("u")){
                System.out.print(a.substring(i,i+1));

            }
        }
        System.out.println("************");

        String s=a.replaceAll("[^aeiou]","");// [^aeiou] bu karakterlr haric , digerlerini hiclik yap
        System.out.println(s);


    }
}
