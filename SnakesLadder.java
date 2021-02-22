public class SnakesLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and ladder program");
        int player1_Position = 0;
        while(player1_Position != 100){
            int option = (int) Math.floor(Math.random() * 10) % 3;
            int die = (int) Math.floor(Math.random() * 10) % 6 + 1;
            if(option == NO_PLAY){
                System.out.println("no need to play and position is: " + player1_Position );
            }else if(option == LADDER){
                player1_Position += die;
                player1_Position = player1_Position > 100 ? player1_Position - die : player1_Position;
                System.out.println("Position of player is: " + player1_Position);
            }else{
                player1_Position -= die;
                player1_Position = player1_Position < 0 ? 0 : player1_Position;
                System.out.println("Position of player is: " + player1_Position);
            }

        }
        System.out.println("player 1 won......!!!");
       
        
    }
}
