public class Car extends AbstractVehicle {

    public Car(String fuel, String color) {
        super("Car", fuel, color);
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color;
    }
}