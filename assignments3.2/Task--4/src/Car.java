public class Car extends AbstractVehicle {

    public Car(String fuel, String color, double fuelEfficiency) {
        super("Car", fuel, color, fuelEfficiency);
    }

    @Override
    public String getInfo() {
        return "Car Information:\n" + getBasicInfo() +
                "\nFuel Efficiency: " + calculateFuelEfficiency() + " km per liter";
    }
}