package Day34.deviceTask1;

public class Laptop extends Computer{

    public Laptop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " takes forever to turn off.");
    }
}
