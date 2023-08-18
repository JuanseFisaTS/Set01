public class TriangleValidator {
    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
      if (side1>0 && side2>0 && side3>0){
            if (side1 > side2 && side1>side3){
            int hypotenuseSquare = (side1*side1);
            int catSquare = (side2*side2)+(side3*side3);
            if (hypotenuseSquare==catSquare){
                return true;
            }
            else{
                return false;
            }
        }
        else if(side2 > side1 && side2>side3){
            int hypotenuseSquare = (side2*side2);
            int catSquare = (side1*side1)+(side3*side3);
            if (hypotenuseSquare==catSquare){
                return true;
            }
            else{
                return false;
            }
        }
        else if(side3 > side1 && side3>side2){
            int hypotenuseSquare = (side3*side3);
            int catSquare = (side1*side1)+(side2*side2);
            if (hypotenuseSquare==catSquare){
                return true;
            }
            else{
                return false;
            }
        }
      }
            return false;
    }

}