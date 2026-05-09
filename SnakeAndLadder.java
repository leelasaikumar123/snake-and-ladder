import java.util.Random;

public class SnakeAndLadder{
    public static void main(String[] args) {
      Random random=new Random(); 
     System.out.println("Welcome to Snake And Ladder Simulator");
       int first_player_score=0; 

while (first_player_score <100) {
        int dice=random.nextInt(6)+1;
       int move=random.nextInt(3);
       if(move==0){
        first_player_score=first_player_score+0;
       } 
      else  if(move==1){
        if(dice+first_player_score<=100){
            first_player_score=first_player_score+dice;
        }
    }
      else{
        if(first_player_score<dice){
            first_player_score=first_player_score-0;
        }
        else{
            first_player_score=first_player_score-dice;
        }
      }

}
System.out.println(first_player_score);
    }
}