public class Stats {

    public static int loop(int Number1) {
        for (int x = 1; x < Number1 + 1;x++){
            System.out.println(x);
        }
    return 1;
    }
    public static int even(int Number1){
        for (;Number1 % 2 == 0;){
        System.out.println("Even");
        return 0;
    }
    return Number1;
    }
    public static int odd(int Number1){
        for (;(Number1 % 2 != 0);){
        System.out.println("odd");
        return 0;
    }
    return Number1;
    }
    public static int total(int Number1,int Number2){
        int totals = (Number1 + Number2);
        System.out.println(totals);
        return totals;
    }
}