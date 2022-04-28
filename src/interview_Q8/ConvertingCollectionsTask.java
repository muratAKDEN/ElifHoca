package interview_Q8;

import java.util.*;

public class ConvertingCollectionsTask {
    public static void main(String[] args) {
        //10 boyutlu  integer ler den bir array olustur
        //bu Arr i Liste  donustur
        // listeyi Sete donustur
        Random rnd=new Random();
        Integer arr []= new Integer[10];
        for (int i = 0; i <10 ; i++) {
            arr[i]=rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        List<Integer>liste=new ArrayList<>(Arrays.asList(arr));
        ;
        System.out.println(liste);


        Set<Integer>asd=new HashSet<>(liste);

        System.out.println(asd);
    }
}
