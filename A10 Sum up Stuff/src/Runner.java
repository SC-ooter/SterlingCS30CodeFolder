// Program name: (A10 Sum up Stuff)

// Student name: (Sterling Cossar)

// Date: (Wednesday October 9th 2024)

// Program Description: This code uses the subclass Sum to set the numbers and their priameters then adds them. I then used my runner class to choose the numbers and run the functions.




public class Runner{
    public static void main(String[] args){
        Sum test = new Sum();				
		test.setNums(2,6);
		test.sum();
		test.printsum();
		test.setNums(9,6);
		test.sum();
		test.printsum();
        test.setNums(20,670);
		test.sum();
		test.printsum();	
	}
}
