package student_dmitrijs_visuns.homeworks.lesson_5.day_2;

/* Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль. */

import java.util.Random;

class Task_12 {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int firstRandom = randomNumber.nextInt(100);
        int secondRandom = randomNumber.nextInt(100);
        int thirdRandom = randomNumber.nextInt(100);

        int[] arrayOfRandoms = new int [3];

        arrayOfRandoms[0] = firstRandom;
        arrayOfRandoms[1] = secondRandom;
        arrayOfRandoms[2] = thirdRandom;

        System.out.println(arrayOfRandoms[0]);
        System.out.println(arrayOfRandoms[1]);
        System.out.println(arrayOfRandoms[2]);


    }

}
