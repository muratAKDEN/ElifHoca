package interviewQ_5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElemanlariToplama {
    public static void main(String[] args) {
        // ArrayList =$13,$15,$20
        ArrayList<String> list = new ArrayList<>(Arrays.asList("$13", "$15", "$20","-5"));
        System.out.println(toplaGel(list));
    }

    private static int toplaGel(ArrayList<String> list) {
        int toplam = 0;
        String str = "";
        for (String w : list) {
            str = w.replace("$", "");

            toplam += Integer.parseInt(str);


        }

        if (toplam < 0) {
            return -1;
        }else return toplam;

    }
}
