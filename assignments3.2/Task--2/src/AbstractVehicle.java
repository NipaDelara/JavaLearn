public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String color;

    public AbstractVehicle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    public void displayBasicInfo() {
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
    }

    // Abstract method (must be implemented by subclasses)
    public abstract String getInfo();
}