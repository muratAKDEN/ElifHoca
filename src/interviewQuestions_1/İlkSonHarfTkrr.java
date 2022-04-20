package interviewQuestions_1;

import java.util.Scanner;

public class İlkSonHarfTkrr {
    public static void main(String[] args) {

        // kullnicidan alinan str nin ilk ve son harflerinin kullanicdn alnan sayi kadar tekrarli yazdran metod olstr
        Scanner scan = new Scanner(System.in);
        System.out.println("metin giriniz");
        String a = scan.nextLine();
        System.out.println("sayi gir");
        int sayi = scan.nextInt();

        String b = tekrarliYaz(a, sayi);
        System.out.println(b);

    }//main method

    private static String tekrarliYaz(String a, int sayi) {
        String b = a.substring(0, 1) + a.substring(a.length() - 1);
        String output = "";
        for (int i = 0; i < sayi; i++) {
            output += b;
        }

        return output;
    }
}
