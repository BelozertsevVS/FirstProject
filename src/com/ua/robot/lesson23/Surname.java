package com.ua.robot.lesson23;

public class Surname {
    private String surname;

    public Surname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Surname{" +
                "surname='" + surname + '\'' +
                '}';
    }
}
