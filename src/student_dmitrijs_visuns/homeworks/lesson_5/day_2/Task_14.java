package student_dmitrijs_visuns.homeworks.lesson_5.day_2;

import java.util.Random;

class Task_14 {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int firstRandom = randomNumber.nextInt(100);
        int secondRandom = randomNumber.nextInt(100);
        int thirdRandom = randomNumber.nextInt(100);

        int[] arrayOfRandoms = new int [3];

        arrayOfRandoms[0] = firstRandom;
        arrayOfRandoms[1] = secondRandom;
        arrayOfRandoms[2] = thirdRandom;

        int averageOfArray = (arrayOfRandoms[0] + arrayOfRandoms[1] + arrayOfRandoms[2]) / arrayOfRandoms.length;

        System.out.println(averageOfArray);

    }

}
