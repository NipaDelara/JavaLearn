public class CarDriver {
    public static void main(String[] args) {

        // Using constructor 1
        Car car1 = new Car("Toyota Corolla");
        car1.fillTank();

        // Using constructor 2
        Car car2 = new Car("Honda Civic", 50, 20);

        for (int i = 0; i < 3; i++) {
            car1.accelerate();
            System.out.println(car1.getTypeName() + ": speed is " + car1.getSpeed() + " km/h");
        }

        for (int i = 0; i < 3; i++) {
            car2.accelerate();
            System.out.println(car2.getTypeName() + ": speed is " + car2.getSpeed() + " km/h");
        }
    }
}
