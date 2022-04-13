package interviewQuestions_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOlustur {
    public static void main(String[] args) {
        // liste icine renkleri add yap ve ayni satirda yazdir
        List<String> liste=new ArrayList<>();
        liste.add("mavi");
        liste.add("bordo");
        liste.add("beyaz");
        System.out.println("liste = " + liste);
        liste.add(1,"yesil");
        liste.add(2,"sari");
        liste.add(liste.size(), "mor"); // en son index e ekler


        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(liste.get(i));

        }





    }
}
