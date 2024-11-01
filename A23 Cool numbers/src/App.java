import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value to check for cool numbers : ");
        int numbers = input.nextInt();

        int countcoolnumbers = CoolNums.countcoolnumbers(numbers);
        System.out.println(countcoolnumbers);
        }
    }