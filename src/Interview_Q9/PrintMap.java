package Interview_Q9;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintMap {
    //asagidaki ciktiyi elde ediniz
    //Kiraz 100
    // incir 200
    // uzum 145
    // Nar 250
    public static void main(String[] args) {
        Map<String,Integer>qwe=new LinkedHashMap<>();// sirali olarak yazdirir
        qwe.put("Kiraz", 100);
        qwe.put("Incir", 200);
        qwe.put("Uzum", 145);
        qwe.put("Nar", 250);
        System.out.println(qwe);

        for (Map.Entry<String,Integer> w: qwe.entrySet()
             ) {
            System.out.println(w.getKey()+" "+w.getValue());

        }



    }
}
