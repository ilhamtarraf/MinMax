public class Chess {
  public static void main(String[] args){
    if(args.length > 0 && Integer.parseInt(args[0]) > 0){
      int size = Integer.parseInt(args[0]);
      for(int a = 0; a < size; a++){
        for(int b = 0; b < size; b++){
          if ((a + b)%2 == 0){
            System.out.println("*");
          } else {
            System.out.println(" ");
          }
        }
        System.out.println();
      }
    } else {
      System.out.println("ERROR: Bitte die Größe des Feldes als Argument übergeben!");
    }
  }
}
