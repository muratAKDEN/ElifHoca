package interviewQ_4;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        // Factors = carpanlar
        // kullanicidan sayi iste while loop ile carpanlarini yazdir
        // 12==> 1,2,3,4,6,12==>6 adet var
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi gir");
        int a=scan.nextInt();
         int sayac=0;
        int i=1;
        while (i<=a){
        if (a%i==0){
            sayac++;
        }
        i++;

        }


        System.out.println(sayac);




    }
}
