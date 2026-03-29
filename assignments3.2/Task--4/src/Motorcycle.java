public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String fuel, String color, double fuelEfficiency) {
        super("Motorcycle", fuel, color, fuelEfficiency);
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\n" + getBasicInfo() +
                "\nFuel Efficiency: " + calculateFuelEfficiency() + " km per liter";
    }
}