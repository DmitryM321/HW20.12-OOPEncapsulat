package transport.Driver;
import transport.Car.*;
import transport.Transport;
import static transport.Transport.*;
public class Driver <T extends Transport> {
    private String fio;
    protected boolean drivingLicense;
    protected int experience;
    public void infoAboutDriverAndRace(T brand) {
    System.out.println("Водитель " + fio + " управляет автомобилем " + brand.getBrand() + " и будет участвовать в заезде");
}
    public Driver(String fio, boolean drivingLicense, int experience) {
        if (fio == null || fio.isEmpty() || fio.isBlank()) {
            this.fio = "default";
        } else {
            this.fio = fio;
            this.drivingLicense = drivingLicense;
            if (0 > experience && experience > 100) {
                this.experience = 5;
            } else {
                this.experience = experience;
            }
        }

    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()) {
            this.fio = "default";
        } else {
            this.fio = fio;
        }
    }
    public boolean isDrivingLicense() {
        return drivingLicense;
    }
    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        if (0 > experience && experience > 100) {
            this.experience = 5;
        } else {
            this.experience = experience;
        }
    }
    public void startDrive() {
        System.out.println("начать движение");
    }
    public void stopDrive() {
        System.out.println("остановиться");
    }
    public void fillFuel() {
        System.out.println("заправить авто");
    }
}






