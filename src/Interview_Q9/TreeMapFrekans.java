package Interview_Q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapFrekans {
    //TreeMap kullanarak 1 cumledeki harfkerin frekansini method create ederek   bulunuz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle yaz");
        String str = scan.nextLine().toLowerCase();

        // frekans= tekrarlanan eleman sayisi
        frekansBul(str);
        Map<String, Integer> q = frekansBul2(str);
        System.out.println(q);

    }

    private static Map<String, Integer> frekansBul2(String str) {
        TreeMap<String, Integer> q = new TreeMap<>();
        String arr[] = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (!q.containsKey(arr[i])){
                q.put(arr[i],1 );

            }else
                q.put(arr[i],q.get(arr[i]) +1);
        }


        return q;
    }


    private static void frekansBul(String str) {
        TreeMap<Character, Integer> frMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {// frMap icinde bu karakter yoksa bu
            // satir calisir
            if (!frMap.containsKey(str.charAt(i))) {
                frMap.put(str.charAt(i), 1);
            } else
                frMap.put(str.charAt(i), frMap.get(str.charAt(i)) + 1);// ayni karakterlerden
            // varsa sayisini artirarak gunceller

        }

        System.out.println(frMap);
    }
}
