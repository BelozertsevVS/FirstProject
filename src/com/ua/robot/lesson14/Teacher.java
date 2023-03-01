package com.ua.robot.lesson14;

public class Teacher extends ParticipantOfTheEducationalProcess {
    private String firstName;
    private String lastName;
    private String scienceDegree;
    private PersonalAffair personalAffair;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String scienceDegree, PersonalAffair personalAffair) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scienceDegree = scienceDegree;
        this.personalAffair = personalAffair;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getScienceDegree() {
        return scienceDegree;
    }

    public void setScienceDegree(String scienceDegree) {
        this.scienceDegree = scienceDegree;
    }

    public PersonalAffair getPersonalAffair() {
        return personalAffair;
    }

    public void setPersonalAffair(PersonalAffair personalAffair) {
        this.personalAffair = personalAffair;
    }

    @Override
    public void startEducationalProcess() {
        System.out.println("To start the educational process, the teacher must: ");
        System.out.println("1) prepare a discipline program");
        System.out.println("2) familiarize with the schedule");
        System.out.println("3) get a group list in the dean's office");
        System.out.println();
    }

    public static class PersonalAffair {
        private int numberOfThePersonalAffair;

        public PersonalAffair() {
        }

        public PersonalAffair(int numberOfThePersonalAffair) {
            this.numberOfThePersonalAffair = numberOfThePersonalAffair;
        }

        public int getNumberOfThePersonalAffair() {
            return numberOfThePersonalAffair;
        }

        public void setNumberOfThePersonalAffair(int numberOfThePersonalAffair) {
            this.numberOfThePersonalAffair = numberOfThePersonalAffair;
        }
    }
}
