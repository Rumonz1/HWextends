package vehicle;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        String license = "С";
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
