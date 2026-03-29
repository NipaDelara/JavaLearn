public class CarMain {
    public static void main(String[] args) {

        Car basicCar = new Car("Toyota", 50, 0);
        SportsCar sportsCar = new SportsCar("Ferrari", 50, 0);

        basicCar.accelerate();
        sportsCar.accelerate();

        System.out.println("Basic car speed: " + basicCar.getSpeed());
        System.out.println("Sports car speed: " + sportsCar.getSpeed());

        sportsCar.decelerate(10);
        System.out.println("Sports car speed after brake: " + sportsCar.getSpeed());
    }
}
