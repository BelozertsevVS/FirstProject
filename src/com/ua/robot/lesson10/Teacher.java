package com.ua.robot.lesson10;

public class Teacher {

    private String name;
    private String sex;
    private int age;
    private String academicDegree;
    private String academicRank;
    private int citationIndex;

    public Teacher() {
    }

    public Teacher(String name, String sex, int age, String academicDegree, String academicRank, int citationIndex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.academicDegree = academicDegree;
        this.academicRank = academicRank;
        this.citationIndex = citationIndex;
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

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public int getCitationIndex() {
        return citationIndex;
    }

    public void setCitationIndex(int citationIndex) {
        this.citationIndex = citationIndex;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", sex='" + sex + '\'' + ", age=" + age + ", academicDegree='" + academicDegree + '\'' + ", academicRank='" + academicRank + '\'' + ", citationIndex=" + citationIndex + '}';
    }

    public void studentEducation() {
        System.out.println("Teacher teaches students");
    }

    public void takingExams() {
        System.out.println("Teacher takes exams");
    }

    public void writingScientificArticles() {
        System.out.println("Teacher writes scientific articles");
    }
}
