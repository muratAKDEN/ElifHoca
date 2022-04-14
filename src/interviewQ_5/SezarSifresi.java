package interviewQ_5;

import java.util.Scanner;

public class SezarSifresi {
    public static void main(String[] args) {
        // s==>5
        // a==>4
        // e==>3
        // i==>2
        Scanner scan = new Scanner(System.in);
        System.out.println("yaziniz...");
        String a = scan.nextLine();
        hackerDili(a);

    }

    private static void hackerDili(String a) {
        String arr[] = new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.substring(i, i + 1);
           // System.out.print(arr[i]);
        }
        for (int i = 0; i < a.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i] = "5";
            }
            if (arr[i].contains("a")) {
                arr[i] = "4";
            }

            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            System.out.print(arr[i]);
        }

    }
}