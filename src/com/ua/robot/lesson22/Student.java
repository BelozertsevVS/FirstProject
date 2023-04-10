package com.ua.robot.lesson22;

public class Student {
    private String secondName;
    private int averageScore;

    public Student() {
    }

    public Student(String secondName, int averageScore) {
        this.secondName = secondName;
        this.averageScore = averageScore;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "secondName='" + secondName + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
