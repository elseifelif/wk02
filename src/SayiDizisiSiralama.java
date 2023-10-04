import java.util.Arrays;
import java.util.Scanner;

public class SayiDizisiSiralama {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını yazınız.");
        int sayi = scan.nextInt();
        int enKucuk=Integer.MAX_VALUE;
        int enKucukIndis=0;

        int [] sayilar = new int[sayi];
        int [] sayilar2 = new int[sayi];
        int indis=0;

        for (int j=0; j<sayi; j++){
            System.out.println("Sayı "+(j+1)+": ");
            sayilar[j]=scan.nextInt();
        }
        for (int n=0; n<sayilar.length; n++) {
            for (int i = 0; i < sayilar.length; i++) {
                if (enKucuk > sayilar[i]) {
                    enKucuk = sayilar[i];
                    enKucukIndis=i;
                }
            }
            sayilar2[indis++] = enKucuk;
            sayilar[enKucukIndis] = Integer.MAX_VALUE;
            enKucuk=Integer.MAX_VALUE;
        }
        System.out.println("Dizideki elemanların küçükten büyüğe sıralaması:");
        System.out.println(Arrays.toString(sayilar2));
    }
}
