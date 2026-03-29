public class BusMain {
    public static void main(String[] args) {

        Bus bus = new Bus("City Bus", 80, 0, 10);

        bus.accelerate();
        System.out.println("Bus speed: " + bus.getSpeed());

        bus.passengerEnter(5);
        System.out.println("Passengers after entering: " + bus.getPassengers());

        bus.passengerExit(8);
        System.out.println("Passengers after exiting: " + bus.getPassengers());
    }
}