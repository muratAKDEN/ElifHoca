package interviewQuestions_1;

import java.util.Scanner;

public class AsalMi {
    public static void main(String[] args) {
        // kullanicidan aalinan sayi asal mi kontrol et

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scan.nextInt();
        if (sayi < 2) {
            System.out.println("sayi 2 den buyuk olmali");
        } else {

            boolean asalMi = true;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi=false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println("asaldir");

            }else {
                System.out.println("asal degil");
            }


        }


    }
}
