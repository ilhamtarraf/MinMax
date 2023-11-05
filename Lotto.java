public class Lotto{
  public static void main (String args[]){

    if (args.length ! = 2){
      System.out.println ("ERORR");
      return;
    }
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);

    if (n < 1|| n > m){
      System.out.println ("ERROR");
      return;
    }
    int [] gezogeneZahlen = new int [n];

    for (int position = 0; position < n; position ++ ){
      boolean doppelteZahl;
      int gezogeneZahlen;

      do{
      gezogeneZahlen = (int)(Math.random() * m + 1);

        doppelteZahl = false;
        for (int otherPosition = 0; otherPosition < position; otherPosition ++) {
          if (gezogeneZahlen [otherPosition] == gezogeneZahlen) {
            doppelteZahl = true;
          }
        }
      }while (doppelteZahl);
      gezogeneZahlen[position] = gezogeneZahlen;
    }
      for (int i = 0; i < n; i++) {
          System.out.print(gezogeneZahlen[i]);
          if (i != n -1){

            System.out.print(", ")
          }
    }
  }
}
