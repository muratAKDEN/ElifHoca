package interview_Q8;

public class WrapperClassTask {
    public static void main(String[] args) {
        // int kabul eden metod create ediniz
        //ve int 2 katini dondur. wrapper Class yontemi ile overload et .

        twice(5);

        System.out.println(twice(5));

        Integer sayi =7;

        System.out.println(twice(sayi));




    }

    private static int twice(int sayi) {

        return sayi*2;
    }
    private static Integer twice(Integer sayi) {

        return sayi*2;
    }
}
