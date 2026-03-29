public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String color, double fuelEfficiency) {
        super("Electric Car", "Electric", color, fuelEfficiency);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n" + getBasicInfo() +
                "\nEfficiency: " + calculateFuelEfficiency() + " kWh per km";
    }
}
