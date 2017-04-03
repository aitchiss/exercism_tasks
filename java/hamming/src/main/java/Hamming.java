public class Hamming {

  String string1;
  String string2;

  public Hamming(String string1, String string2){
    if (string1.length() != string2.length()){
      throw new IllegalArgumentException();
    }
    this.string1 = string1;
    this.string2 = string2;

  }

  public int getHammingDistance(){

    if (string1.equals(string2)){
      return 0;
    }
    int count = 0;

    for (int i = 0; i < string1.length(); i++){
      if (string1.charAt(i) != string2.charAt(i)){
        count++;
      }
    }
    return count;
  }

}
