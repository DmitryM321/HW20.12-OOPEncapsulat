package transportUnit;
import mechanics.Mechanics;
import transport.driver.Driver;
import transport.driver.DriverC;
import transport.driver.Licenses;

import java.util.Objects;

public class Truck extends Transport<DriverC> {
    public enum LoadCapacity {
        N1(null, 3.5f), N2(3.5f, 12f),
        N3(12f, null);
        private Float minLoadCapacity;
        private Float maxLoadCapacity;

        LoadCapacity(Float minLoadCapacity, Float maxLoadCapacity) {
            this.minLoadCapacity = minLoadCapacity;
            this.maxLoadCapacity = maxLoadCapacity;
        }

        public Float getMinLoadCapacity() {
            return minLoadCapacity;
        }

        public Float getMaxLoadCapacity() {
            return maxLoadCapacity;
        }

        @Override
        public String toString() {
            if (minLoadCapacity == null) {
                return "Грузоподъемность: до " + maxLoadCapacity;
            } else if (maxLoadCapacity == null) {
                return "Грузоподъемность: от " + minLoadCapacity;
            } else {
                return "Грузоподъемность: от " + minLoadCapacity + " до " + maxLoadCapacity;
            }
        }
    }

    private LoadCapacity loadCapacity;
    private Mechanics mechanic;

    public Mechanics getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanics mechanic) {
        if(mechanic.getCategory().contains(Licenses.C)) {
            this.mechanic = mechanic;
        }else{
            System.out.println("Не обучен, простите");
        }
    }

    public void dvaVmashine() {
        System.out.println("В авто механик " + getMechanic().getName() + " и водитель " + getDriver().getFio());
    }
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public DriverC getDriver() {
        return driver;
    }

    public void infoAboutDriverAndRace() {
        System.out.println("Водитель " + getDriver().getFio() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }

    /*   public Truck(String brand, String model, double engineVolume) {
               super(brand, model, engineVolume);
           }*/
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
        System.out.println("Грузовик " + brand + " лучшее время круга");
    }

    @Override
    public void bestLapTime() {
        super.bestLapTime();
        System.out.println("Грузовик " + brand + " лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed();
        System.out.println("Грузовик " + brand + " максимальная скорость");
    }
    @Override
    public void passDiagnostics() throws PassVerification {
        if (this.driver == null) {
            throw new PassVerification("Водитель отсутсвует. Автомобиль не может пройти дианостику");
        } else {
            System.out.println(this.driver);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity && Objects.equals(mechanic, truck.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity, mechanic);
    }
}





