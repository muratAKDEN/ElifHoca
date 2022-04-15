package interviewQ_4;

import java.util.Scanner;
// Write a method named isEven that accepts an integer argument and   return true if  the arg. is even
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi gir");
        int a=scan.nextInt();
        isEven(a);
        System.out.println(isEven(a));


    }

    private static boolean isEven(int a) {

        if (a%2==0){
          return true ;
        }else return false;

    }
}
