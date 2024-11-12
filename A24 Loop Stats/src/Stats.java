public class Stats {
    public static int loop(int Number1, int Number2) {
        for (int x = Number1-1; x < Number2;x++){
            // int sum = x;
            // System.out.println(sum += x);
            System.out.print(x+1);
        }
        // for (int x = Number2; x < Number1 + 1;x++){
        //     // System.out.println(x);
        //     System.out.print(x+=1);
        // }
    return 1;
    }
    public static int even(int Number1, int Number2){
        for (;Number1 % 2 == 0;){
        System.out.println("Even");
        // for (;Number2 % 2 == 0;){
        // System.out.println("Even");

        for (int x = Number1; x < Number2 + 1;x++){
            // System.out.println(x);
            System.out.print((x+=1)+ ", ");
        }
        for (int x = Number2; x < Number1 + 1;x++){
            // System.out.println(x);
            System.out.print((x+=1) + ", ");
        }
        return 0;
    }
    return Number1;
    }
    // return Number2;
    // }
    public static int odd(int Number1, int Number2){
        for (;(Number1 % 1 != 0)||(Number2 % 2 != 0);){
        System.out.println("Odd");
        // for (;(Number2 % 2 != 0)||(Number1 % 2 != 0);){
        // System.out.println("Odd");
        for (int x = Number1; x <= Number2 + 1;x++){
            // System.out.println(x);
            System.out.print((x+=1)+ ", ");
        }
        for (int x = Number2; x <= Number1 + 1;x++){
            // System.out.println(x);
            System.out.print((x+=1)+ ", ");
        }
        return 0;
    }
    return Number1;
    }
    // return Number2;
// }
   public static int total(int Number1,int Number2){
        int totals = (Number1 + Number2);
        System.out.println(totals);
        return totals;
    }
}
 
