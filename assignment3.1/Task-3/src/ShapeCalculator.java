import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Shape Calculator");

        System.out.print("Enter circle radius: ");
        double r = input.nextDouble();

        System.out.print("Enter rectangle width: ");
        double w = input.nextDouble();

        System.out.print("Enter rectangle height: ");
        double h = input.nextDouble();

        System.out.print("Enter triangle base: ");
        double b = input.nextDouble();

        System.out.print("Enter triangle height: ");
        double th = input.nextDouble();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(r);
        shapes[1] = new Rectangle(w, h);
        shapes[2] = new Triangle(b, th);

        for (Shape s : shapes) {
            System.out.println("Area of " + s.toString() + ": " + s.calculateArea());
        }
    }
}