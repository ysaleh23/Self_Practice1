package Day34.deviceTask1;

public class Iphone extends Phone implements downloadable,AppleApps{
    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " is being turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " is being turned off.");
    }

    @Override
    public void downloadApp() {
        System.out.println(getClass().getSimpleName() + " is downloading an app.");
    }
}

/*
7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces
 */