package interviewQ_5;

import java.util.ArrayList;
import java.util.List;

public class TekrarlariSilme {
    public static void main(String[] args) {
        // verilen Arr deki tekrarlarin ilki haric silerek tekrarsiz arr olustr.
      int arr []= {1,2,5,4,1,-2,3,8,9,7,9,10}  ;

        List<Integer> tekrarsizList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i] );
            }

        }

        System.out.println(tekrarsizList);






    }
}
