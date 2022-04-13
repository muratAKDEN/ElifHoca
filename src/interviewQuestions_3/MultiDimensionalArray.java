package interviewQuestions_3;

public class MultiDimensionalArray {
    public static void main(String[] args) {

      int arr [][]={{4,5,6,},{2},{8,11}}; //Array icinde kac eleman var  method yazdir

        elemanSayisi(arr);
        System.out.println(elemanSayisi(arr));

    }

    private static int elemanSayisi(int[][] arr) {
        int sayac =0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sayac++;
            }

        }

        return sayac;


    }
}
