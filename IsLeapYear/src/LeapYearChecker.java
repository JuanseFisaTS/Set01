public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year>0){
            if(year%4 ==0 && year%100 > 0){
                return true;
            }
            else if (year%4 ==0 && year%400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
       return false;
    }
}