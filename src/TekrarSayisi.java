import java.util.Arrays;

public class TekrarSayisi {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 7, 2, 8, 10, 10, 11, 14, 17, 17, 5, 2};
        String[] ekranaYazdirilanMesaj = new String[sayilar.length];
        int sayac;
        int indis = 0;
        int sayac2;
        String bilgiMesaji;

        for (int i = 0; i < sayilar.length; i++) {
            sayac2 = 0;
            sayac = 0;
            for (int j = 0; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    sayac++;
                }
            }
            bilgiMesaji = (sayilar[i] + " değerinin tekrar sayısı: " + sayac);

            for (int n = 0; n < ekranaYazdirilanMesaj.length; n++) {
                if (bilgiMesaji.equals(ekranaYazdirilanMesaj[n])) {
                    sayac2++;
                }
            }
            if (sayac2 == 0) {
                ekranaYazdirilanMesaj[indis++] = bilgiMesaji;
            }
        }
        System.out.println("Dizi: "+ Arrays.toString(sayilar));
        for (int x = 0; x < ekranaYazdirilanMesaj.length; x++) {

            if (ekranaYazdirilanMesaj[x]!=null) {
                System.out.println(ekranaYazdirilanMesaj[x]);
            }

        }
    }
}
