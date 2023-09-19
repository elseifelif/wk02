import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Sayı ve üs değerini yazınız.");
    //Değişkenler
    int power, number;

    Scanner scan = new Scanner (System.in);

    System.out.println("Taban değerini yazınız: " );
    number = scan.nextInt();
    
    System.out.println("Üs değerini yazınız: " );
    power = scan.nextInt();
    
    System.out.println("Sonuç: " + usHesaplama(number, power));

  }

  public static int usHesaplama (int sayi1, int sayi2) {

    if(sayi2 == 0) {
      return 1;
      
    } else {
      return sayi1 * usHesaplama(sayi1, sayi2-1);
 
    } 
  
  }
  
}
