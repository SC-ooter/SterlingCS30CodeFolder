public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Counting loop
        int num = 7;
        while (num > 0) {
        System.out.println(num);
        num --;
    }

        //Game loop or program loop 
        boolean game = true;
        while (game) {
            //progam code or game code or calculations
            System.out.println("Hello universe");

            // kill switch play again 
            System.out.println("Do you want to play again?");
            String userinput = "no";

            if (userinput.equals("no")){
                game = false;
            }

        }
        //Standard For loop in java
            //three Conditions 
            //for (where we start; where we end; step size)
        for(int i =10; i >0; i--){
            System.out.println("The number is " + i);
            System.out.println("throw it off");
        }

        int x = 10;
        while (x>0){
            System.out.println("The number is " +x);
            x--;

        }



    }
}