public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        isOn = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(String type) {
        if (isOn) {
            if (type.equals("normal") || type.equals("espresso")) {
                coffeeType = type;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int amount) {
        if (isOn) {
            if (amount >= 10 && amount <= 80) {
                coffeeAmount = amount;
            }
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}