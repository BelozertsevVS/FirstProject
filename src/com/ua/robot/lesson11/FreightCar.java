package com.ua.robot.lesson11;

public class FreightCar extends Car {

    private int numberOfDrivingAxles;
    private String trailerAvailability;

    public FreightCar() {
    }

    public FreightCar(int numberOfDrivingAxles, String trailerAvailability) {
        this.numberOfDrivingAxles = numberOfDrivingAxles;
        this.trailerAvailability = trailerAvailability;
    }

    public FreightCar(String model, int maxSpeed, int carryingCapacity, String color, String carBodyType, int numberOfDrivingAxles, String trailerAvailability) {
        super(model, maxSpeed, carryingCapacity, color, carBodyType);
        this.numberOfDrivingAxles = numberOfDrivingAxles;
        this.trailerAvailability = trailerAvailability;
    }

    public int getNumberOfDrivingAxles() {
        return numberOfDrivingAxles;
    }

    public void setNumberOfDrivingAxles(int numberOfDrivingAxles) {
        this.numberOfDrivingAxles = numberOfDrivingAxles;
    }

    public String getTrailerAvailability() {
        return trailerAvailability;
    }

    public void setTrailerAvailability(String trailerAvailability) {
        this.trailerAvailability = trailerAvailability;
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "numberOfDrivingAxles=" + numberOfDrivingAxles +
                ", trailerAvailability='" + trailerAvailability + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", carryingCapacity=" + carryingCapacity +
                ", color='" + color + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Freight Car";
    }
}
