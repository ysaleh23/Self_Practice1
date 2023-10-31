package Day34.deviceTask1;

public class Desktop extends Computer{
    public Desktop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " takes FOREVER to turn on.");
    }
}
