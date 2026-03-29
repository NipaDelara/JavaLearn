public class Bus implements Vehicle {
    private final String fuel;
    private final int capacity;

    public Bus(String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
    }

    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Bus Information:\nType: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }
}