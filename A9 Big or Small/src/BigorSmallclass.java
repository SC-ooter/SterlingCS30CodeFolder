// Program name: (A9 Big or Small)

// Student name: (Sterling Cossar)

// Date: (Tuesday October 8th 2024)

// Program Description: This is my Big and Small Class. In this class I use two user inputs to gather two 
//integers then use three different if statements to compare them to one another. 

import java.util.Scanner;
public class BigorSmallclass { 
        Scanner keyboard = new Scanner(System.in);

    public void UserInput(){
        int intOne, intTwo;
        System.out.print("Enter an integer : ");
        intOne = keyboard.nextInt();
        System.out.print("Enter another integer : ");
        intTwo = keyboard.nextInt();

        if (intOne > intTwo){
            System.out.println("Yes " + intOne + " is greater than " + intTwo);
        }
        if (intOne < intTwo){
            System.out.println("No " + intOne + " is not greater than " + intTwo);
        }
        if (intOne == intTwo){
            System.out.println(intOne + " is equal to " + intTwo);
        }
}
}
