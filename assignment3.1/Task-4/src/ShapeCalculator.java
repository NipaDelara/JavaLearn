import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Shape Calculator");

        System.out.print("Enter circle radius: ");
        double r = input.nextDouble();
        System.out.print("Enter circle color: ");
        String cColor = input.next();

        System.out.print("Enter rectangle width: ");
        double w = input.nextDouble();
        System.out.print("Enter rectangle height: ");
        double h = input.nextDouble();
        System.out.print("Enter rectangle color: ");
        String rColor = input.next();

        System.out.print("Enter triangle base: ");
        double b = input.nextDouble();
        System.out.print("Enter triangle height: ");
        double th = input.nextDouble();
        System.out.print("Enter triangle color: ");
        String tColor = input.next();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(r, cColor);
        shapes[1] = new Rectangle(w, h, rColor);
        shapes[2] = new Triangle(b, th, tColor);

        System.out.println("\n--- Areas ---");
        for (Shape s : shapes) {
            System.out.println("Area of " + s.toString() + ": " + s.calculateArea());
        }
    }
}