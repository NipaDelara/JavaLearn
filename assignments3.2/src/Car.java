public class Car implements Vehicle {
    private final String fuel;
    private final String color;

    public Car(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Car Information:\nType: Car\nFuel: " + fuel + "\nColor: " + color;
    }
}