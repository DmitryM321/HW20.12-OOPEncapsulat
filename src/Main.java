import transport.driver.*;
import transportUnit.Bus;
import transportUnit.Car;
import transportUnit.Transport;
import transportUnit.Truck;
import mechanics.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, Car.BobyType.SEDAN);
        Car audi = new Car("Audi", "Ф8", 3.0, Car.BobyType.CROSSOVER);
        Truck kamaz = new Truck("Kamaz", "5325", 5.3, Truck.LoadCapacity.N3);
        Truck kraz = new Truck("Kraz", "256b", 8, Truck.LoadCapacity.N1);
        Bus liaz = new Bus("Лиаз", "677", 5.2, Bus.Capacity.ESSPECIALLY_BIG);
        Bus mersedes = new Bus("Mersedes", "MRS33", 6.3, Bus.Capacity.BIG);

        DriverB porsev = new DriverB("Федор Поршев", true, 7);
        DriverC fordov = new DriverC("Гарри Фордов", true, 111);
        DriverD ferrariev = new DriverD("Эдуард Феррариев", true, 22);

        System.out.println("Задание Map");
        Mechanics mechanic1 = new Mechanics("Петр Первый", "Лучше не знать",  Licenses.D);
        Mechanics mechanic2 = new Mechanics("Николай Второй", "Box 231 in GSK Mechta", Licenses.B,Licenses.C);
        Mechanics mechanic3 = new Mechanics("Александр Третий", "Rolf", Licenses.C);
        Mechanics mechanic4 = new Mechanics("Александр Третий", "Rolf", Licenses.C);

        Map<Transport, Mechanics > mechanicsMap = new HashMap<>();
        mechanicsMap.put(kamaz, mechanic1);
        mechanicsMap.put(kraz,  mechanic1);
        mechanicsMap.put(lada, mechanic2);
        mechanicsMap.put(audi, mechanic2);
        mechanicsMap.put(liaz, mechanic3);
        mechanicsMap.put(mersedes, mechanic3);
        mechanicsMap.put(mersedes, mechanic4); // Тестовая строка
        System.out.println(mechanicsMap);
    }
}

//
//
//        List<Driver> drivers = new ArrayList<>();
//        Collections.addAll(drivers, porsev, fordov, ferrariev);
//        System.out.println(drivers);
//        System.out.println(mechanic2);
//        lada.setDriver(porsev);
//        lada.setMechanic(mechanic2);
//        lada.dvaVmashine();
//
//        kraz.setDriver(fordov);
//        kraz.setMechanic(mechanic3);
//        kraz.dvaVmashine();
//
//        mersedes.setDriver(ferrariev);
//        mersedes.setMechanic(mechanic1);
//        mersedes.dvaVmashine();


//        List<Car> cars = new ArrayList<>();
//        cars.add(lada);
//        cars.add(audi);
//        System.out.println(cars);
//
//        List<Truck> trucks = new ArrayList<>();
//        trucks.add(kamaz);
//        trucks.add(kraz);
//
//        List<Bus> buses = new ArrayList<>();
//        buses.add(liaz);
//        buses.add(mersedes);
//
//        List<Driver> drivers = new ArrayList<>();
//        drivers.add(porsev);
//        drivers.add(fordov);
//        drivers.add(ferrariev);

//        Car kia = new Car("Kia", "Sportage", 2.4, Car.BobyType.OFFROAD);
//        Car hyundai = new Car("Hyundai", "Santa Fe", 1.6, Car.BobyType.CROSSOVER);
//        Truck man = new Truck("MAN", "GV1", 6, Truck.LoadCapacity.N1);
//        Truck volvo = new Truck("Volvo", "V99", 5.5, Truck.LoadCapacity.N2);
//Bus icarus = new Bus("Icarus", "Last", 5, Bus.Capacity.AVERAGE);
//    Bus paz = new Bus("ПАЗ", "Никто не помнит", 4, null);

       /* try {
            audi.passDiagnostics();
        } catch (PassVerification e) {
            throw new RuntimeException(e);
        } finally {

        try {
                paz.passDiagnostics();
            } catch (PassVerification ex) {
                throw new RuntimeException(ex);
            }
        try {
                kamaz.passDiagnostics();
            } catch (Exception | PassVerification ex) {
                throw new RuntimeException();
            }
        }*/
//        ArrayList<Transport> transports = new ArrayList<>();
//        Collections.addAll(transports, lada, audi, kamaz, kraz, liaz, mersedes);
//        System.out.println(transports);
//
//        List<Car> cars = new ArrayList<>();
//        Collections.addAll(cars, lada, audi);
//        System.out.println(cars);
//
//        List<Truck> trucks = new ArrayList<>();
//        Collections.addAll(trucks, kamaz, kraz);
//        System.out.println(trucks);
//
//        List<Bus> buses = new ArrayList<>();
//        Collections.addAll(buses, liaz, mersedes);
//        System.out.println(buses);



