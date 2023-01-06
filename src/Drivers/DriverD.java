package Drivers;

import vehicle.Transport;

public class DriverD <V extends Transport> extends Driver {
    public DriverD(String fullName, boolean license, String licenseCategory, int experienceYear) {
        super(fullName, license, licenseCategory, experienceYear);

    }
    public String startMoving() {
        return getFullName()+" Заводи мотор и вперёд!";
    }

    @Override
    public String stopMoving() {
        return getFullName()+" Паркуйся и выходи из машины";
    }
//
    @Override
    public void refuelCar(boolean refuelCar) {
        if (refuelCar == true) {
            System.out.println(getFullName()+" Нужно зарпавить машину!");
        } else {
            System.out.println(getFullName()+" Бензина достаточно! Заправка не требуется!");
        }

    }
    public void checkDriver(V transport) {
        System.out.println( "Водитель "+getFullName()+" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" и будет участвовать в заезде");
    }
}
