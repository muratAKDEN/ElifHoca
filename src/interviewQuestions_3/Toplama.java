package interviewQuestions_3;

import java.util.Scanner;

public class Toplama {
    public static void main(String[] args) {
        //  kullanicidan sayi iste .5 dan fazla girerse veya 500 u gecerse , bu kadar yeter deyin toplami yazdir

        Scanner scan = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        while (toplam < 500 && sayac < 5) {
            System.out.println("sayi giriniz");

            int sayi = scan.nextInt();
            toplam += sayi;
            sayac++;

        }
        if (toplam > 500 && sayac > 5) {
            System.out.println("yeter bu kadar"+sayac + " sayi girdiniz " + "toplam= " + toplam);
        }else  System.out.println(sayac + " sayi girdiniz " + "toplam= " + toplam);

    }
}
