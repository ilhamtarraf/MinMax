public class MinMax{
  public static void main(String[] args){
    if(args.length < 1){
      System.out.println("ERROR: Bitte geben sie mindestens ein Argument an");
    }

    int min = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[0]);

    for(int i=1; i < args.length;i++){
      int zahl = Integer.parseInt(args[i]);

      if(zahl < min){
        min = zahl;
      }

      if(zahl > max){
        max = zahl;
      }
    }

    System.out.println(min);
    System.out.println(max);
  }
}
