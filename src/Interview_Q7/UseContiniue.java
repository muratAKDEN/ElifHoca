package Interview_Q7;

public class UseContiniue {
   //Girilen bir Str nin harflerini teker teker ekrana yazdir alt alta olsun,
   // bosluk veya a harfi gelirse bunlari yazmasin
    public static void main(String[] args) {
        String a="ali veli can  han tan ";
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i,i+1).contains("a")||a.substring(i,i+1).contains(" ")){
                continue;// bu satir calisinca dongunun basina gider

            }
            System.out.println(a.charAt(i));
        }
    }
}
