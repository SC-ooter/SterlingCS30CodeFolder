// Program name: (A14 Triangle Calculator)

// Student name: (Sterling Cossar)

// Date: (Thursday October 24th 2024)

// Program Description: Uses the class Functions to name all of my variables and it creates the functions to do the calculations with the variables. My app class takes the user input and calls the functions to return the perimeter and the area.

public class Functions {
    private double SideA;
    private double SideB;
    private double SideC;

    public Functions(double a, double b, double c) {
        SideA = a;
        SideB = b;
        SideC = c;

    }
    public double Triperm(){
        return SideA + SideB + SideC;
    }
    public double TriArea(){
        double area = Triperm() / 2;
        return Math.sqrt(area *(area - SideA)*(area - SideB)*(area - SideC));
    }
}
