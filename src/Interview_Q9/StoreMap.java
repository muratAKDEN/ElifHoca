package Interview_Q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreMap {
    public static void main(String[] args) {
        //kllnicidan bir kisinin kimlik numarasini (4 haneli) tam ismini adresini telofonu al
        // kimlik no sunu girerek kullanici bilgilerini ekrana yzdirin
        //tum kullanicilarin isimlerini ekrana yazdir.

        Map<String, Map<String,String>> outerMap=new HashMap<>();
       Map<String,String>innerMap=new HashMap<>();
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("kimlik no giriniz " );
            outerMap.put(scan.next(),innerMap);
            System.out.println("isim giriniz");
            innerMap.put("isim",  scan .next());

            System.out.println("telefon gir");

            innerMap.put("tel", scan.next());

            System.out.println("adres giriniz");
            innerMap.put("adres", scan.next());

            System.out.println("devam etmek ister misiniz\n evet icin E Hayir icin H ye basiniz");
            System.out.println(innerMap);
            System.out.println(outerMap);
            scan.nextLine();

        }while (scan.next().equalsIgnoreCase("E"));{
        if (scan.next().equalsIgnoreCase("h")){
            System.out.println("yanlis harf");}
        System.out.println("devam etmek ister misiniz\n evet icin E Hayir icin H ye basiniz");
        scan.next();}



        System.out.println("istedigin kisinin kimlik no su nu gir");
        System.out.println(outerMap.get(scan.next()));


    }
}
