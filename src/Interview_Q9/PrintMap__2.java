package Interview_Q9;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintMap__2 {
    public static void main(String[] args) {
        // 10, Java
        // 20, PHP
        // 2, Phyton
        // 57, C++
        // 40, Javascript   ..... yazdiriniz

        Map<Integer,String>asd=new LinkedHashMap<>();// verilen sira ile almak icin  Linked
        asd.put(10, "Java");
        asd.put(20, "PHP");
        asd.put(2, "Phyton");
        asd.put(40, "Javascript");

        for (Map.Entry<Integer,String> w: asd.entrySet()
             ) {
            System.out.println(w.getKey()+", " +w.getValue());

        }
        System.out.println("*******  2. yol  ********");
        for (Integer w: asd.keySet()
             ) {
            System.out.println(w+", "+asd.get(w));

        }

    }
}
