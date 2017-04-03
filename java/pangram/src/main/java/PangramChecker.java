public class PangramChecker {

    public boolean isPangram(String input) {
        for (char character = 'a'; character <= 'z'; character++){
          if (input.toLowerCase().indexOf(character) == -1){
            return false;
          }
        }
        return true;
    }
}
