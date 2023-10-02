import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sayilar = {-10, -35, -4, 5, 22, 111, 43, -1000, 973};
        System.out.println("Sayı dizisi: " + Arrays.toString(sayilar));
        System.out.println("Lütfen bir sayı yazınız.");
        int sayi = scan.nextInt();
        int farkPozitif = Integer.MAX_VALUE;
        int farkNegatif = Integer.MAX_VALUE;
        int enYakinBuyukSayi = sayilar[0];
        int enYakinKucukSayi = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayi - (sayilar[i]) > 0) {
                if ((sayi - (sayilar[i])) < Math.abs(farkPozitif)) {
                    enYakinKucukSayi = sayilar[i];
                    farkPozitif = sayi - sayilar[i];
                }
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            if (sayi - (sayilar[i]) < 0) {
                if (Math.abs(sayi - sayilar[i]) < Math.abs(farkNegatif)) {
                    enYakinBuyukSayi = sayilar[i];
                    farkNegatif = sayi - sayilar[i];
                }
            }
        }

        int sayac1 = 0;
        int sayac2 = 0;

        for (int j = 0; j < sayilar.length; j++) {
            if (sayi > sayilar[j]) {
                sayac1++;
            }
        }

        for (int i = 0; i < sayilar.length; i++) {
            if (sayi < sayilar[i]) {
                sayac2++;
            }
        }

        if (sayac1 == sayilar.length) {
            System.out.println("Dizide " + sayi + " değerinden büyük sayı bulunmamaktadır.");
            System.out.println(sayi + " değerinden küçük dizideki en yakın sayı: " + enYakinKucukSayi);
        } else if (sayac2 == sayilar.length) {
            System.out.println("Dizide " + sayi + " değerinden küçük sayı bulunmamaktadır.");
            System.out.println(sayi + " değerinden büyük dizideki en yakın sayı: " + enYakinBuyukSayi);
        } else {
            System.out.println(sayi + " değerinden küçük dizideki en yakın sayı: " + enYakinKucukSayi);
            System.out.println(sayi + " değerinden büyük dizideki en yakın sayı: " + enYakinBuyukSayi);
        }
    }
}
