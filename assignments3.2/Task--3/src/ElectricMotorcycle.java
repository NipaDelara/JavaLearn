public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle(String color) {
        super("Electric Motorcycle", "Electric", color);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n" + getBasicInfo();
    }
}