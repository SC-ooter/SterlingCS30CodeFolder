// Program name: (A17 Miles Per Hour)

// Student name: (Sterling Cossar)

// Date: (October 28th 2024)

// Program Description: Assigns all the vaiables here then prints out what the user needs to do. When the user input the values the functions will put the values in the equations and out put how fast the person was going.

public class MPH{
    private double TimeH;
    private double TimeM;
    private double Miles;

    public MPH(double a, double b, double c){
        TimeM = a;
        TimeH = b;
        Miles = c;

    }
    public double Minutes(){
        double total = (double)TimeH + (TimeM / 60);
        return Miles / total;
    }

}

