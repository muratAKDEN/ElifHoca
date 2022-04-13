package interviewQuestions_3;

import java.util.Scanner;

public class TekrarlayanKarakter {
    public static void main(String[] args) {
        // kulanicidan bir metin iste birde karakter . o karakterin kac kez tekrarlandigini yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("yaziniz...");
        String a = scan.nextLine();
        System.out.println(" harf giriniz");
        char harf = scan.next().charAt(0);
        int sayac = 0;
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i)==harf){
                sayac++;
            }

        }

        System.out.println("toplam tekrarlanma sayisi = " + sayac);
    }
}
