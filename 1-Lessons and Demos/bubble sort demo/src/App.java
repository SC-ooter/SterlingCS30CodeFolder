public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numList = {5,15,3,8,9,1,20,7};
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

    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[j+1]){

                }
            }
        }
        return nums;
        
    }
}
