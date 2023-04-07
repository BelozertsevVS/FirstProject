package com.ua.robot.lesson22;

import java.util.Comparator;

public class StudentAverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Integer averageScore1 = o1.getAverageScore();
        Integer averageScore2 = o2.getAverageScore();
        return averageScore2.compareTo(averageScore1);
    }
}
