package vehicle;

public class Car extends  Transport implements Competing{
    private  TypeOfBody typeOfBody;


    private double engineVolume;

//    private String color;
    //
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int seatsNumber;
//    private boolean summerWheels;
//    private Key key;
//    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
//        this(brand, model, year, country, color, engineVolume, 120);
//
//    }
//    public Car(String brand, String model, int year, String country, String color, double engineVolume, int maxSpeed) {
//        super (brand, model, year , country,color, maxSpeed);
//        if (engineVolume <= 0) {
//            this.engineVolume = 1.5;}else { this.engineVolume = engineVolume;
//        }
//        this.key = new Key();
//        this.transmission = "АКП";
//        this.registrationNumber = "х000хх000";
//        this.bodyType = "Седан";
//        this.summerWheels = true;
//        this.seatsNumber = 4;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
            super(brand, model ,engineVolume);
            this.typeOfBody =typeOfBody;
            String license = "A";

    }
    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println("Нужен пит-стоп!");
        } else {
            System.out.println("Едем дальше!");
        }

    }

    @Override
    public void bestLapTime(int minutes , int seconds) {
        System.out.println("Лучшее время круга: "+minutes+" минут "+seconds+" секунд. Поздравляем!");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость: "+speed+" км/ч");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
    }


//    public void changeWheels() {
//        summerWheels = !summerWheels;
//
//    }
//
//    public boolean isCorrectRegNum() {
//        if (registrationNumber.length() != 9) {
//            return false;
//        }
//        char chars[] = registrationNumber.toCharArray();
//        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
//            return false;
//        }
//        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
//            return false;
//        }
//        return true;
//
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        if (key == null){
//            this.key = new Key();}else {
//            this.key = key;
//        }
//    }
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getSeatsNumber() {
//        return seatsNumber;
//    }

//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            this.engineVolume = 1.5;}else { this.engineVolume = engineVolume;
//        }
//    }

//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
//            this.transmission = "АКП";
//        } else {
//            this.transmission = transmission;
//        }
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
//            this.registrationNumber = "х000хх000";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//    }
//
//    public boolean isSummerWheels() {
//        return summerWheels;
//    }
//
//    public void setSummerWheels(boolean summerWheels) {
//        this.summerWheels = summerWheels;
//    }
//    public static class Key {
//        private final boolean remoteRunEngine;
//        private final boolean withoutKeyAccess;
//
//        public Key (boolean remoteRunEngine, boolean withoutKeyAccess) {
//            this.remoteRunEngine = remoteRunEngine;
//            this.withoutKeyAccess = withoutKeyAccess;
//
//        }
//
//        public Key() {
//            this(false, false);
//        }
//
//        public boolean isRemoteRunEngine() {
//            return remoteRunEngine;
//        }
//
//        public boolean isWithoutKeyAccess() {
//            return withoutKeyAccess;
//        }
//    }

//    public String toString() {
//        return "Автомобиль - " + getBrand() + " " + getModel() + "." + " Год выпуска - " + getYear() + "." + " Страна где собрано - " + getCountry() + "." + " Цвет  " + getColor() + "." + " Объём двигателя - " + getEngineVolume() +" литров."+" Максимальная скорость: "+ getMaxSpeed()+"км/ч. Кол-во мест: " + getSeatsNumber() + ". Тип кузова: " + getBodyType() + ". " + (isSummerWheels()?"Летняя":"Зимняя")+" резина . Регистрационный номер: " + getRegistrationNumber() + ". Коробка передач: " + getTransmission() + ".";
//
//    }

}
