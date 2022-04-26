package Interview_Q7;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String arr [][]={{"asd","fgh","kl"},{"er","rt","op"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }

        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
    }
}
