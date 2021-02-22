public class SnakesLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and ladder program");
        int die_Count = 0;
        int [] player_Position = new int [2];
        int curr = 0;

        while(player_Position[curr] != 100){
            int option = (int) Math.floor(Math.random() * 10) % 3;
            int die = (int) Math.floor(Math.random() * 10) % 6 + 1;
            if(option == NO_PLAY){
                System.out.println("no need to play and Position of player " + (curr + 1) + " is: " + player_Position[curr] );
            }else if(option == LADDER){
                player_Position[curr] += die;
                player_Position[curr] = player_Position[curr] > 100 ? player_Position[curr] - die : player_Position[curr];
                System.out.println("Position of player " + (curr + 1) + " is: " + player_Position[curr]);
                curr = (curr + 1) % 2;
            }else{
                player_Position[curr] -= die;
                player_Position[curr] = player_Position[curr] < 0 ? 0 : player_Position[curr];
                System.out.println("Position of player " + (curr + 1) + " is: " + player_Position[curr]);
            }

            die_Count++;
            curr = (curr + 1) % 2;
        }
        System.out.println("player " + (curr + 1) + " won....!!!");
        System.out.println("no of time die thrown is: " + die_Count);
       
        
    }
}
