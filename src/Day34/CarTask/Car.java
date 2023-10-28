package Day34.CarTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private final double price;
    private String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            System.err.println("Must have a valid color " + getColor());
            System.exit(1);
        }
        this.color = color;
    }


    public Car(String make, String model, int year, double price, String color) {
        if (make.isEmpty()  || make == null) {
            System.err.println("Please enter a valid make " + getMake());
            System.exit(1);
        }
        this.make = make;
        if (model.isEmpty()  || model == null) {
            System.err.println("Please enter a valid model " + getModel());
            System.exit(1);
        }
            this.model = model;
            if ( year < 1886) {
                System.err.println("Invalid year, please enter a valid YEAR " + getYear());
                System.exit(1);
            }
            this.year = year;
            if (price < 0) {
                System.err.println("Please enter a valid price " + getPrice());
                System.exit(1);
            }
            this.price = price;
            setColor(color);
        }



    protected abstract void start();

    protected abstract void drive();

    protected final void stop(){
        System.out.println("Press the brake to stop the " + getMake() + " " + getModel());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
