package transportUnit;
import transport.Competing;
import transport.driver.Driver;
public abstract class Transport <T extends Driver>  implements Competing {
    protected final String brand;
    protected final String model;
    T driver;
    protected final double engineVolume;

    public void setDriver(T driver) {
        this.driver = driver;
    }
    public T getDriver() {
        return driver;
    }
    void infoAboutDriverAndRace() {
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }
    public abstract void printType();
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public abstract void startMove();
    public abstract void stopMove();

    @Override
    public void pitStop() {
    }
    @Override
    public void bestLapTime() {
    }
    @Override
    public void maxSpeed() {
    }
}





