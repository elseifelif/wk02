import java.util.Scanner;

public class PalindromeWords {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime yazınız.");
        String kelime = scan.next();
        String reverse="";

        String [] kelimeArray = kelime.split("");

        for (int i=kelimeArray.length-1; i>=0; i--) {
            reverse +=kelimeArray[i];

        }
        if (reverse.equals(kelime)) {
            System.out.println(kelime+" palindrom bir kelimedir.");
        } else {
            System.out.println(kelime + " palindrom bir kelime değildir.");
        }

    }
}
