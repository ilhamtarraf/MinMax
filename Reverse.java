public class Reverse{
  public static void main (String args[]){

    String text = "1 9 3 6 7";
    for (int i= (text.length() - 1); i >= 0; i--){
      System.out.println(text.charAt (i));
    }
  }
}
