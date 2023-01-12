package transportUnit;
import mechanics.Mechanics;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.Licenses;

import java.util.Objects;

public class Car extends Transport<DriverB>   {
    //   private DriverB driver;

    public enum BobyType {SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"),
        UNIVERS("Универсал"), OFFROAD("Внедорожник"), CROSSOVER("Кроссовер"),
        PICKUP("Пикап"), VAN("Фургон"),MINIVAN("Минивен");
        private String translate;
        BobyType(String translate) {
            this.translate = translate;
        }
        public String getTranslate() {
            return translate;
        }
        @Override
        public String toString() {
            return "Тип кузова: " + translate;
        }
        }
    private BobyType bobyType;
    private Mechanics mechanic;

    public Mechanics getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanics mechanic) {
        if(mechanic.getCategory().contains(Licenses.B)) {
            this.mechanic = mechanic;
        }else{
            System.out.println("Не обучен, простите");
        }
    }
    public void dvaVmashine() {
        System.out.println("В авто механик " + getMechanic().getName() + " и водитель " + getDriver().getFio());
    }
    public Car(String brand, String model, double engineVolume, BobyType bobyType) {
        super(brand, model, engineVolume);
        this.bobyType = bobyType;
    }
    public BobyType getBobyType() {
        return bobyType;
    }
    public void setBobyType(BobyType bobyType) {
        this.bobyType = bobyType;
    }
    @Override
    public void printType() {
        if (bobyType == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(bobyType);
        }
    }
    @Override
    public DriverB getDriver() {
        return driver;
    }
    public void infoAboutDriverAndRace() {
        System.out.println("Водитель " + getDriver().getFio() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    //   public Car(String brand, String model, double engineVolume) {
 //       super(brand, model, engineVolume );
 //   }
    @Override
    public void startMove() {
        System.out.println("Автомобиль начал движение");
    }
    @Override
    public void stopMove() {
        System.out.println("Автомобиль закончил движение");
    }
    @Override
    public String toString() {
        return brand + " модель " + model + " объем двигателя " + engineVolume;
    }
    @Override
    public void pitStop() {
        super.pitStop();
        System.out.println("Автомобиль " + brand +  " пит-стоп");
    }
    @Override
    public void bestLapTime() {
        super.bestLapTime();
        System.out.println("Автомобиль " + brand +  " лучшее время круга");
    }
    @Override
    public void maxSpeed() {
        super.maxSpeed();
        System.out.println("Автомобиль " + brand +  " максимальная скорость");
    }

    @Override
    public void passDiagnostics() throws PassVerification{
    if(this.driver == null){
        throw new PassVerification("Водитель отсутсвует. Автомобиль не может пройти дианостику");
    }  else {
        System.out.println("ALARM! Wolf catch bunnies");
    }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return bobyType == car.bobyType && Objects.equals(mechanic, car.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bobyType, mechanic);
    }
}



