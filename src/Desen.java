import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Lütfen 0'dan büyük bir sayı yazınız.");
        
        sayi = input.nextInt();
        
        desen (sayi,sayi,1);
        
    }

    public static void desen (int baslangicDegeri, int n, int desenAzalan) {
        
        if (n <= 0 && desenAzalan==1) {
            System.out.print(n + " ");
            desenAzalan = 0;
            desen(baslangicDegeri, n+5,desenAzalan);
        } 
        
        if (n > 0 && desenAzalan==1){
            System.out.print(n + " ");
            desen(baslangicDegeri, n - 5,desenAzalan);
        }
        
        if (n>0 && desenAzalan==0) {
            System.out.print(n + " ");
            if (n+5 != baslangicDegeri) {
                desen(baslangicDegeri,n+5, desenAzalan);
            } else {
                System.out.print (n+5);
            }
            
            
        }

    }
}
