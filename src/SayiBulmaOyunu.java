import java.util.Random;
import java.util.Scanner;

public class SayiBulmaOyunu {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        int guess;
        int[] guesses = new int[5];

        Scanner scan = new Scanner(System.in);
        int right = 0;
        System.out.println("Sayı tahmin oyununa hoşgeldiniz.");

        while (right < 5) {

            System.out.println("Lütfen bir sayı yazınız: ");
            guess = scan.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0 ile 99 arasında bir sayı yazınız.");
                continue;
            }
            if (guess == number) {
                System.out.println("Tebrikler, doğru tahmin.");
                System.out.println("Tahmin ettiğiniz sayı: " + guess);
                break;
            } else {
                System.out.println("Yanlış tahmin.");
                right++;

                if (right == 5) {
                    System.out.println("Kaybettiniz.");
                    System.out.println("Tahminleriniz: ");
                    for (int i : guesses) {
                        if (i != 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Gizli sayı: " + number);
                    break;

                }

                if (guess < number && right != 5) {
                    System.out.println("Daha büyük bir sayı yazınız.");
                } else if (guess > number && right != 5)
                    System.out.println("Daha küçük bir sayı yazınız.");

            }
            guesses[right] = guess;

            System.out.println("Kalan hak: " + (5 - right));

        }

    }
}
