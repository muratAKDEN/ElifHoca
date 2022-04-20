package interviewQ6;

import java.util.Scanner;

public class OddIndex {
    public static void main(String[] args) {
        // indexi tek olan karakterleri yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("yaziniz");
        String a = scan.nextLine();
        int index=0;
        do {
            if (index%2==1){
                System.out.print(a.charAt(index));
            }
            index++;

        }while (index<a.length());


    }
}
