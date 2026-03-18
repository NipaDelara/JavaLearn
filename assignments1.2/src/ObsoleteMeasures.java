import java.util.Scanner;

public class ObsoleteMeasures {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Weight (g): ");
       double grams = scanner.nextDouble();

       //grams to luoti
       double totalLuoti = grams / 13.28;

       //luoti to naula
       int naula = (int) (totalLuoti / 32);

       //naula to leiviskä
       int leiviska = naula / 20;

       //naula after leiviskä
       naula = naula % 20;

       //luoti after naula
       double luoti = totalLuoti % 32;

       System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.\n",
               grams, leiviska, naula, luoti);

       scanner.close();
    }
}
