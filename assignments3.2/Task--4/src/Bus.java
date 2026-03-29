public class Bus extends AbstractVehicle {
    private final int capacity;

    public Bus(String fuel, String color, int capacity, double fuelEfficiency) {
        super("Bus", fuel, color, fuelEfficiency);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "Bus Information:\n" + getBasicInfo() +
                "\nCapacity: " + capacity + " passengers" +
                "\nFuel Efficiency: " + calculateFuelEfficiency() + " km per liter";
    }
}