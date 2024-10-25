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
        double total = (double) TimeH + (TimeM / 60);
        if (total == 0);{
            return 0;
        }
    }
    


    }

