package transport;


import transport.Driver.Driver;
import transport.Driver.DriverC;

public class Truck <DriverC> extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
            super(brand, model, engineVolume);
        }
    @Override
    public void startMove() {
            System.out.println("Грузовик начал движение");
        }
    @Override
    public void stopMove() {
            System.out.println("Грузовик закончил движение");
        }
    @Override
    public String toString() {
        return brand + " модель " + model + " объем двигателя " + engineVolume;
    }
    @Override
    public void pitStop() {
        super.pitStop();
        System.out.println("Грузовик " + brand +  " лучшее время круга");
    }
    @Override
    public void bestLapTime() {
        super.bestLapTime();
        System.out.println("Грузовик " + brand +  " лучшее время круга");
    }
    @Override
    public void maxSpeed() {
        super.maxSpeed();
        System.out.println("Грузовик " + brand +  " максимальная скорость");
    }
}





