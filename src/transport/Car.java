package transport;
import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String kpp;
    private final String typeBody;
    private int numberCar;
    private int seatsNumber;
    private boolean isSummer;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String kpp, String typeBody, int numberCar, int seatsNumber, boolean isSummer, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);


        /*if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }*/
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
      /*  if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (0 >= year) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }*/
        if (kpp.equals("Механика") || kpp.equals("Автомат")) {
            this.kpp = kpp;
        } else {
            this.kpp = "default";
        }
        if (typeBody.equals("Хетчбек") || typeBody.equals("Седан") || typeBody.equals("Универсал")) {
            this.typeBody = typeBody;
        } else {
            this.typeBody = "default";
        }
        this.numberCar = numberCar;
        if (numberCar > 10000 || numberCar < 0) {
            this.numberCar = 0;
        }
        this.seatsNumber = seatsNumber;
        if (2 > seatsNumber && seatsNumber < 7) {
            this.seatsNumber = 4;
        }
        if (isSummer = true)
            this.isSummer = isSummer;
    }

    public void changeTyre(int month) {
        if (3 <= month && month <= 10) {
            isSummer = true;
        } else {
            isSummer = false;
        }
    }

    /*public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }*/

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }*/

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String toString() {
        return getBrand() + " " + getModel() + " " + getYear() + " год выпуска, сборка в " + getCountry() + " "
                + getColor() + " цвет," + " объем двигателя — " + getEngineVolume() + " л." +
                "\n" + " коробка передач " + getKpp() + " тип кузова " + getTypeBody() +
                " номер автомобиля " + getNumberCar() + " количество сидений " + getSeatsNumber() +
                " тип резины летняя " + isSummer;
    }


    public static class Key {
        private boolean autoRun;
        private boolean keyLess;

        public Key(boolean autoRun, boolean keyLess) {
            this.autoRun = autoRun;
            this.keyLess = keyLess;

        }
    }

    public static class Insurance {
        private final int costInsurance;
        private final String numberInsurance;
        private final LocalDate endInsurance;

        public int getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public LocalDate getEndInsurance() {
            return endInsurance;
        }

        public Insurance(int costInsurance, String numberInsurance, LocalDate endInsurance) {
            if (costInsurance <= 0) {
                this.costInsurance = 25000;
            } else {
                this.costInsurance = costInsurance;
            }
            if (numberInsurance == null || numberInsurance.isEmpty() || numberInsurance.isBlank()) {
                this.numberInsurance = "default";
            } else {
                this.numberInsurance = numberInsurance;
            }
            if (endInsurance == null) {
                this.endInsurance = LocalDate.of(2023, 01, 01);
            } else {
                this.endInsurance = endInsurance;
            }
        }

        public String currentInsurance() {
            if (LocalDate.now().isAfter(endInsurance) || LocalDate.now().isEqual(endInsurance)) {
                return "Нужно срочно ехать оформлять новую страховку.";
            }
            return "страховку оформлять не требуется.";
        }

        public String correctNumberInsurance() {
            if (8 >= numberInsurance.length() && numberInsurance.length() <= 10) {
                return "Номер страховки некорректный!";
            }
            return "Номер страховки корректный!";
        }

        public String toString() {
            return "Срок действия страховки: " + endInsurance + " стоимость страховки " + costInsurance + " номер страховки " + numberInsurance;
        }

    }
}




