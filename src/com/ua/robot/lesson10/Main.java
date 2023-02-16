package com.ua.robot.lesson10;

public class Main {
    public static void main(String[] args) {

        Student petrov = new Student("Petrov", "man", 19,89);

        System.out.println("Our " + petrov);

        petrov.study();
        petrov.takeExams();
        petrov = petrov.averageScoreChange(petrov, 95);

        System.out.println("The student successfully passed the exams and his average score has changed " + petrov);

        petrov.diplomaDefense();


        Teacher ivanov = new Teacher("Ivanov", "man", 97, "PhD", "Professor", 125);
        System.out.println(ivanov);

        ivanov.studentEducation();
        ivanov.takingExams();
        ivanov.writingScientificArticles();

        ArrayService arrayService = new ArrayService();
        int [] arr = arrayService.createArray(10);


        arrayService.fillArrayWithRandomNumber(arr, 100);
        arrayService.printArray(arr);
        arrayService.sortArrayAscending(arr);
        System.out.println();
        arrayService.printArray(arr);
        System.out.println();
        arrayService.sortArrayDescending(arr);
        arrayService.printArray(arr);

    }
}
