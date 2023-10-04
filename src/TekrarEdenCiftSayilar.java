public class TekrarEdenCiftSayilar {

    public static void main(String[] args) {
        int[] sayilar = {1, 2, 7, 2, 8, 10, 10, 11, 14, 17, 17, 5, 2};
        int[] sayilar2 = new int[sayilar.length];
        int sayac = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length; j++) {
                if ((sayilar[i] == sayilar[j]) && (sayilar[i] % 2 == 0) && (i != j)) {
                    if (!tekrar(sayilar2, sayilar[i])) {
                        sayilar2[sayac] = sayilar[i];
                        sayac++;
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < sayilar2.length; j++) {
            if (!(sayilar2[j] == 0)) {
                System.out.println(sayilar2[j]);
            }
        }
    }

    public static boolean tekrar(int[] tekrarlayanSayilar, int n) {
        boolean kontrol = false;
        for (int i = 0; i < tekrarlayanSayilar.length; i++) {
            if (n == tekrarlayanSayilar[i]) {
                kontrol = true;
            }

        }
        return kontrol;
    }
}
