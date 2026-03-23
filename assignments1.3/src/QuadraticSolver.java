import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = Double.parseDouble(input.nextLine());

        System.out.print("Enter b: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(input.nextLine());

        // discriminant
        double discriminant = b * b - 4 * a * c ;

        if(discriminant < 0) {
            System.out.println("No real roots");
        }else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}