public class Bus extends AbstractVehicle {
    private final int capacity;

    public Bus(String fuel, int capacity) {
        super("Bus", fuel, "color");
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "Bus Information:\nType: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color +
                "\nCapacity: " + capacity + " passengers";
    }
}