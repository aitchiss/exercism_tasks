import java.util.ArrayList;

public class RnaTranscription {

    public String ofDna(String dnaString) {

      if (dnaString.equals("")){
        return "";
      }
        
      String[] characters = dnaString.split("");

      StringBuilder newChars = new StringBuilder();

      for (String character : characters){
        switch (character){
          case "C": newChars.append("G");
          break;
          case "G": newChars.append("C");
          break;
          case "T": newChars.append("A");
          break;
          case "A": newChars.append("U");
          break;
        }
      }
      return newChars.toString();
    }
}