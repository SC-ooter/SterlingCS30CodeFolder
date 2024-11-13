public class Stats {
    // public static int loop(int Number1, int Number2) {
    //     for (int x = Number1-1; x < Number2;x++){
    //         System.out.print(x);
    //     }
    // return 1;
    // }
    // public static int even(int Number1, int Number2){
    //     for (;(Number1 % 2 == 0) || (Number2 %2 == 0);){
    //     System.out.println("Even");
    //     if ((Number1 % 2 == 0)||(Number2 % 2 == 0)){
    //         System.out.println("Even");
    //     }

    //     for (int x = Number1; x < Number2 + 1;x++){
    //         System.out.print((x)+ ", ");
    //     }
    //     // for (int x = Number2; x < Number1 + 1;x++){
    //     //     System.out.print((x) + ", ");
    //     // }
    //     return 0;
    // }
    // return Number1;
    // }
    public static int odd(int Number1, int Number2){
        for (;(Number2 % 2 != 0) || (Number1 % 2 != 0);){
        System.out.println("Odd");
        if ((Number1 % 2 != 0) || (Number2 % 2 != 0)){
            System.out.println("Odd");
        }

        for (int x = Number1; x <= Number2;x++){
            System.out.print((x)+ ", ");
        }
        // for (int x = Number2; x <= Number1;x++){
        //     System.out.print((x)+ ", ");
        // }
        return 0;
    }
    return Number1;
    }
   public static int total(int Number1,int Number2){
    int total = 0;
    for (int x = Number1; x <= Number2; x ++){
        total = total + x;
    }
    return total;
    }
}