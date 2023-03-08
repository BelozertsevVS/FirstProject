package com.ua.robot.lesson17;

public class EnumService implements ReturnEnumName {
    private int dayOfTheWeekNumber;

    public EnumService() {
    }

    public EnumService(int dayOfTheWeekNumber) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
    }

    public int getDayOfTheWeekNumber() {
        return dayOfTheWeekNumber;
    }

    public void setDayOfTheWeekNumber(int dayOfTheWeekNumber) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
    }


    @Override
    public DafOfWeek returnFullEnumName(int dayOfTheWeekNumber) {
        switch (dayOfTheWeekNumber) {
            case 1:
                System.out.println(DafOfWeek.MONDAY);
                return DafOfWeek.MONDAY;
            case 2:
                System.out.println(DafOfWeek.TUESDAY);
                return DafOfWeek.TUESDAY;
            case 3:
                System.out.println(DafOfWeek.WEDNESDAY);
                return DafOfWeek.WEDNESDAY;
            case 4:
                System.out.println(DafOfWeek.THURSDAY);
                return DafOfWeek.THURSDAY;
            case 5:
                System.out.println(DafOfWeek.FRIDAY);
                return DafOfWeek.FRIDAY;
            case 6:
                System.out.println(DafOfWeek.SATURDAY);
                return DafOfWeek.SATURDAY;
            case 7:
                System.out.println(DafOfWeek.SUNDAY);
                return DafOfWeek.SUNDAY;
        }
        System.out.println("The number of the day of the week you entered does not match any day of the week we know");
        System.out.println("Please, enter the day of the week number from 1 to 7");
        return null;
    }
}