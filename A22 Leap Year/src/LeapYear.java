public class LeapYear {
    private int year;
    public boolean LeapyearCalc(){
        if (year % 4 == 0||year % 400 == 0){
            return true;
        }
        return false;
    }
}