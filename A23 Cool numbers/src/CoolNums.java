public class CoolNums {
    private int Coolnums;
    public static boolean checkcoolnumbers(int numbers){
        return ((numbers % 3 == 1) && (numbers % 4 == 1) && (numbers % 5 == 1) && (numbers % 6 == 1));
    }
    public static int countcoolnumbers(int numbers) {
        int count = 0;
        for (int x = 6; x < numbers + 1; x++){
            if (checkcoolnumbers(x)){
            count++;
        }
    }
    return count;
    }
}