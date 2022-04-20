package interviewQuestions_1;

import java.util.Scanner;

public class Armstrong_1634 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        String sayi = scan.next();
       armstrongHesapla(sayi);


    }


    private static String armstrongHesapla(String sayi){
        String sayi2[] = sayi.split("");
        int toplam = 0;
        for (int i = 0; i < sayi2.length; i++) {
            toplam += Math.pow(Integer.valueOf(sayi2[i]), sayi2.length);
            // Math. classindan Math.pow (sayinin kuvvetini) hesapladim

        }

        if (Integer.valueOf(sayi) == toplam) {
            System.out.println("armstrong");


        }else System.out.println("armstrong degil");
        return sayi;
    }
}
