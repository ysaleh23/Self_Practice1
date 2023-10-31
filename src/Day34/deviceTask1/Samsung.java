package Day34.deviceTask1;

public class Samsung extends Phone implements downloadable, AndroidApps{
    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color, true, true);
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
        System.out.println(getClass().getSimpleName() + " is downloading Whatsapp.");
    }
}

/*
2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

 */