import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    
    
    int [][] matris = { {2,5,7}, {8,3,5}, {4,7,3} };
    int [][] transpoz = new int [3][3];
    
    for (int i=0; i<3; i++) {
        for (int j=0; j<3; j++) {
            System.out.print (matris[i][j] + " ");
            
        }
        System.out.println();
    }
    
    System.out.println();
    
    for (int i=0; i<3; i++) {
        for (int j=0; j<3; j++) {
        transpoz[i][j]=matris[j][i];
        System.out.print (transpoz[i][j] + " ");
    }
    System.out.println();

    }
    
    }
}
