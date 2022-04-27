package interview_Q8;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask {
    public static void main(String[] args) {
        //String ArrayList leri depolayan 2D ArrayList olusturun
        // calisanlar isverenler ve sirketler ou 3 ArrayList olustur
        // Bu 3 ArrList i 2D ArrListe te sakla.
List<List<String>>listeler=new ArrayList<>();

List<String>calisanlar=new ArrayList<>();
calisanlar.add("Feride");
calisanlar.add("Murat");
calisanlar.add("Ihsan");
calisanlar.add("Erdem");


        List<String>isverenler=new ArrayList<>();
        isverenler.add("ali");
        isverenler.add("mali");
        isverenler.add("vali");

        List<String>sirketle=new ArrayList<>();
        sirketle.add("amazon");
        sirketle.add("trendyol");
        listeler.add(calisanlar);
        listeler.add(isverenler);
        listeler.add(sirketle);
        System.out.println(listeler);
    }
}
