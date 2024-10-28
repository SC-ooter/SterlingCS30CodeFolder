import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {      
        Scanner input = new Scanner(System.in);
        System.out.print("Pease enter the time elapsed in Hours : ");
        double TimeH = input.nextDouble();


        System.out.print("Please enter the time elapsed in minutes : ");
        double TimeM = input.nextDouble();

        
        System.out.print("Please enter the miles traveled : ");
        double Miles = input.nextDouble();


        MPH runner = new MPH(TimeM, TimeH, Miles);
        double Min = runner.Minutes();
        System.out.println("If you were traveling for " + TimeH + " hours and " + TimeM + " minutes you would have been going " + Min + " miles per hour.");





    }
}
