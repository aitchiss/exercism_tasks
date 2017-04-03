import java.util.ArrayList;
import java.util.Collections;

final class HandshakeCalculator {

  private ArrayList<Signal> handshake;
  private boolean reverseOrder;

  public HandshakeCalculator(){
    this.handshake = new ArrayList<Signal>();
    this.reverseOrder = false;
  }

  public ArrayList<Signal> calculateHandshake(int num){

    int runningTotal = num;
    
    runningTotal = checkForReverse(runningTotal);
    runningTotal = addJumps(runningTotal);
    runningTotal = addCloseYourEyes(runningTotal);
    runningTotal = addDoubleBlinks(runningTotal);
    runningTotal = addWinks(runningTotal);

    reverseIfRequired();
    return handshake;
  }

  public void reverseIfRequired(){
    if (reverseOrder){
      Collections.reverse(handshake);
    }
  }

  public int checkForReverse(int runningTotal){
    while (runningTotal >= 16 ){
      reverseOrder = true;
      runningTotal -= 16;
    }
    return runningTotal;
  }

  public int addJumps(int runningTotal){
    while (runningTotal >= 8 ){
      handshake.add(0, Signal.JUMP);
      runningTotal -= 8;
    }
    return runningTotal;
  }

  public int addCloseYourEyes(int runningTotal){
    while (runningTotal >= 4){
      handshake.add(0, Signal.CLOSE_YOUR_EYES);
      runningTotal -= 4;
    }
    return runningTotal;
  }

  public int addDoubleBlinks(int runningTotal){
    while (runningTotal >= 2){
      handshake.add(0, Signal.DOUBLE_BLINK);
      runningTotal -= 2;
    }
    return runningTotal;
  }

  public int addWinks(int runningTotal){
    while (runningTotal >= 1){
      handshake.add(0, Signal.WINK);
      runningTotal -= 1;
    }
    return runningTotal;
  }


}
