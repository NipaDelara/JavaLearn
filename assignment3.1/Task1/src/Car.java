public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;

    //added cruise control variables
    private boolean cruiseControlOn;
    private double targetSpeed;

    //added constants for minimum and maximum cruise speed
    private static final double MIN_CRUISE_SPEED = 30;
    private static final double MAX_CRUISE_SPEED = 120;

    public Car(String typeName) {
        this.speed = 0;
        this.gasolineLevel = 0;
        this.typeName = typeName;

        //initialize cruise control values
        this.cruiseControlOn = false;
        this.targetSpeed = 0;
    }

    //additional constructor
    public Car(String typeName, double gasolineLevel, double speed) {
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;

        //initialize cruise control values
        this.cruiseControlOn = false;
        this.targetSpeed = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
        } else {
            speed = 0;

            //no gasoline, cruise control must turn off
            cruiseControlOn = false;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;

            // MODIFIED: if no gasoline, cruise control must turn off
            cruiseControlOn = false;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    //set target speed for cruise control
    public boolean setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            this.targetSpeed = targetSpeed;
            return true;
        }
        return false;
    }

    //get current target speed
    public double getTargetSpeed() {
        return targetSpeed;
    }

    //turn cruise control on
    public boolean turnCruiseControlOn() {
        if (gasolineLevel <= 0) {
            cruiseControlOn = false;
            return false;
        }

        if (targetSpeed < MIN_CRUISE_SPEED || targetSpeed > MAX_CRUISE_SPEED) {
            cruiseControlOn = false;
            return false;
        }

        cruiseControlOn = true;
        return true;
    }

    //turn cruise control off
    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }

    //read cruise control state
    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    //method to adjust speed toward target speed
    public void driveWithCruiseControl() {
        if (!cruiseControlOn) {
            return;
        }

        if (gasolineLevel <= 0) {
            cruiseControlOn = false;
            return;
        }

        //accelerate or decelerate to reach target speed
        if (speed < targetSpeed) {
            speed += 10;

            if (speed > targetSpeed) {
                speed = targetSpeed;
            }
        } else if (speed > targetSpeed) {
            speed -= 10;

            if (speed < targetSpeed) {
                speed = targetSpeed;
            }
        }

        //target cannot be valid anymore, turn off cruise control
        if (targetSpeed < MIN_CRUISE_SPEED || targetSpeed > MAX_CRUISE_SPEED) {
            cruiseControlOn = false;
        }
    }
}