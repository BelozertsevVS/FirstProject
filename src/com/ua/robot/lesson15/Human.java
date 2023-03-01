package com.ua.robot.lesson15;

public abstract class Human {
    private String sex;
    private int age;

    public Human() {
    }

    public Human(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
