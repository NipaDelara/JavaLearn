public class Bus extends Car {

    private int passengers;

    // Constructor 1
    public Bus(String typeName) {
        super(typeName);
        passengers = 0;
    }

    // Constructor 2
    public Bus(String typeName, double gasolineLevel, double speed, int passengers) {
        super(typeName, gasolineLevel, speed);
        this.passengers = passengers;
    }

    // Passenger enters
    public void passengerEnter(int amount) {
        if (amount > 0) {
            passengers += amount;
        }
    }

    // Passenger exits
    public void passengerExit(int amount) {
        if (amount > 0) {
            passengers -= amount;
            if (passengers < 0) {
                passengers = 0;
            }
        }
    }

    // Get passenger count
    public int getPassengers() {
        return passengers;
    }

}