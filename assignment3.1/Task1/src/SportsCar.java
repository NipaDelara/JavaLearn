public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, double gasolineLevel, double speed) {
        super(typeName, gasolineLevel, speed);
    }

    // Better acceleration but uses more fuel
    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            // faster than normal car
            //  += 10
            // sports car += 20
            super.decelerate(-20); // increase speed
        }
    }

    // Better deceleration
    @Override
    public void decelerate(int amount) {
        // sports car brakes stronger
        super.decelerate(amount + 10);
    }
}