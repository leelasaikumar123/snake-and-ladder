import java.util.Random;

public class SnakeAndLadder{
    public static void main(String[] args) {
      Random random=new Random(); 
     System.out.println("Welcome to Snake And Ladder Simulator");
       int first_player_score=0; 
       int dice=random.nextInt(6)+1;
       int move=random.nextInt(3);
       if(move==0){
        System.out.println("No Move Player Will be in same position");
       } 
      else  if(move==1){
        System.out.println("The players Score is Increased by : "+dice);
       }
      else{
        System.out.println("The Players Score Is Decreased By : " +dice);
      }
    }
}