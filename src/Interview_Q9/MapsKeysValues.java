package Interview_Q9;

import java.util.HashMap;
import java.util.Map;

public class MapsKeysValues {
    public static void main(String[] args) {
        //5 adet ulke ismi ve nufusu olustur.(put)
        //  5 tane  ulke ismi ve nufusunu  yazdir
        //   5 tane ulke ismi yazdir  (keyset)
        //   5 tane ulke nufusu yazdiriyoruz (values)
        //   nufuslarin yoplamini yazdir
        //   kac tane 50 milyondan fazla ulke var yazdir.
        //nufusu ve ulkeleri siralayiniz
        
        Map<String,Integer> ulke=new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Amerika", 180);
        ulke.put("Kanada", 120);
        ulke.put("Hollanda", 20);
        ulke.put("Belcika", 40);
        System.out.println("ulke+ \" \" = " + ulke+ " milyondur");
        System.out.println(ulke.keySet());
        System.out.println(ulke.values());
int sayac=0;
        for (Integer w: ulke.values()
             ) if (w>50){

            sayac++;
        }

        System.out.println(sayac);

int toplam=0;
        for (Integer w: ulke.values()
             ) {
            toplam+=w;

        }
        System.out.println(toplam);
        for (Map.Entry<String,Integer>siralama : ulke.entrySet()
             ) {
            System.out.println(siralama);

        }

    }
}
