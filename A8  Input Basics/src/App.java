// Program name: (A8 Input Basics)

// Student name: (Sterling Cossar)

// Date: (September 26th 2024)

// Program Description:

import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
  System.out.println("Hello, World!");
  
  Scanner keyboard = new Scanner(System.in);

  int intOne, intTwo; 

  System.out.print("Enter an integer :: ");

  intOne = keyboard.nextInt();

  System.out.print("Enter another integer :: ");

  intTwo = keyboard.nextInt();

  System.out.println("integer one = " + intOne);

  System.out.println("integer two = " + intTwo);

  System.out.println("intOne + intTwo = " + (intOne + intTwo));

  // Doubles

  double doubleOne, doubleTwo; 

  System.out.print("Enter a double :: ");

  doubleOne = keyboard.nextDouble();

  System.out.print("Enter another double :: ");

  doubleTwo = keyboard.nextDouble();

  System.out.println("Double one = " + (double) doubleOne);

  System.out.println("Double two = " + (double) doubleTwo);

  System.out.println("doubleOne + doubleTwo = " + (double) (doubleOne + doubleTwo));

 }
}