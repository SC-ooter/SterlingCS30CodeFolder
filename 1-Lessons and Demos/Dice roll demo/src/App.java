import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int numRolls;
        int[] outcomes;
        int current;



        System.out.println("How many dice do you want to roll");
        numRolls = keys.nextInt();
        outcomes = new int[numRolls]; // Create a position for each roll

        for (int roll = 0;roll<numRolls; roll++){
            // Rolling "Two dice " - not nextInt(x)is a number from 0 < x < x

            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            outcomes[roll] = dice1 + dice2;
            System.out.println("Roll number " + roll + " - Dice1 = " + dice1 + " Dice2 = " + dice2 + " is " + outcomes[roll]);
        }
        System.out.println("\nThe Game Stats: ");

        int total = 0;
        double average = 0;
        for (int i = 0;i < numRolls; i++){
            total = total + outcomes[i];
        }
        average = (double) total/numRolls;
        System.out.println("Total Score: "+ total);
        System.out.println("Average Score: "+ average);

    }
}
