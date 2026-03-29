public class VehicleDemo {
    public static void main(String[] args) {

        AbstractVehicle car = new Car("Petrol", "Red", 15);
        AbstractVehicle motorcycle = new Motorcycle("Gasoline", "Black", 30);
        AbstractVehicle bus = new Bus("Diesel", "White", 40, 8);
        AbstractVehicle eCar = new ElectricCar("Blue", 0.2);
        AbstractVehicle eMotorcycle = new ElectricMotorcycle("Green", 0.1);

        AbstractVehicle[] vehicles = {car, motorcycle, bus, eCar, eMotorcycle};

        for (AbstractVehicle v : vehicles) {
            v.start();
            v.stop();
            v.charge();
            System.out.println(v.getInfo());
            System.out.println();
        }
    }
}