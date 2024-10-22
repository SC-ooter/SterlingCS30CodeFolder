
// Program name: (A13 Geometry Calculator)

// Student name: (Sterling Cossar)

// Date: (Tuesday October 22nd 2024)

// Program Description: This program uses the function decide and conditionals to get the user to choose what they want to calculate. The user will then input a value and the code will use that value in and equation and output the answer.


import java.util.Scanner;

public class FunctionCaller {
    public void Decide(){
        Scanner input = new Scanner(System.in);
        int Choice1;
        System.out.print("Make your choice! Input 1 if you want to calculate rectangles, 2 if you want to calculate squares, and 3 if you want to calculate circles : ");
        Choice1 = input.nextInt();

        if (Choice1==1){
            Scanner length = new Scanner(System.in);
            double Length1, Width1;
            System.out.print("Rectangles :: Enter a length : ");
            Length1 = length.nextInt();
            Scanner width = new Scanner(System.in);
            System.out.print("Enter a width : ");
            Width1 = width.nextInt();
            System.out.println("The perimeter of your rectangle is " + ((2*Length1)+(2*Width1)) + " units"); 
        }

        else if (Choice1==2){
            Scanner side = new Scanner(System.in);
            double Side;
            System.out.println("Please enter a length for a side of a cube to find it's surface area : ");
            Side = side.nextInt();
            System.out.println("The surface area of your cube is " + (6 * (Math.pow(Side,2))) + " units");
        }

        else if (Choice1==3){
            Scanner circle = new Scanner(System.in);
            double Circle;
            System.out.println("Circles : Please enter a value that you would like to use as a radius for your circle :");
            Circle = circle.nextInt();
            System.out.println("The area of your circle is " + ((Math.PI) * (Math.pow(Circle,2))) + " units");
        }

        else if (Choice1 != 1){
            System.out.println("That is not a valid input, please rerun the program.");

        }

    }
    

}
