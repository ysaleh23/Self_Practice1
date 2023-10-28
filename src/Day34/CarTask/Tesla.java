package Day34.CarTask;

public class Tesla extends Car implements AutoPark ,AutoPilot{
    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has the auto park feature.");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has the self drive feature.");
    }

    @Override
    protected void start() {
        System.out.println("Swipe card to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Simply press the brake and shift the " + getMake() + " " + getModel() + " in order for the vehicle to drive.");
    }
}
