package interviewQuestions_1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // girilen sayinin kendisi haric tam bolen sayisini bulan method olustur.
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
     int mukemmelSayi=  mukemmelHesapla(sayi);




    }

    public static int mukemmelHesapla(int sayi) {

        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");

            }


        }
        System.out.println();
        if (toplam==sayi){
            System.out.println("mukemmel sayi");
        }else System.out.println("mukemmel degildir");


        return toplam;

    }
}
