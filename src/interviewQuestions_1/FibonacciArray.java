package interviewQuestions_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        // verilen sayinin array list te olup olm kontrol eden kod yaz
        Scanner scan = new Scanner(System.in);
        System.out.println("0 dan buyuk sayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int i = 1;
        while (fibonacci.get(i) < sayi) {
            fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
            i++;
        }
        if (fibonacci.get(fibonacci.size() - 1) > sayi) {
            fibonacci.remove(fibonacci.size() - 1);
            System.out.println("girilen sayiya kadar "+fibonacci);
        }


    }
}
