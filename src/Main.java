import vehicle.Bus;
import vehicle.Car;

public class Main {
//    private static void printInfo(Car auto){
//        System.out.println("Автомобиль - " + auto.getBrand() + " " + auto.getModel() + "." + " Год выпуска - " + auto.getYear() + "." + " Страна где собрано - " + auto.getCountry() + "." + " Цвет  " + auto.getColor() + "." + " Объём двигателя - " + auto.getEngineVolume() +" литров."+" Максимальная скорость: "+ auto.getMaxSpeed()+"км/ч. Кол-во мест: " + auto.getSeatsNumber() + ". Тип кузова: " + auto.getBodyType() + ". " + (auto.isSummerWheels()?"Летняя":"Зимняя")+" резина . Регистрационный номер: " + auto.getRegistrationNumber() + ". Коробка передач: " + auto.getTransmission() + ".");
//    }
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия","белый",1.7, 220);
        System.out.println(lada);
        Bus gaz = new Bus("GAZ", "Patriot", 2020, "Россия", "жёлтый", 240);
        Bus uaz = new Bus("UAZ", "Patroliton", 2022, "Россия", "белый", 320);
        Bus maz = new Bus("MAZ", "Dustlord", 2022, "Россия", "песочный", 390);
        System.out.println(gaz);
        System.out.println(uaz);
        System.out.println(maz);

    }
}