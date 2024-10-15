
// Program name: (A12 FtoC converter)

// Student name: (Sterling Cossar)

// Date: (Tuesday October 15th 2024)

// Program Description: Uses perameters to set the Fehrenheit and the Celcius then uses an equation to convert the value to either Fehrenheit or celcius



public class App {
    public static void main(String[] args){
        Functions test = new Functions();
        test.settemp(98, -40);
        test.FtoC();
        test.CtoF();

        test.settemp(10, 25);
        test.FtoC();
        test.CtoF();

        test.settemp(8, 33);
        test.FtoC();
        test.CtoF();

        test.settemp(115, 17);
        test.FtoC();
        test.CtoF();



    }
    
}
