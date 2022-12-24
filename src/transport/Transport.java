package transport;
import transport.Driver.Driver;
public abstract class Transport <T> implements Competing {
    protected final String brand;
    protected final String model;
    protected final double engineVolume;
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





