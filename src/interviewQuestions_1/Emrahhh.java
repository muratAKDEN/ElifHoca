package interviewQuestions_1;

import java.util.Scanner;

public class Emrahhh {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        String sayi = scan.next();
        int sayi1=Integer.valueOf(sayi);


        int birlerBasamagi = 0;
        int toplam = 1;
        int sonToplam=0;
        while ( sayi1>0) {
            birlerBasamagi = sayi1 % 10;
            for (int i = 0; i <sayi.length() ; i++) {
               toplam=birlerBasamagi*toplam;
            }
            sonToplam += toplam+sonToplam;
            System.out.println(sonToplam);
            System.out.println(toplam);
            sayi1 /= 10;
            toplam=1;
        }
        /*
        if (toplam == sayi1) {
            System.out.println("armstrong");

        }else {
            System.out.println("armstrong degil");
        }
        */


    }

}
