public class Acronym{

  private String[] words;
  private StringBuilder acronym;

  public Acronym(String phrase){
    this.words = phrase.split(" ");
    this.acronym = new StringBuilder();
  }

  public String get(){

    for (String word : words){
      acronym.append(word.charAt(0));
    
      if (word.length() != 1){

        if (word.charAt(1) != Character.toUpperCase(word.charAt(1))){
          char[] letters = word.toCharArray();
          for (int i = 1; i < letters.length; i++){

            if (letters[i] == '-'){
              acronym.append(letters[i+1]);
            }
            if (Character.isUpperCase(letters[i])){
              acronym.append(letters[i]);
            }
          }
        }
      }    
    }
    return acronym.toString().toUpperCase();
  }

}