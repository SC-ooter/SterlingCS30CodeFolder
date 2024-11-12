import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("input an int : ");
        Scanner input = new Scanner(System.in);

        int Number1 = input.nextInt();
        System.out.print("input a second int : ");

        Scanner Secondnum = new Scanner(System.in);
        int Number2 = Secondnum.nextInt(); 

        // Stats.loop(Number1);
        Stats.even(Number1,Number2);
        Stats.odd(Number1,Number2);
        // Stats.even(Number2);
        // Stats.odd(Number2);
        Stats.total(Number1,Number2);
        Stats.loop(Number1, Number2);

    }
}
