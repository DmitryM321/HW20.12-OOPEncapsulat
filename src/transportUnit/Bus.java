package transportUnit;
import transport.driver.DriverD;

public class Bus extends Transport<DriverD> {

    public enum Capacity {ESPECAILLY_SMALL(null, 10), SMALL(null, 25),
     AVERAGE(40, 50), BIG(60, 80),
     ESSPECIALLY_BIG(100, 120);
    private Integer minCapacity;
    private Integer maxCapacity;
        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }
        public Integer getMinCapacity() {
            return minCapacity;
        }
        public Integer getMaxCapacity() {
            return maxCapacity;
        }
        @Override
        public String toString() {
            if (minCapacity == null) {
                return "Вместимость: до " + maxCapacity;
            } else {
                return "Вместимость: " + minCapacity + " - " + maxCapacity;
            }
        }
        }
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(capacity);
        }
    }

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

     /*   public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }*/
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

