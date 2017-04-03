public class RaindropConverter{



  public String convert(int number){

    StringBuilder rainString = new StringBuilder();

    if (number % 3 == 0){
      rainString.append("Pling");
    }

    if (number % 5 == 0){
      rainString.append("Plang");
    }

    if (number % 7 == 0){
      rainString.append("Plong");
    }

    if (rainString.toString().equals("")){
      return String.valueOf(number);
    } else {
      return rainString.toString();
    }

  }

  

}