import java.util.Scanner;

public class BigorSmallclass { 
        Scanner keyboard = new Scanner(System.in);

    public void inpt(){
        int intOne, intTwo;
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter another integer :: ");
        intTwo = keyboard.nextInt();

        if (intOne > intTwo){
        System.out.println("Yes " + intOne + " is greater than " + intTwo);
        }

        if (intOne < intTwo){
        System.out.println("No " + intOne + " is not greater than " + intTwo);
        }

}

}
