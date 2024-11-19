import java.util.Scanner;
public class App {
    private static Scanner input = new Scanner(System.in);
    private static int[]nums = null; // declare the array

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.print("How many numbers would you like to input? ");
        int SIZE = input.nextInt();

        nums = new int[SIZE];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Please enter an integer: ");
            nums[i] = input.nextInt();
        }  
        printARR();

        //Double the array elements
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * 2;
        }
        printARR();
    }
    private static void printARR(){
        System.out.println("Your list of numbers is: ");
        for(int i = 0; i < nums.length-1;i++){
            System.out.print(nums[i] + ", ");
        }
        //Outputs the last value with a new line
        System.out.println(nums[nums.length-1] + ". ");
    }
}
