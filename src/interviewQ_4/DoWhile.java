package interviewQ_4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Kullanicidan Sayi iste o sayiyi 5 er artirarak 100 e kadar yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int a =scan.nextInt();

        do {
            System.out.println(a+" ");
           a+=5;

        }while (a<100);



    }
}
