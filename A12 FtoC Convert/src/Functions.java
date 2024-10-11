public class Functions {
    private double num1,num2;

    public void settemp(double a, double b){
        num1 = a;
        num2 = b;
    }
    public void FtoC(){
        double a = ((double)5/9);
        double b = (num1-32);
        System.out.println(a*b);
    }
    public void CtoF(){
        double a = (((double)9/5) * num2);
        double b = (32);
        System.out.println(a+b);
    }
}

