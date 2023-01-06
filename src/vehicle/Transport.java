package vehicle;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
//    private final int year;
//    private final String country;
//    private String color;
//    private int maxSpeed;

//    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
    public Transport(String brand, String model, double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}else {
            this.engineVolume = engineVolume;
        }
//
        if (brand  == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";} else {
            this.brand =brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";}else {
            this.model = model;
        }
//        if (year <= 0) {
//            this.year = 2000;
//        }else {
//            this.year = year;
//        }
//        if (country == null || country.isEmpty() || country.isBlank()) {
//            this.country = "default";}else {
//            this.country = country;
//        }
//        if (color == null || color.isBlank() || color.isEmpty()) {
//            this. color = "белый";}else {this.color = color;
//        }
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 120;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
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

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}else { this.engineVolume = engineVolume;
        }
    }

    public void start() {
        System.out.println(getBrand() +" "+ getModel()+" Вперёд! Поехали!");
    }

    public void stop() {
        System.out.println(getBrand() +" "+ getModel()+" Стоп! Паркуемся!");
    }

//    public int getYear() {
//        return year;
//    }

//    public String getCountry() {
//        return country;
//    }

//    public String getColor() {
//        return color;
//    }

//    public void setColor(String color) {
//        if (color == null || color.isEmpty()) {
//            this.color = "Белый";
//        } else {
//            this.color = color;
//        }
//    }

//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed < 120 || maxSpeed > 400) {
//            this.maxSpeed = 120;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }
}