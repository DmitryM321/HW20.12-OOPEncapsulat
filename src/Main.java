import transport.driver.*;
import transportUnit.Bus;
import transportUnit.Car;
import transportUnit.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car ("Lada", "Granta", 1.7, Car.BobyType.SEDAN);
        Car audi = new Car("Audi", "Ф8", 3.0, Car.BobyType.CROSSOVER);
        Car kia = new Car("Kia", "Sportage", 2.4, Car.BobyType.OFFROAD);
        Car hyundai = new Car("Hyundai", "Santa Fe", 1.6, Car.BobyType.CROSSOVER);
        Truck man = new Truck("MAN", "GV1", 6, Truck.LoadCapacity.N1);
        Truck volvo = new Truck("Volvo", "V99", 5.5, Truck.LoadCapacity.N2);
        Truck kamaz = new Truck ("Kamaz", "5325", 5.3, Truck.LoadCapacity.N3);
        Truck kraz = new Truck ("Kraz", "256b", 8, Truck.LoadCapacity.N1);
        Bus icarus = new Bus ("Icarus", "Last", 5, Bus.Capacity.AVERAGE);
        Bus paz = new Bus ("ПАЗ", "Никто не помнит", 4, null);
        Bus liaz = new Bus ("Лиаз", "677", 5.2, Bus.Capacity.ESSPECIALLY_BIG);
        Bus mersedes = new Bus ("Mersedes", "MRS33", 6.3, Bus.Capacity.BIG);

     /*   DriverB porsev = new DriverB ("Федор Поршев", true, 7);
        DriverC fordov = new DriverC ("Гарри Фордов", true, 111);
        DriverD ferrariev = new DriverD("Эдуард Феррариев", true, 22);*/

        System.out.println("Задание Enum");
        lada.printType();
        paz.printType();
        volvo.printType();

    }
}



