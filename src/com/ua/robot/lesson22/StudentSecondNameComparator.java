package com.ua.robot.lesson22;

import java.util.Comparator;

public class StudentSecondNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String secondName1 = o1.getSecondName();
        String secondName2 = o2.getSecondName();
        return secondName1.compareTo(secondName2);
    }
}
