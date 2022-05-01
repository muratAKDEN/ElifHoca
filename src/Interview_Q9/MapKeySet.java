package Interview_Q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySet {
    public static void main(String[] args) {
        Map<Integer,String>zipCodesAndCities=new HashMap<>();
        zipCodesAndCities.put(80123,"Arizona");
        zipCodesAndCities.put(70123,"Marizona");
        zipCodesAndCities.put(90123,"Carizona");

        Set<Integer> asd=zipCodesAndCities.keySet();

        for (Integer w:asd
             ) {

            System.out.println(w+"  "+zipCodesAndCities.get(w));

        }
    }
}
