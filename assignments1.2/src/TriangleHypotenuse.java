/*a = first leg
b = second leg
c = hypotenuse */

import java.util.Scanner;

public class TriangleHypotenuse {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of first leg: ");
        double a = scanner.nextDouble();

        System.out.print("Enter length of second leg: ");
        double b = scanner.nextDouble();
        //formula
        double c = Math.sqrt(a * a + b * b);

        System.out.printf("Hypotenuse: %.2f\n", c);

        scanner.close();
    }
}
