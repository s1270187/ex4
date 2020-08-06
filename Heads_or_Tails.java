import java.util.Random;

public class Heads_or_Tails{
  public static void main(String[] args){
    int ROUND = 3;
    int NumberOfHeads = 0;
    int NumberOfTails = 0;

    Random random = new Random();
    

    
    System.out.println("Tossing a coin");

    for (int i = 1;i<=ROUND;i++){
      if(random.nextInt(2)>0){
        NumberOfHeads++;
        System.out.println("Round " + i + ": Heads");
      }
      else{
        NumberOfTails++;
        System.out.println("Round " + i + ": Tails")
      }
    }
    System.out.println("Heads: " + NumberOfHeads + ", Tails: " + NumberOfTails);

    if (NumberOfHeads > NumberOfTails){
      System.out.print("You won");
    }
    else{
      System.out.print("You lost");
    }
  }
}
