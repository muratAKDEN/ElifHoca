package interviewQ_4;

public class MultipleMethodVarargs {
    public static void main(String[] args) {
        // 4 ogtencinin notlarini sisteme gir be her bir ogr. icin not ort hesaplayan method yaz


        ortalamaBul("Ali",60,70,80,90,99,80);
        ortalamaBul("Dali",10,70,30,20,99,80);
        ortalamaBul("Cali",65,70,85,99,80);
        ortalamaBul("Bali",90,99,80);


    }

    public  static  void ortalamaBul(String isim, double ...notlar){
        double ortalama=0;
        for (double w:notlar) {
            ortalama+=w;
        }
        System.out.println(" GNO="+ortalama/notlar.length);
    }


}
