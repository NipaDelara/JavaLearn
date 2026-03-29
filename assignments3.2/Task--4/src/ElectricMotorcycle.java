public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle(String color, double fuelEfficiency) {
        super("Electric Motorcycle", "Electric", color, fuelEfficiency);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n" + getBasicInfo() +
                "\nEfficiency: " + calculateFuelEfficiency() + " kWh per km";
    }
}
