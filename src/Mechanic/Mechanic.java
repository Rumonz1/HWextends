package Mechanic;

import vehicle.Transport;

import java.util.Objects;

public class Mechanic {
    private final String firstName;
    private final String lastName;
    private  String companyWhenWorking;
    private final WhichTransport whichTransport;

    public Mechanic(String firstName, String lastName, String companyWhenWorking,  WhichTransport whichTransport) {
        if (firstName == null || firstName.isBlank() || firstName.isEmpty()) {
            this.firstName = "ПУСТО";
        }else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            this.lastName = "ПУСТО";
        }else {
            this.lastName = lastName;
        }
        this.companyWhenWorking = companyWhenWorking;
        this.whichTransport = whichTransport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyWhenWorking() {
        return companyWhenWorking;
    }

    public void setCompanyWhenWorking() {
        if (companyWhenWorking == null || companyWhenWorking.isEmpty()) {
            this.companyWhenWorking = "Одуванчик";
        } else {
            this.companyWhenWorking = companyWhenWorking;
        }
    }

    public WhichTransport getWhichTransport() {
        return whichTransport;
    }

    public void doMaintenance(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName +
                " проводит тех.обслуживание " + transport.getBrand()
                + " " + transport.getModel());
    }

    public void fixTransport(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName +
                " чинит "+ transport.getBrand() + " " + transport.getModel());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(companyWhenWorking, mechanic.companyWhenWorking) && whichTransport == mechanic.whichTransport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, companyWhenWorking, whichTransport);
    }

    @Override
    public String toString() {
        return "Механик: " + firstName + " " + lastName + " . Из компании " + companyWhenWorking + ". Специализация: " + whichTransport+ "\n";
    }
}
