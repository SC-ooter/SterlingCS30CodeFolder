public class Sum{
	private double num1, num2, sum;
	public void setNums(double a, double b){
		num1 = a;
		num2 = b;
	}
	public void sum(){
		sum = num1+num2;
	}
	public void printsum(){
		System.out.println(sum);
	}
}
