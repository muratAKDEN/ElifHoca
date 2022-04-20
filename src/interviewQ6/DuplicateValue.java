package interviewQ6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValue {
    public static void main(String[] args) {
        // write a code returning the duplicate chars in a Str Array

        String str = "Javaissoeasy";
        //Output=[a,s]
        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));//[J, a, v, a, i, s, s, o, e, a, s, y]
        ArrayList<Character> output=new ArrayList<>();

        for (int i = 0; i < arr. length; i++) {
            for (int j = i+1; j < arr.length; j++) {
if (arr[i]==arr[j]&&!output.contains(arr[j])){
    output.add(arr[j]);
}

            }
        }

        System.out.println(output);
    }
}
