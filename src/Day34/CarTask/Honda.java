package Day34.CarTask;

public class Honda extends Car{
    public Honda( String model, int year, double price, String color) {
        super( "Honda" , model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Turn the key to start " + getMake() + " " + getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Simply press the brake and shift the " + getMake() + " " + getModel() + " in order for the vehicle to drive.");

    }
}