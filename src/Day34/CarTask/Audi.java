package Day34.CarTask;

public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has the auto Park feature.");
    }

    @Override
    protected void start() {
        System.out.println("Press START button in order to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Press the brake and gently shift " + getMake() + " " + getModel() + " to drive.");
    }
}
