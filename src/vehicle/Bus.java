package vehicle;

public class Bus extends  Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year , country,color, maxSpeed);
    }

    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ". Год выпуска - " + getYear() + ". Страна где собран: " + getCountry() + ". Цвет: " + getColor() + ". Макс. скорость: " + getMaxSpeed() + " км/ч.";
    }
}
