package Interview_Q7;


public class Random {
    // size i 5 olan bir arr olustur ve 1-10 arasi random deger ata . 3 method olustur
    // 1. method sayilari 2. toplami 3. max degeri yazdirsin
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(15);
        }
        sayilar(arr);
        topla(arr);
        maxValue(arr);

    }

    private static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);

        }
        System.out.println(max);
    }

    private static void topla(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.print(toplam);
        System.out.println();
    }

    private static void sayilar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
