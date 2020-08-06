import java.util.Random;
import java.util.Scanner;
public class Heads_or_Tails{
  public static void main(String[] args){
    int ROUND = 3;
    int NumberOfHeads = 0;
    int NumberOfTails = 0;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please name: ");
    String name = scanner.nextLine();
    System.out.print("Hi, " + name);

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

    
  }
}
