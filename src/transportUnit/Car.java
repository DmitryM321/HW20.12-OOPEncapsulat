package transportUnit;
import transport.Competing;
import transport.driver.DriverB;
public class Car extends Transport<DriverB>   {
    //   private DriverB driver;
    @Override
    public DriverB getDriver() {
        return driver;
    }
    public void infoAboutDriverAndRace() {
        System.out.println("Водитель " + getDriver().getFio() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume );
    }
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
}



