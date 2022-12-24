import transport.*;
import transport.Driver.*;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car ("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "Ф8", 3.0);
        Car kia = new Car("Kia", "Sportage", 2.4);
        Car hyundai = new Car("Hyundai", "Santa Fe", 1.6);
        Truck man = new Truck("MAN", "GV1", 6);
        Truck volvo = new Truck("Volvo", "V99", 5.5);
        Truck kamaz = new Truck<DriverC>("Kamaz", "5325", 5.3);
        Truck kraz = new Truck<DriverC>("Kraz", "256b", 8);
        Bus icarus = new Bus ("Icarus", "Last", 5);
        Bus paz = new Bus ("ПАЗ", "Никто не помнит", 4);
        Bus liaz = new Bus ("Лиаз", "677", 5.2);
        Bus mersedes = new Bus ("Mersedes", "MRS33", 6.3);

        Driver <Car> porsev = new Driver <>("Федор Поршев", true, 7);
        Driver <Truck> fordov = new Driver <Truck>("Гарри Фордов", true, 111);
        Driver <Bus> ferrariev = new Driver <> ("Эдуард Феррариев", true, 22);

        System.out.println("Задание 2/3");
        lada.bestLapTime();
        volvo.maxSpeed();
        paz.pitStop();

        System.out.println("Задание 4");
        porsev.infoAboutDriverAndRace(lada);
        fordov.infoAboutDriverAndRace(man);
        ferrariev.infoAboutDriverAndRace(icarus);
    }
}



