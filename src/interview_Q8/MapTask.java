package interview_Q8;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
//2 grup olustur list olarak sonra map te yazdr.
        List<String> developers = new ArrayList<>();
        developers.add("Sezer");
        developers.add("Murat");
        developers.add("Ali");

        List<String> qa = new ArrayList<>();
        qa.add("Murat");
        qa.add("Turat");
        qa.add("Furat");
        qa.add("Surat");

        Map<String, List<String>> dev_qa = new HashMap<>();
        dev_qa.put("Dev Team", developers);
        dev_qa.put("QA Team", qa);
        System.out.println(dev_qa);

        // sorunun 2. kismi----> map in eleman sayilarini yazdir
       // 1. yol value lerden size bulma
        Collection<List<String>> degerler=dev_qa.values();
        System.out.println(degerler);
        for (List<String> w:degerler
             ) {
            System.out.println(w.size());

        }
        // 2, yol key lerden size bulma
Set<String>asd=dev_qa.keySet();
        System.out.println(asd);
        for (String each:asd
             ) {
            List<String>qwe=dev_qa.get(each);
            System.out.println(qwe.size());

        }
    }
}
