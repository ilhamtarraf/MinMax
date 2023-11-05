public class Cosinus {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("ERROR: Bitte ein Argument übergeben!");
            return;
        }
        double x = Double.parseDouble(args[0]);

        if (x < 0){
            x = -x;
        }

        x %= 2 * Math.PI;

        double term = 1.0;

        double partialSum  = term;

        for (int n = 1; n <= 10; n++) {

            term *= x * x / ((2 * n - 1) * (2 * n));

            if (n % 2 == 0) {
                partialSum += term;
            } else {
                partialSum -= term;
            }
        }
        System.out.println(partialSum);
    }
}
