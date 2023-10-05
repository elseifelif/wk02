public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1" , 15 , 100, 90, 0);
        Player player2 = new Player("Player2" , 10 , 95, 100, 0);
        Game r = new Game(player1,player2 , 90 , 100);
        r.run();
    }
}
