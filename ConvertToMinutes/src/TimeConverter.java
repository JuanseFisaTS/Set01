public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int minutes = 0;
        if (hours < 0){
            minutes = -1;
            return minutes;
        }
        else {
            minutes  = hours * 60;
            return minutes;
        }
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        int minutes = 0;
        if (days < 0){
            minutes = -1;
            return minutes;
        }
        else {
            int hours = days * 24;
            minutes = convertHoursToMinutes(hours);
            return minutes;
        }
    }
}