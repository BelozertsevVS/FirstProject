package com.ua.robot.lesson11;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo ", 150, 50, "Red","A");

        PassengerCar car2 = new PassengerCar("Volvo",100,60, "Green", "D", 5,"A");

        FreightCar car3 = new FreightCar("Volvo",250,100, "Red", "B", 5, "Yes");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(car1.getType());
        System.out.println(car2.getType());
        System.out.println(car3.getType());
    }
}
