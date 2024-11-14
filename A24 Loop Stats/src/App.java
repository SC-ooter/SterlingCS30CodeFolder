import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("input an int : ");
        Scanner input = new Scanner(System.in);

        int Number1 = input.nextInt();
        System.out.print("input a second int : ");

        Scanner Secondnum = new Scanner(System.in);
        int Number2 = Secondnum.nextInt(); 

        Stats stats = new Stats();
        stats.Print(Number1, Number2);
    }
}
