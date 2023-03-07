package com.ua.robot.lesson15;

public class Driver extends Human implements Driving {
    private int driverLicenseNumber;

    public Driver() {
    }

    public Driver(int driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public Driver(String sex, int age, int driverLicenseNumber) {
        super(sex, age);
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public int getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(int driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void drive() {
        System.out.println("I drive a car");
    }
}
