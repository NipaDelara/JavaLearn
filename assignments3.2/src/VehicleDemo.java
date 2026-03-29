public class VehicleDemo {
    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Gasoline", "Black");
        Vehicle bus = new Bus("Diesel", 40);

        // Car
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();

        // Motorcycle
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        // Bus
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
