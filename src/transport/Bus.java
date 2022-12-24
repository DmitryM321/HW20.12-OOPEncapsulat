package transport;

import transport.Driver.DriverD;

public class Bus <DriverD> extends Transport implements Competing {

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
