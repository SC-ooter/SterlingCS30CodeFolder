public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numList = {5, 15, 3, 8, 9, 1, 20, 7};
        //printing original list
        for (int i = 0; i<numList.length; i++){
            System.out.println(numList[i]);
        }
        System.out.println("\nThe sorted version is: ");

        numList = sort(numList);

        for (int i = 0; i<numList.length; i++){
            System.out.println(numList[i]);
        }
    }

    public static int[] selsort(int[] nums) {
        int n = nums.length;
// one by one every element of the array
        for (int i = 0; i < n; i++) {

            int minIDX = i;

            for (int j = 0; j < n; j++){
                if (nums[j] < nums[minIDX]) {
                    minIDX = j;
                }
                
            }
        }

            return nums;
        
    }

    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (n-i) - 1; j++) {
                System.out.println("J = " + nums[j] + " ; J+1" + nums[j+1]);
                if (nums[j] > nums[j+1]){
                    System.out.println("SWAP");
                    //swap the elements
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        return nums;
        
    }
}
