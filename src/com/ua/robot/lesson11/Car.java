package com.ua.robot.lesson11;

public class Car {

    protected String model;
    protected int maxSpeed;
    protected int carryingCapacity;
    protected String color;
    protected String carBodyType;

    public Car() {
    }

    public Car(String model, int maxSpeed, int carryingCapacity, String color, String carBodyType) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.carryingCapacity = carryingCapacity;
        this.color = color;
        this.carBodyType = carBodyType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", color='" + color + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                '}';
    }

    public String getType() {
        return "Car";
    }

}
