package com.ua.robot.lesson10;

public class Student {

    private String name;
    private String sex;
    private int age;
    private int averageScore;

    public Student() {
    }

    public Student(String name, String sex, int age, int averageScore) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

    public void study() {
        System.out.println("Student studying");
    }

    public void takeExams() {
        System.out.println("Student taking exams");
    }

    public void diplomaDefense() {
        System.out.println("Student defend a diploma");
    }

    public Student averageScoreChange(Student student, int newAverageScore) {
        student.setAverageScore(newAverageScore);

        return student;
    }


}
