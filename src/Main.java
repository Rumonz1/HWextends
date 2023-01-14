import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Drivers.DriverLicenseException;
import vehicle.*;

public class Main {
//    private static void printInfo(Car auto){
//        System.out.println("Автомобиль - " + auto.getBrand() + " " + auto.getModel() + "." + " Год выпуска - " + auto.getYear() + "." + " Страна где собрано - " + auto.getCountry() + "." + " Цвет  " + auto.getColor() + "." + " Объём двигателя - " + auto.getEngineVolume() +" литров."+" Максимальная скорость: "+ auto.getMaxSpeed()+"км/ч. Кол-во мест: " + auto.getSeatsNumber() + ". Тип кузова: " + auto.getBodyType() + ". " + (auto.isSummerWheels()?"Летняя":"Зимняя")+" резина . Регистрационный номер: " + auto.getRegistrationNumber() + ". Коробка передач: " + auto.getTransmission() + ".");
//    }
//private static void printInfo(Car auto) {
//    System.out.println("Автомобиль - " + auto.getBrand() + " " + auto.getModel() + "."+ " Объём двигателя - " + auto.getEngineVolume() +" литров.");
//}
    public static void main(String[] args) throws DriverLicenseException {
//        Car lada = new Car("Lada", "Granta", 2015, "Россия","белый",1.7, 220);
//        System.out.println(lada);
//        Bus gaz = new Bus("GAZ", "Patriot", 2020, "Россия", "жёлтый", 240);
//        Bus uaz = new Bus("UAZ", "Patroliton", 2022, "Россия", "белый", 320);
//        Bus maz = new Bus("MAZ", "Dustlord", 2022, "Россия", "песочный", 390);
//        System.out.println(gaz);
//        System.out.println(uaz);
//        System.out.println(maz);
        Car lada = new Car("Lada", "Granta", 1.6,TypeOfBody.CROSSOVER);
        Car volvo = new Car("Volvo", "Eclipse", 2.3, null);
        Car skoda = new Car("Skoda", "Octavia", 1.8, TypeOfBody.COUPE);
        Car audi = new Car("Audi", "I8", 3.2, TypeOfBody.COUPE);
//        audi.start();
//        audi.pitStop(false);
//        audi.stop();
//        audi.bestLapTime(21, 32);
//        audi.maxSpeed(322);
        Truck mercedec = new Truck("Mercedec", "Spaceblade", 4.6, WeightLoad.N3);
        Truck union = new Truck("Union", "Orion", 3.2, WeightLoad.N1);
        Truck fiat = new Truck("FIAT", "Solar", 3.2, WeightLoad.N2);
        Truck subaru = new Truck("Subaru", "Mandella", 3.6, WeightLoad.N3);
//        fiat.start();
//        fiat.pitStop(true);
//        fiat.stop();
        Bus gaz = new Bus("GAZ", "Patriot", 5.2,Capacity.XL);
        Bus maz = new Bus("MAZ", "Dustlord", 5.0,Capacity.M);
        Bus uaz = new Bus("UAZ", "Patroliton", 7.2,Capacity.L);
        Bus zaz = new Bus("ZAZ", "Chernobog", 6.3,Capacity.S);
        mercedec.printType();
        volvo.printType();
        lada.printType();
        zaz.printType();
        gaz.printType();
        zaz.goService();
        mercedec.goService();
        lada.goService();


        DriverB<Car> timur = new DriverB<>("Ахмедов Тимур Алишерович", true, "", 1);
       System.out.println(timur);
//        timur.checkDriver(audi);
//        DriverC<Truck> elena = new DriverC<>("Вьюркова Елена Алексеевна", true, "C", 4);
//        System.out.println(elena);
//        elena.checkDriver(mercedec);
//        DriverD<Bus> vladimir = new DriverD<>("Владимиров Владимир Владимирович", true, "D", 5);
//        System.out.println(vladimir);
//        vladimir.checkDriver(zaz);
    }

}