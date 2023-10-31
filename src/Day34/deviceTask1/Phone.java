package Day34.deviceTask1;

public abstract class Phone extends Device{
    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("The " + getBrand() + " " + getModel() + " is being turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("The " + getBrand() + " " + getModel() + " is being turned off.");
    }

    public void call(long phoneNum){
        System.out.println(phoneNum + " is calling.");
    }
    public void text(long phoneNum){
        System.out.println(phoneNum + " is texting.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */