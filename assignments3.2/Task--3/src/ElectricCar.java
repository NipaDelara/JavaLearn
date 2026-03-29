public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String color) {
        super("Electric Car", "Electric", color);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n" + getBasicInfo();
    }
}
