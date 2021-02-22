public class SnakesLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and ladder program");
        int player1_Position = 0;
        System.out.println("Player 1 start with position: " + player1_Position);
        double die = Math.floor(Math.random() * 10) % 6 + 1;
        player1_Position += die;
        System.out.println("Player 1 start with position: " + player1_Position);
    }
}

