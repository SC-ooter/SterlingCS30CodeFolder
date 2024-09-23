// Imports the scanner class into the program
import java.util.Scanner; 


public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);


        System.out.print("Enter an Integer: ");
        int num = keys.nextInt();
        keys.nextLine();
        System.out.println("You selected the number: " + num);

        System.out.print("What in your name? ");
        String name = keys.nextLine();
        System.out.println("You entered: " + name);

    }
}
