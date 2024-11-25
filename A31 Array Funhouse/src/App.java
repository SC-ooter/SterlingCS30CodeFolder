public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        System.out.println(count(arr, 0));
        System.out.println(getSum(arr, 0, 0));
        System.out.println(removeVal(arr, 0));
        
    }
        // int[] arr2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

    public static int getSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum += arr[i];
        }
        return sum;
    }
    public static int count(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] == val){
                count++;
            }
        }
        return count;
    }
    public static int removeVal(int[] arr, int val){
        int size = arr.length - count(arr,val);
        int x = 0;

        for (int i= 0; i<arr.length; i++){
            if (arr[i] != val){
                x = arr[i];
                x++;
            }
        }
        return x ;
    }
}


//     public static int countOccurrences(int[] arr, int number) {
//         int count = 0;
//         for (int num : arr) {
//             if (num == number) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static int[] removeValue(int[] arr, int value) {
//         List<Integer> resultList = new ArrayList<>();
//         for (int num : arr) {
//             if (num != value) {
//                 resultList.add(num);
//             }
//         }
//         int[] resultArr = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             resultArr[i] = resultList.get(i);
//         }
//         return resultArr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

//         System.out.println("Sum of section (3 to 6): " + sumSection(arr, 3, 6));

//         System.out.println("Occurrences of 7: " + countOccurrences(arr, 7)); 


//         int[] resultArr = removeValue(arr, 7);
//         System.out.print("Array after removing all 7's: ");
//         for (int num : resultArr) {
//             System.out.print(num + " "); 
//         }
//     }
// }
// }
