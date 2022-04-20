package interviewQuestions_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraydekiElmnFarki {
    public static void main(String[] args) {
        // kullanicidan alinan arr elemanlarin en buyuk ve en kucuk farklari bulan method yaz

        arrayOlustur();


    }

    private static void arrayOlustur() {
        Scanner scan =new Scanner(System.in);
        System.out.println("kac eleman gireceksiniz");
       int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println((i+1)+".sayiyi giriniz");
            arr[i]=scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println((arr[arr.length-1]-(arr[0])));// koseli parantez icine arrayin index i yazilir



    }
}
