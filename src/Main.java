import transport.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car ("Lada", "Granta", 1.7, "желтый",
                2015, "Россия",  "Механика", "Хетчбек",
                1711, 5, true, 190);
        Car.Key keyCar = new Car.Key(true, true);
        Car.Insurance insurance = new Car.Insurance(33000, "123456789", LocalDate.of(2020, 01,01));

        Bus icarus = new Bus ("Icarus", "Last", 1997, "Hungary", "желтый", 98, 150);
        Bus paz = new Bus ("ПАЗ", "Никто не помнит", 1985, "СССР", "желтый", 65, 100);
        Bus volvo = new Bus ("Volvo", "V2020", 2020, "Sweden", "белый", 100, 188);


        //       Car audi = new Car ("Audi", "null", 3.0, "черный", 2016, "Германия", "Автомат", "Седан", 7777, 0, true);
       /*  Car kia = new Car ("Kia", "Sportage 4-го поколения", 2.4, "красный", 2020, "Южная Корея");
        Car hyundai = new Car ("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(audi);
        System.out.println(kia);
        System.out.println(hyundai); */
        lada.changeTyre(5);
        System.out.println(lada);
        System.out.println(insurance);
        System.out.println(insurance.currentInsurance());
        System.out.println(insurance.correctNumberInsurance());
        System.out.println("ДЗ - ООП: наследование, static");
        System.out.println(icarus);
        System.out.println(paz);
        System.out.println(volvo);
    }
}

