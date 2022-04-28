package interview_Q8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddedOrNot {
    public static void main(String[] args) {
        //1,2,3,1,4,5 sayilarini 1 listesini olustur
        // kac tane tekrarli eleman old. sayiniz
        // yinelenen degerlerin ne old.bulunuz .
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);




        int tekrarliElmnSayisi=0;

        List<Integer>tekrarliElemnlar=new ArrayList<>();
        Set<Integer>tekrarsizlar =new HashSet<>();
        for (int i = 0; i <sayilar.size() ; i++) {
           boolean eklimi= tekrarsizlar.add(sayilar.get(i));
            if ( !eklimi){

                tekrarliElemnlar.add(sayilar.get(i));
                tekrarliElmnSayisi++;

            }

            }
        System.out.println(tekrarliElemnlar);
        System.out.println(tekrarliElmnSayisi);;

    }


}
