package interviewQ_4;

import java.util.Scanner;

public class TekrarliSayi {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,55,6,8,0,7,5,1,2,3,8,7};
        //kullanicida hangi sayi iste
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi =scan.nextInt();
       int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
          if (arr[i]==sayi){
              sayac++;
          }

        }

        System.out.println(sayac);



    }
}
