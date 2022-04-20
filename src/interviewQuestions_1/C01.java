package interviewQuestions_1;


import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        // alacan= =a:3   l:1 c:1 n:1
        //kararter sayisi bul

        Scanner scan = new Scanner(System.in);
        System.out.println("metin gir");
        String a = scan.nextLine();

        String arr[] = a.split("");
        Arrays.sort(arr);
        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {// bu satirda i 1 den basladi
            if (arr[i - 1].equals(arr[i])) {// son index e geldiginde out of bounds hatasi vermesin diye
                sayac++;
            } else {
                System.out.println(arr[i - 1] + " karakteri  " + (sayac + 1) + " kez kullanilmistir");
           sayac=0;
            }
            if (i==arr.length - 1) {
                System.out.println(arr[i ] + " karakteri  " + (sayac + 1) + " kez kullanilmistir");

            }


        }


    }
}
