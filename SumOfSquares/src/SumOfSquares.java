public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
      long sum = 0;
      if (n<0){
          return -1;
      }
      else{
          for(int i =0; i<=n;i++){
              
              sum = sum + (i*i);
          }
           return sum;
      }
    }
}