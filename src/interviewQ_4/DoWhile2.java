package interviewQ_4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        // kllanicidan sayi al  100 den kucukse kazandin buyukse kaybettin yazdir
        Scanner scan = new Scanner(System.in);
        int sayi;
        do {
            System.out.println("sayi giriniz");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("kazandin");
            }
        } while (sayi < 101);
        System.out.println("Lost");
    }
}
