import java.util.Random;

public class Game {
    Player player1;
    Player player2;
    int minWeight;
    int maxWeight;
    Random randomNumber = new Random();

    public Game (Player player1, Player player2, int minWeight, int maxWeight) {
        this.player1 = player1;
        this.player2 = player2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void run() {

        if (checkWeight())
        {
            while (player1.health > 0 && player2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                int n= randomNumber.nextInt(0,2);
                if (n==1) {
                    player2.health = player1.hit(player2);
                    if (isWin()){
                        break;
                    }
                    player1.health = player2.hit(player1);
                    if (isWin()){
                        break;
                    }
                    printScore();

                } else {
                    player1.health = player2.hit(player1);
                    if (isWin()){
                        break;
                    }
                    player2.health = player1.hit(player2);
                    if (isWin()){
                        break;
                    }
                    printScore();

                }

            }

        } else {
            System.out.println("Sporcuların ağırlıkları uygun değildir.");
        }

    }

    public boolean checkWeight() {
        return (player1.weight >= minWeight && player1.weight <= maxWeight) &&
                (player2.weight >= minWeight && player2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (player1.health == 0) {
            System.out.println("Maçı kazanan : " + player2.name);
            return true;
        } else if (player2.health == 0){
            System.out.println("Maçı kazanan : " + player1.name);
            return true;
        }

        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(player1.name + " Kalan can \t: " + player1.health);
        System.out.println(player2.name + " Kalan can \t: " + player2.health);
    }
}
