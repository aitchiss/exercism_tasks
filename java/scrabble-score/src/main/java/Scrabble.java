import java.util.HashMap;

public class Scrabble{

  private char[] inputLetters;
  private HashMap<String, Integer> tileValues;
  

  public Scrabble(String scrabbleInput){
    if (scrabbleInput != null){
      this.inputLetters = scrabbleInput.toLowerCase().toCharArray();
    } 

    this.tileValues = new HashMap<String, Integer>();

    String[] onePointLetters = new String[]{"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    addToTileValues(onePointLetters, 1);

    String[] twoPointLetters = new String[]{"d", "g"};
    addToTileValues(twoPointLetters, 2);

    String[] threePointLetters = new String[]{"b", "c", "m", "p"};
    addToTileValues(threePointLetters, 3);

    String[] fourPointLetters = new String[]{"f", "h", "v", "w", "y"};
    addToTileValues(fourPointLetters, 4);

    tileValues.put("k", 5);

    String[] eightPointLetters = new String[]{"j", "x"};
    addToTileValues(eightPointLetters, 8);

    String[] tenPointLetters = new String[]{"q", "z"};
    addToTileValues(tenPointLetters, 10);
  }

  public void addToTileValues(String[] letters, Integer value){
    for (String letter: letters){
      tileValues.put(letter, value);
    }
  }

  public int getScore(){
    int score = 0;

    if (inputLetters == null){
      return score;
    }

    for (char letter: inputLetters){
      if (tileValues.containsKey(String.valueOf(letter))){
        score += tileValues.get(String.valueOf(letter));
      }
    }
    return score;
  }


}