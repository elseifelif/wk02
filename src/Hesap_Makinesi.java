import java.util.Scanner;

public class Hesap_Makinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama İşlemi Sonucu: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma İşlemi Sonucu: " + result);
        return result;
    }
    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma İşlemi Sonucu: " + result);
        return result;
    }
    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı 0'a bölünemez.");
            return 0;
        } else {
            int result = a / b;
            System.out.println("Bölme İşlemi Sonucu: " + result);
            return result;
        }
    }
    static double power(int a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üslü Sayı Hesaplama İşlemi Sonucu: " + result);
         return result;
    }
    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktoriyel Hesaplama İşlemi Sonucu: " + result);
        return result;
    }
    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod Alma İşlemi Sonucu: " + result);
        return result;
    }
    static void rectangle(int a, int b) {
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Dikdörtgenin Alanı: " + area);
        System.out.println("Dikdörtgenin Çevresi: " + perimeter);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int select;
        System.out.println("1- Toplama İşlemi \n"
                + "2- Çıkarma İşlemi \n"
                + "3- Çarpma İşlemi \n"
                + "4- Bölme İşlemi \n"
                + "5- Üslü Sayı Hesaplama \n"
                + "6- Faktoriyel Hesaplama \n"
                + "7- Mod Alma \n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı \n"
                + "0- Çıkış Yap");

        while (true) {
            System.out.println("Lütfen bir işlem seçiniz: ");

            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            int a = 0;
            int b = 1;
            int c = 0;

            if (select != 6) {
                System.out.println("İşlem yapmak istediğiniz sayıları yazınız: ");
                System.out.println("1. Sayı: ");
                a = scan.nextInt();
                System.out.println("2. Sayı: ");
                b = scan.nextInt();

            } else if (select == 6) {
                System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı yazınız: ");
                c = scan.nextInt();
            }

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factorial(c);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.");
                    break;
            }
        }
    }
}
