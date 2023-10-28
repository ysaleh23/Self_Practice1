package Day34.CarTask;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Press the start button, to start the " + getMake() + " " + getModel() );
    }

    @Override
    protected void drive() {
        System.out.println("Simply press the brake and shift the " + getMake() + " " + getModel() + " in order for the vehicle to drive.");

    }
}
