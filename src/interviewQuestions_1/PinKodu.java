package interviewQuestions_1;

import java.util.Scanner;

public class PinKodu {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String pin="Murat123";
        int girisHakki=3;


        while (true){
            System.out.println("pin giriniz");
           String girilenPin=scan.nextLine();

            if (girilenPin.equals(pin)){
                System.out.println("hosgeldiniz");
                break;
            }else {
                System.out.println(girisHakki-1+"  hakiniz kaldi");
                girisHakki--;
            }

            if (girisHakki==0){
                System.out.println("sim kart bloke oldu");
                break;

            }





        }









    }
}
