package Day34.CarTask;

public class CarShop {

    public static void main(String[] args) {
        Honda honda = new Honda("Accord", 2023, 35000, "Black");
        BMW bmw = new BMW("M3", 2022, 65000, "Blue");

        Audi audi = new Audi("A3", 2024, 48000, "Red");
        Mercedes mercedes = new Mercedes("S550", 2023, 105000, "Gray");
        Tesla tesla = new Tesla("MODEL X", 2022, 85000, "White");
        Nio nio = new Nio("IDK", 2019, 45000, "Purple");
        CydeoCar cydeoCar = new CydeoCar("Muthar", 2026, 250000, "Light blue");

        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(nio);
        System.out.println(cydeoCar);

        audi.drive();
        bmw.start();
        tesla.autoPark();
        nio.selfDrive();
        cydeoCar.fly();
        tesla.drive();


    }




}
