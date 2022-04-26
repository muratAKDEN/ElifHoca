package Interview_Q7;

public class IfElse {
    // 1 den 30 kadar sayilarin 3 e bolunuyorsa feride 5 ebolunenlere murat
    // hem 3 hemhem 5 e bolunenlere rana yazdir
    public static void main(String[] args) {
        int a=30;
        for (int i = 1; i <=a ; i++) {
            if (i%3==0&& i%5==0) {
                System.out.println("rana");
            } else if (i%5==0) {
                System.out.println("murat" + " ");

            }else if (i%3==0){
                System.out.println("feride"+ " ");
            }else System.out.println(i);

        }
    }
}
