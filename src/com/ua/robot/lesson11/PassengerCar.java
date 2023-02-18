package com.ua.robot.lesson11;

public class PassengerCar extends Car {

    private int numberOfPassengerSeats;
    private String comfortClass;

    public PassengerCar() {
    }

    public PassengerCar(int numberOfPassengerSeats, String comfortClass) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.comfortClass = comfortClass;
    }

    public PassengerCar(String model, int maxSpeed, int carryingCapacity, String color, String carBodyType, int numberOfPassengerSeats, String comfortClass) {
        super(model, maxSpeed, carryingCapacity, color, carBodyType);
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.comfortClass = comfortClass;
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    public String getComfortClass() {
        return comfortClass;
    }

    public void setComfortClass(String comfortClass) {
        this.comfortClass = comfortClass;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numberOfPassengerSeats=" + numberOfPassengerSeats +
                ", comfortClass='" + comfortClass + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", color='" + color + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Passenger Car";
    }
}
