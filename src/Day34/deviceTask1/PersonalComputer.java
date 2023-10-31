package Day34.deviceTask1;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " is turning on slowly.");
    }
}
