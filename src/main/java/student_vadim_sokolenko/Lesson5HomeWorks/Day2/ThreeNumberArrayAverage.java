package student_vadim_sokolenko.Lesson5HomeWorks.Day2;

import java.util.Random;

class ThreeNumberArrayAverage {

    public static void main(String[] args) {


        int[] randomNumbers = new int[3];

        Random random = new Random();

        randomNumbers [0] = random.nextInt(10);
        randomNumbers [1] = random.nextInt(10);
        randomNumbers [2] = random.nextInt(10);


        System.out.println("numbers [0] = "+ randomNumbers[0]);
        System.out.println("numbers [1] = "+ randomNumbers[1]);
        System.out.println("numbers [2] = "+ randomNumbers[2]);

        int averageNumber = (randomNumbers[0] + randomNumbers[1] + randomNumbers[2]) / 3;
        System.out.println("Three number average is " + averageNumber );

    }
}
