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
        if (Choice1==2){
            Scanner side = new Scanner(System.in);
            double Side;
            System.out.println("square");
            Side = side.nextInt();
            System.out.println(6  *(Math.pow(Side,2)));
        }

        else if (Choice1 != 1){
            System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");

        }

    }
    

}
