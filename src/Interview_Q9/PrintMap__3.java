package Interview_Q9;

import java.util.HashMap;
import java.util.HashSet;

public class PrintMap__3 {
    public static void main(String[] args) {
        //Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu ile yazdiriniz

        HashMap<Integer,String>asd=new HashMap<>();
        asd.put(1, "Bir");
        asd.put(2, "iki");
        asd.put(3, "uc");
        asd.put(4, "dort");
        asd.put(5, "Bes");
        asd.put(6, "alti");

        for (Integer w: asd.keySet()
             ) {
            System.out.println(w+" = "+asd.get(w));

        }






    }
}
