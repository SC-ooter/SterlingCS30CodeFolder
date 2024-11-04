// Program name: (A23 Cool numbers)

// Student name: (Sterling Cossar)

// Date: (November 1st 2024)

// Program Description: This program uses the user input and runs the input through different modulus calculations to see what numbers from the users input to six have a remainder of 1 when you divide it by 6,5,4,3.


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