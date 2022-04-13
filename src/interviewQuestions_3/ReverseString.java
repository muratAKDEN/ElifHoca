package interviewQuestions_3;

public class ReverseString {
    public static void main(String[] args) {
        // Str i ters vevir
        // 1 . yol StringBuilder, 2. yol String classi, 3. yol. Array ile method olusturarak
        String input= "All is well";
        StringBuilder a=new StringBuilder();
        a.append(input);
        a.reverse();
        System.out.println(a);
        System.out.println("************");

        String asd="All is well, too";
        for (int i = asd.length()-1; i >=0 ; i--) {
            System.out.print(asd.charAt(i));

        }

        System.out.println("*********************");
        tersArray(asd);


    }

    private static void tersArray(String asd) {
        char arr []=asd.toCharArray();// Bu method String bir veriyi karakterlere char tipinde ayirir.

        for (int i = asd.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }


    }
}
