import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Bir sayı yazınız.");
      int a = scan.nextInt();
      
      int sayi = asalSayi(a,a-1);
      
      if (sayi==1) {
          System.out.println(a + " asal sayıdır.");
          
      } else if (sayi == 0) {
          System.out.println(a + " asal sayı değildir.");
          
      }
      
    }
    
    public static int  asalSayi (int a, int b) {
        
    if (b==1) {
        
        return 1;
        
    } else if (a%b==0)
    
    {
        return 0;
        
    } else 
    
    {
        return asalSayi(a,b-1);    
    }

  }
    
}
