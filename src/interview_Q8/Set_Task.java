package interview_Q8;

import java.util.*;

public class Set_Task {
    public static void main(String[] args) {
        //Listten Sete ekle
        List<Integer> asd=new ArrayList<>();
        asd.add(10);
        asd.add(11);
        asd.add(12);
        asd.add(12);
        asd.add(13);
        asd.add(15);
        asd.add(15);
        asd.add(01);

        Set<Integer> zxc=new HashSet<>();
        for (Integer w:asd
             ) {zxc.add(w);

        }
        System.out.println(zxc);

        System.out.println("Soru:char degiskenlerini parametre olarak alan tum karakterleri sete ekle.." +
                " varargs kullan ,method olustur ");
        TreeSet<Character>qw=new TreeSet<>();

        karakterleriSeteCak(qw,'v','f','k','z');
        System.out.println(qw);





    }

    private static void karakterleriSeteCak(Set<Character> qw, Character... ops) {

        for (int i = 0; i < ops.length ; i++) {
            qw.add(ops[i]);

        }


    }
}
