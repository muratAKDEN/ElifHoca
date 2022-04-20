package interviewQ6;

public class FrequencyOfChars {
    public static void main(String[] args) {
        //input= AAABBCDDD
        //output=A3B2C1D3

        String a = "AAABBCDDDD";
        System.out.println(a);
        a = tekrarBul(a);
        System.out.println(a);

    }

    private static String tekrarBul(String a) {
        String b = "";

        for (int i = 0; i < a.length()-1; i++) {
            int sayac = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.substring(i, i + 1).equals(a.substring(j, j + 1))) {

                    sayac++;
                }

            }
            if (!b.contains(a.substring(i, 1 + i))) {
                b += a.substring(i, i + 1) + (sayac);
            } else sayac = 0;
        }


        return b;
    }
}
