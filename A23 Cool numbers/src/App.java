import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value to check for cool numbers : ");
        int numbers = input.nextInt();

        CoolNums coolnums = new CoolNums();
        System.out.println(numbers);
        while ((numbers % 3 == 1) && (numbers % 4 == 1) && (numbers % 5 == 1) && (numbers % 6 == 1)){
            System.out.print("weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        }
    }
}