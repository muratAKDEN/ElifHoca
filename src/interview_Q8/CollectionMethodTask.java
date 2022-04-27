package interview_Q8;

import java.util.*;

public class CollectionMethodTask {
    public static void main(String[] args) {
        // kullanicidan 5 sayi iste ve onlari listeye at.
        // listeyi terten sirala
        // listeyi karistir yazdir
        // 3 ysaga dondur ve yazdir .

        List<Integer> asd = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {


            System.out.println("sayi giriniz");
            asd.add(scan.nextInt());

        }


        Collections.sort(asd);

        System.out.println(asd);
        Collections.sort(asd, Collections.reverseOrder());
        System.out.println(asd);

        Collections.shuffle(asd);// siralamayi karistiirarak veerir
        System.out.println(asd);
        Collections.rotate(asd,3);
        System.out.println(asd);
        Integer max=Collections.max(asd);
        Integer min=Collections.min(asd);
        System.out.println(max);// max degerini alir
        System.out.println(min);
        Collections.replaceAll(asd,min,max);
        System.out.println(asd);
    }
}
