package Drivers;

import java.util.Objects;

public class Driver implements DriverFunctions {
    private String fullName;
    private boolean license;
    private int experienceYear;
    private String licenseCategory;


    public Driver(String fullName, boolean license, String licenseCategory, int experienceYear) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Неизвестно";
        } else {
            this.fullName = fullName;
        }
        if (!license) {
            System.out.println("Водитель "+getFullName()+" недопускается до гонки, у него нет водительских прав");
        } else {
            this.license = true;
//            System.out.println("Водитель "+getFullName()+" имеет водительские права");
        }
        if (Objects.equals(licenseCategory, "B") || Objects.equals(licenseCategory, "C") || Objects.equals(licenseCategory, "D")) {
            this.licenseCategory = licenseCategory;
        } else {
            this.licenseCategory = "["+getLicenseCategory()+"] Такой категории прав нет!";
        }
        if (experienceYear == 0) {
            System.out.println("Водитель "+getFullName()+" имеет очень маленький стаж! Отстронить от гонки!");
        } else {
            this.experienceYear = experienceYear;
        }

    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Неизвестно";
        } else {
            this.fullName = fullName;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        if (!license) {
            System.out.println("Водитель "+getFullName()+" недопускается до гонки, у него нет водительских прав");
        } else {
            this.license = true;
        }
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        if (experienceYear == 0) {
            System.out.println(getFullName()+" Водитель имеет очень маленький стаж! Отстронить от гонки!");
        } else {
            this.experienceYear = experienceYear;
        }
    }

    public void setLicenseCategory(String licenseCategory) {
        if (Objects.equals(licenseCategory, "B") || Objects.equals(licenseCategory, "C") || Objects.equals(licenseCategory, "D")) {
            this.licenseCategory = licenseCategory;
        } else {
            this.licenseCategory = "["+getLicenseCategory()+"] Такой категории прав нет!";
        }
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    @Override
    public String startMoving() {
        return "Заводи мотор и вперёд!";
    }
//
    @Override
    public String stopMoving() {
        return "Паркуйся и выходи из машины";
    }

    @Override
    public void refuelCar(boolean refuelCar) {
        if (refuelCar == true) {
            System.out.println("Нужно зарпавить машину!");
        } else {
            System.out.println("Бензина достаточно! Заправка не требуется!");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return license == driver.license && Objects.equals(licenseCategory, driver.licenseCategory) && experienceYear == driver.experienceYear && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experienceYear, licenseCategory);
    }

    @Override
    public String toString() {
        return "INFO водителя: ФИО: "+getFullName()+" .Категория водительсикх прав "+getLicenseCategory()+" .Стаж "+getExperienceYear()+" лет.";
    }
}
