public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if (angle1>0 && angle2 >0 && angle3 >0){
            int sum = angle3+angle2+angle1;
            if (sum == 180){
                return true;
            }
            else {
                return false;
                
            }
        
        }
        else{
            return false;
        }
       
    }
}