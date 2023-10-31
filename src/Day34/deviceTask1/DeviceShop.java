package Day34.deviceTask1;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("15", "PRO", 1100, "Pink");
        Samsung samsung = new Samsung("S31", "normal", 1300, "Silver");
        Google google = new Google("Pixel 3", "Normal",800, "Black");
        Laptop laptop = new Laptop("Dell", "Aspiron 5500", "Large", 1300, "Black",
                true, true);
        Desktop desktop = new Desktop("HP", "3500", "Small", 1200, "Black", false,
                true);


        iphone.turnOff();
        samsung.turnOn();
        laptop.turnOff();
        desktop.turnOn();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(laptop);
        System.out.println(desktop);


    }
}
