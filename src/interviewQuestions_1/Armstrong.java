package interviewQuestions_1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // rakamlarin basamak sayisi kuvvet toplami kendisine esit sayilar 370, gibi

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();

        armstromgHesapla(sayi);
// sadece 3 basamakli sayilarda gecerli olur.

    }// main method

    private static void armstromgHesapla(int sayi) {
        int birlerBasamagi = 0;
        int kupCarpimi = 0;


        int sayi1=sayi;
        while ( sayi>0) {
            birlerBasamagi = sayi % 10;
            kupCarpimi += (birlerBasamagi * birlerBasamagi * birlerBasamagi);
            sayi /= 10;
        }
        if (kupCarpimi == sayi1) {
            System.out.println("armstrong");

        }else {
            System.out.println("armstrong degil");
        }


    }
}
