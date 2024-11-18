public class App {
    public static void main(String[] args) throws Exception {
        // Declared the array
        // int[] scores = null;
        // String[] names = null;

        // Create or initialize Array
        // scores = new int[10];
        // names = new String[10];

        // Assign Values of array
        // List of data (solution set)
        String[] names = {"Wolf", "Sutter" , "Cook", "Fox", "Golden"};
        int[] scores = {9000, 7001, 1337, 2048, 4096};


        // Individual positions
        // names[1] = "wolf";
        // scores[1] = 9000;

        // Array length property
        System.out.println("Scores length is " + names.length);

        // outputting or Accessing arrays
        for (int i = 0; i < names.length; i++){
            System.out.println(i + (") ") + names[i] + ": " + scores[i]);
        }
        // outputting or accessing arrays backwards
        System.out.println("\n");
        for (int i = names.length-1; i >= 0 ; i--){
            System.out.println(i + (") ") + names[i] + ": " + scores[i]);
        }
        // find the sum of the array
        int sum = 0; 
        for (int i = 0; i<scores.length; i++){
            sum = sum + scores[i];
        }
        System.out.println("The sum is " + sum);

        //count the elements in an array
        int count = 0;
        for (int i = 0; i<scores.length; i++){
            if (scores[i] % 2 == 0){
                count++;
            }

        }
        System.out.println(("There are " + count + " even numbers"));
       
        // System.out.println(scores[4]);
        // System.out.println(names[0]);
    }
}
