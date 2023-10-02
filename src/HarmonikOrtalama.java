import java.util.Arrays;
public class HarmonikOrtalama {
    public static void main(String[] args) {
        double [] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double toplam = 0;
        double ortalama;

        System.out.println("Harmonik ortalaması bulunacak olan sayılar:");
        System.out.println(Arrays.toString(sayilar));

        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + (1 / sayilar[i]);
        }
        ortalama = 10 / toplam;
        System.out.println("Sayıların harmonik ortalaması: " + ortalama);

    }
}
