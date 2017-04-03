public final class DifferenceOfSquaresCalculator {

    public DifferenceOfSquaresCalculator(){

    }
    
    public int computeSquareOfSumTo(int num){
      int sum = 0;
      for (int i= 0; i <= num; i++){
        sum += i;
      }
      return sum * sum;
    }

    public int computeSumOfSquaresTo(int num){
      int sum = 0;
      for (int i=0; i <= num; i++){
        sum += (i * i);
      }
      return sum;
    }

    public int computeDifferenceOfSquares(int num){
      return  computeSquareOfSumTo(num) - computeSumOfSquaresTo(num);
    }


}
