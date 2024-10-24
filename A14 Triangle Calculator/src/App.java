import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for a side of a triangle : ");
        double SideA = input.nextDouble();

        System.out.print("Input the second side length : ");
        double SideB = input.nextDouble();

        System.out.print("Input the third side length : ");
        double SideC = input.nextDouble();

        Functions runner = new Functions(SideA, SideB, SideC);
        double perimeter = runner.Triperm();
        System.out.println("The perimeter of the triangle is "+ (perimeter));

        double area = runner.TriArea();
        System.out.println("The area of the triangle is " + (area));




    }

}
