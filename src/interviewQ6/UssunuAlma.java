package interviewQ6;

import java.util.Scanner;

public class UssunuAlma {
    public static void main(String[] args) {
        // kullanicidan 2 sayi al 1 . si taban 2. si us olsun . sonucu hesapla
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban ve us giriniz");
        int taban = scan.nextInt();
        int us = scan.nextInt();
        int sonuc = 1;


        for (int i = us; i > 0; i--) {

            sonuc *= taban;

        }
// 2. yol
        System.out.println(sonuc);

          /*
          while (us!=0){
            sonuc*=taban;
            us--;
        }
        System.out.println(sonuc);

        */
    }
}
