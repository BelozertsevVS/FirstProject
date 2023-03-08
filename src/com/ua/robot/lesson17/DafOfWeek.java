package com.ua.robot.lesson17;

public enum DafOfWeek {
    MONDAY(1, "MON"),
    TUESDAY(2, "TUE"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "THU"),
    FRIDAY(5, "FRI"),
    SATURDAY(6, "SAT"),
    SUNDAY(7, "SUN");

    private int dayOfTheWeekNumber;
    private String shortName;

    DafOfWeek() {
    }

    DafOfWeek(int dayOfTheWeekNumber, String shortName) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
        this.shortName = shortName;
    }

    public int getDayOfTheWeekNumber() {
        return dayOfTheWeekNumber;
    }

    public void setDayOfTheWeekNumber(int dayOfTheWeekNumber) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    @Override
    public String toString() {
        return "DafOfWeek{" +
                "dayOfTheWeekNumber=" + dayOfTheWeekNumber +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
