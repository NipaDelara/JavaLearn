public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String fuel, String color) {
        super("Motorcycle", fuel, color);
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color;
    }
}