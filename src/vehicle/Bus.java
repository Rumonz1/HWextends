package vehicle;

public class Bus extends  Transport implements Competing{
    private  Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model ,engineVolume);
        this.capacity=capacity;
        String license = "B";
//    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
//        super(brand, model, year , country,color, maxSpeed);
//    }
//
//    public String toString() {
//        return "Автобус: " + getBrand() + " " + getModel() + ". Год выпуска - " + getYear() + ". Страна где собран: " + getCountry() + ". Цвет: " + getColor() + ". Макс. скорость: " + getMaxSpeed() + " км/ч.";
//    }
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Вместимость авто: "+getBrand()+" "+getModel()+ " от " +capacity.getCapacityFrom() +" до "+ capacity.getCapacityTo()+" человек");
    }
    @Override
    public void goService() {
        System.out.println("Автобусы не проходят диагностику");
    }
    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop == true) {
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

}
