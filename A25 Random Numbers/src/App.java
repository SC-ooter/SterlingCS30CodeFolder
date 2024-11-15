// Program name: (A25 Random Numbers)

// Student name: (Sterling Cossar)

// Date: (November 15th 2024)

// Program Description: Assigns the variables numbers as an int, then within the loop it assigns the numbers variable as a random int and uses the conditionals to choose.... 
public class App {
    public static void main(String[] args) throws Exception {
        int Number1 = 0;
        int Number2 = 0;

        for (int i = 0; i <10; i++) {

            Number1 = (int) ( Math.random() * 1000 );
            Number2 = (int) ( Math.random() * 1000 ); 

            if (Number1 > Number2){
                System.out.println("The smallest number is " + (Number2) + "\n" + "The biggest number is " + (Number1) + "\n");
            }
            else if (Number1 < Number2){
                System.out.println("The smallest number is " + (Number1) + "\n" + "The biggest number is " + (Number2) + "\n");
            }

        }
    }
}
