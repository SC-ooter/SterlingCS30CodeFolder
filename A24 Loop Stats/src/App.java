import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("intput an int : ");
        Scanner input = new Scanner(System.in);

        int Number1 = input.nextInt();

        
        Stats.loop(Number1);
        Stats.even(Number1);
    }
}
