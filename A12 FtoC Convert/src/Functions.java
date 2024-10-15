public class Functions {
    public static double num1,num2;

    public void settemp(double a, double b){
        num1 = a;
        num2 = b;
    }
    public static double FtoC(){
        double Equation = (((double)5/9)*(num1-32));
        System.out.println(Equation);
        return Equation;
    }
    public static double CtoF(){
        double FEquation = ((((double)9/5) * num2)+32);
        System.out.println(FEquation);
        return FEquation;
    }
}

