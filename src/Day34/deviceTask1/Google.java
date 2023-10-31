package Day34.deviceTask1;

public class Google extends Phone implements downloadable, AndroidApps{

    public Google( String model, String size, double price, String color) {
        super("Google", model, size, price, color, true, true);
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
        System.out.println(getClass().getSimpleName() + " is downloading angry bird.");
    }
}

/*
4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces

 */