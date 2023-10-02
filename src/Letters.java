import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] letter = new String[6][4];
        System.out.println("A, B, C harfleri arasından ekrana yazdırmak istediğinizi seçiniz.");
        String harf = scan.next();
        switch (harf) {
            case "A", "a" -> {
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        if (i == 0 || i == 2) {
                            letter[i][j] = " * ";
                        } else if (j == 0 || j == 3) {
                            letter[i][j] = " * ";
                        } else {
                            letter[i][j] = "   ";
                        }

                    }
                }
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        System.out.print(letter[i][j]);
                    }
                    System.out.println();
                }
                break;
            }
            case "B", "b" -> {
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        if (i == 0 || i == 2 || i == 5) {
                            letter[i][j] = " * ";
                        } else if (j == 0 || j == 3) {
                            letter[i][j] = " * ";
                        } else {
                            letter[i][j] = "   ";
                        }
                    }
                }
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        System.out.print(letter[i][j]);
                    }
                    System.out.println();
                }
                break;
            }
            case "C", "c" -> {
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        if (i == 0 || i == 5) {
                            letter[i][j] = " * ";
                        } else if (j == 0) {
                            letter[i][j] = " * ";
                        } else {
                            letter[i][j] = "   ";
                        }
                    }
                }
                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[0].length; j++) {
                        System.out.print(letter[i][j]);
                    }
                    System.out.println();
                }

                break;
            }
            default -> {
                System.out.println("Hatalı seçim yapıldı.");
            }
        }
    }
}
