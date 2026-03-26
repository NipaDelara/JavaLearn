import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoffeeMaker cm = new CoffeeMaker();

        cm.powerOn();
        System.out.println("Coffee maker is on");

        System.out.print("Enter coffee type (normal/espresso): ");
        String type = input.nextLine();
        cm.setCoffeeType(type);

        System.out.print("Enter coffee amount (10-80 ml): ");
        int amount = input.nextInt();
        cm.setCoffeeAmount(amount);

        System.out.println("Coffee type is " + cm.getCoffeeType());
        System.out.println("Coffee amount is " + cm.getCoffeeAmount() + " ml");

        cm.powerOff();
        System.out.println("Coffee maker is off");
    }
}