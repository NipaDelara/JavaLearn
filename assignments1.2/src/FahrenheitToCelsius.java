import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit:");
        double fahrenheit = Double.parseDouble(scanner.nextLine());
//Formula
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius : %.2f\n" , celsius);

        scanner.close();
    }
}
