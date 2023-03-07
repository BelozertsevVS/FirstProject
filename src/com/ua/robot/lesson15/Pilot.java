package com.ua.robot.lesson15;

public class Pilot extends Human implements Fly {
    private int pilotLicenseNumber;

    public Pilot() {
    }

    public Pilot(int pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public Pilot(String sex, int age, int pilotLicenseNumber) {
        super(sex, age);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public int getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(int pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fly() {
        System.out.println("I'm flying on an airplane");
    }
}
