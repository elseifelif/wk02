import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int sayi2 = 0;
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı yazınız.");
        int sayi = scan.nextInt();
        int n = sayi;
        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            sayi2 = (sayi2 * 10) + temp;
        }
        if (sayi == sayi2) {
            System.out.println(sayi + " palindrom bir sayıdır.");
        } else {
            System.out.println(sayi + " palindrom bir sayı değildir.");
        }
    }
}
