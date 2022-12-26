package transportUnit;
import transport.driver.DriverB;
import transport.driver.DriverD;

public class Bus extends Transport<DriverD> {
    @Override
    public DriverD getDriver() {
        return driver;
    }
    public void infoAboutDriverAndRace() {
        System.out.println("Водитель " + getDriver().getFio() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    @Override
    public void startMove() {
        System.out.println("Автобус начал движение");
    }
    @Override
    public void stopMove() {
        System.out.println("Автобус закончил движение");
    }
    @Override
    public String toString() {
        return brand + " модель " + model + " объем двигателя " + engineVolume;
    }
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void pitStop() {
        super.pitStop();
        System.out.println("Автобус " + brand + " пит-стоп");
    }
    @Override
    public void bestLapTime() {
        super.bestLapTime();
        System.out.println("Автобус " + brand + " лучшее время круга");
    }
    @Override
    public void maxSpeed() {
        super.maxSpeed();
        System.out.println("Автобус " + brand + " максимальная скорость");
    }
}

