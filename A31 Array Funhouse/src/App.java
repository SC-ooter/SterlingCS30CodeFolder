// Program name: (A31 ARRAY FUNHOUSE)

// Student name: (STERLING COSSAR)

// Date: (NOVEMBER 28 2024)

// Program Description: USES DIFFERENT FUNCTIONS AND FOR LOOPS TO MANIPULATE THE SET OF NUMBERS. PRINTS OUT ALL THE NUMBERS AND USES PARAMETERS TO COUNT CERTAIN NUMBERS AND REMOVE OTHERS

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of 3-6: " + getSum(arr, 3, 6));
        System.out.println("Sum of 2-9: " + getSum(arr, 2,9));
        System.out.println( ("number of 4s: ") + count(arr, 4));
        System.out.println( ("number of 7s: ") + count(arr, 7));
        System.out.println( ("number of 9s: ") + count(arr, 9));
        arr = removeVal(arr, 7);
        System.out.println("New array without 7: " + Arrays.toString(arr));

        int[] arr2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        System.out.println("\n\n"+ Arrays.toString(arr2));
        System.out.println("Sum of 3-6: " + getSum(arr2, 3, 6));
        System.out.println("Sum of 2-9: " + getSum(arr2, 2,9));
        System.out.println( ("number of 4s: ") + count(arr2, 4));
        System.out.println( ("number of 7s: ") + count(arr2, 7));
        System.out.println( ("number of 9s: ") + count(arr2, 9));
        arr2 = removeVal(arr2, 7);
        System.out.println("New array without 7: " + Arrays.toString(arr2));
    }
    
    public static int getSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
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
    public static int[] removeVal(int[] arr, int val){
        int size = arr.length - count(arr,val);
        int[] x = new int[size];

        int u = 0;
        for (int i= 0; i<arr.length; i++){
            if (arr[i] != val){
                x[u] = arr[i];
                u++;
            }
        }
        return x ;
    }
}