package interviewQ6;

import java.util.Scanner;

public class AtbashSifresi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Sifrelenecek ifadeyi giriniz");
        String str= scan.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            int index='z'-str.charAt(i);
          char f= ((char) (('a')+index));
            System.out.print(f);
        }




    }
}
