// Program name: (A22 Leap Year)

// Student name: (Sterling Cossar)

// Date: (October 30th 2024)

// Program Description:Uses a user input then checks if the value inputed is divisible by 4 and 400. It then outputs whether it is or is not a leap year.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a year : ");
        double Year = input.nextDouble();
        LeapYear LeapyearCalc = new LeapYear();
        LeapyearCalc.LeapyearCalc();

        if (Year % 4 == 0||Year %400==0){;
            System.out.print("this is a leap year");
        }
        else {
            System.out.print("This is not a leap Year");
        }
    }
}
