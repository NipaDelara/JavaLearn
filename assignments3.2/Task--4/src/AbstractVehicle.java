public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, String color, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public void charge() {
        System.out.println(type + ": Not possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    public String getBasicInfo() {
        return "Type: " + type +
                "\nFuel: " + fuel +
                "\nColor: " + color;
    }

    public abstract String getInfo();
}