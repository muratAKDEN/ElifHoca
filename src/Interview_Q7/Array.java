package Interview_Q7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // parametresi String Array olan metho yaz
        String arr[]={"ali","veli","lemi"};
        yazdir(arr);
         String renkler[]={"yesil","mor","sari"};
        renkler= print(renkler);
    }

    private static String[] print(String[] renkler) {
        for (int i = 0; i < renkler.length ; i++) {
            System.out.print(renkler[i]+" ");
        }

        return renkler;
    }

    private static void yazdir(String[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
