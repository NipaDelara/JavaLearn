public class CarDriver {
    public static void main(String[] args) {

        //create car with constructor 1
        Car car1 = new Car("Toyota Corolla");
        car1.fillTank();

        // create car with constructor 2
        Car car2 = new Car("Honda Civic", 50, 20);

        //old test for constructor 1
        for (int i = 0; i < 3; i++) {
            car1.accelerate();
            System.out.println(car1.getTypeName() + ": speed is " + car1.getSpeed() + " km/h");
        }

        //old test for constructor 2
        for (int i = 0; i < 3; i++) {
            car2.accelerate();
            System.out.println(car2.getTypeName() + ": speed is " + car2.getSpeed() + " km/h");
        }

        System.out.println();

        //start cruise control test
        System.out.println("Testing cruise control for " + car2.getTypeName());

        //set target speed
        if (car2.setTargetSpeed(70)) {
            System.out.println("Target speed set to " + car2.getTargetSpeed() + " km/h");
        } else {
            System.out.println("Failed to set target speed");
        }

        //turn cruise control on and check result
        if (car2.turnCruiseControlOn()) {
            System.out.println("Cruise control is on");
        } else {
            System.out.println("Cruise control could not be turned on");
        }

        //test automatic speed adjustment
        while (car2.isCruiseControlOn() && car2.getSpeed() != car2.getTargetSpeed()) {
            car2.driveWithCruiseControl();
            System.out.println(car2.getTypeName() + ": speed is " + car2.getSpeed() + " km/h");
        }

        //print when target speed is reached
        if (car2.getSpeed() == car2.getTargetSpeed()) {
            System.out.println("Target speed reached: " + car2.getSpeed() + " km/h");
        }

        //turn cruise control off
        car2.turnCruiseControlOff();
        System.out.println("Cruise control is off");
    }
}