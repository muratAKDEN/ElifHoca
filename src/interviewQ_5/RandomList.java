package interviewQ_5;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public static void main(String[] args) {
        // 5 elemanli arr lisr olustur . 0 dan 20 ye random deger atasin cift sayilarin yerine
        // 111 yazdirsin . Cift syi yok ise yok yazsin
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random() * 20));// random double ister ama casting yaparak sorun cozulur

        }

        System.out.println(list);
        int sayac = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sayac++;
                list.set(i, 111);

            }

        }


        System.out.println(list);

        if (sayac == 0) {
            System.out.println("cift sayi yok");
        }
    }
}
