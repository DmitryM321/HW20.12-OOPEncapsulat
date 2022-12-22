package transport;

public class Bus extends Transport {

    @Override
    public String toString() {
        return  brand +  " model " + model + " год выпуска " + year + " страна " + country + " максимальная скорость передвижения " + getMaxSpeed() + " объем бака " + fuelЕank;
    }
    private int fuelЕank;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int fuelЕank) {
        super(brand, model, year, country, color, maxSpeed);
        this.fuelЕank = fuelЕank;
    }


}

