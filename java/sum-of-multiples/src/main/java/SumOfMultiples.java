import java.util.ArrayList;

public class SumOfMultiples {

  private int num;
  private int[] setOfMultiples;

  public SumOfMultiples(int num, int[] setOfMultiples){

    this.num = num;
    this.setOfMultiples = setOfMultiples;
  }

  public int getSum(){
    ArrayList<Integer> toBeCounted = new ArrayList<Integer>();
    for (int i = 0; i < num; i++){
      for (int num : setOfMultiples){
        if (i % num == 0 && !toBeCounted.contains(i)){
          toBeCounted.add(i);
        }
      }
    }
    int sum = 0;
    for (int num : toBeCounted){
      sum += num;
    }
    return sum;
  }
    
}
