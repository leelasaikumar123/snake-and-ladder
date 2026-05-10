import java.util.*;

public class SnakeAndLadder{
   public static Random random=new Random();
    public static void main(String[] args) {
       
     System.out.println("Welcome to Snake And Ladder Simulator");
       int first_player_score=0; 
       int second_player_score=0;
       int moves=0;
       
       List<List<Integer>> firstPlayer=new ArrayList<>();
    List<List<Integer>> secondPlayer=new ArrayList<>();
while (first_player_score <100 && second_player_score<100) {
      moves++;
      first_player_score=first_player_score+returnPoints(first_player_score);
      List<Integer> list1=new ArrayList<>();
      list1.add(moves);
      list1.add(first_player_score);
      firstPlayer.add(list1);
      second_player_score=second_player_score+returnPoints(second_player_score);
    List<Integer> list2=new ArrayList<>();
      list2.add(moves);
      list2.add(second_player_score);
      secondPlayer.add(list2); 
}
if(first_player_score==100){
    System.out.println("The Player 1 won");
    System.out.println(firstPlayer);
}
else{
       System.out.println("The Player 2 won");
    System.out.println(secondPlayer); 
}
    }
    public static int returnPoints(int playerScore){
                int dice=random.nextInt(6)+1;
       int move=random.nextInt(3);
       if(move==0){
        return 0;
       } 
      else  if(move==1){
        if(dice+playerScore<=100){
            return dice;
        }
        else{
            return 0;
        }
    }
      else{
        if(playerScore<dice){
            return 0;
        }
        else{
            return dice*-1;
        }
      }
    
    }
}
