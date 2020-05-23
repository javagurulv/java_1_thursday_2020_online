package student_dmitrijs_visuns.homeworks.lesson_5.day_2;

import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int firstRandom = randomNumber.nextInt(100);
        int secondRandom = randomNumber.nextInt(100);
        int thirdRandom = randomNumber.nextInt(100);

        int[] arrayOfRandoms = new int [3];

        arrayOfRandoms[0] = firstRandom;
        arrayOfRandoms[1] = secondRandom;
        arrayOfRandoms[2] = thirdRandom;

        printArrayToConsole (arrayOfRandoms);

        for (int i = 0; i < arrayOfRandoms.length; i++) {
            arrayOfRandoms[i] += 2;
        }

        printArrayToConsole (arrayOfRandoms);




    }

    private static void printArrayToConsole (int[] arrayOfRandoms) {

        for (int i = 0; i < arrayOfRandoms.length; i++) {
            System.out.println(arrayOfRandoms[i]);
        }
    }

}
