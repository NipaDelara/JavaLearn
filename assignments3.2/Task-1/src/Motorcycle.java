public class Motorcycle implements Vehicle {
    private final String fuel;
    private final String color;

    public Motorcycle(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Motorcycle Information:\nType: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}