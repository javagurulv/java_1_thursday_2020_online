package student_vadim_sokolenko.Lesson5HomeWorks.Day2;

import java.util.Random;

class SumOfThreeRandomNumbers {

    public static void main(String[] args) {

        int [] randomNumbers = new int[3];

        Random random = new Random();

        randomNumbers [0] = random.nextInt(10);
        randomNumbers [1] = random.nextInt(15);
        randomNumbers [2] = random.nextInt(20);


        System.out.println("numbers [0] = "+ randomNumbers[0]);
        System.out.println("numbers [1] = "+ randomNumbers[1]);
        System.out.println("numbers [2] = "+ randomNumbers[2]);

        int sum = randomNumbers[0] + randomNumbers[1] + randomNumbers[2];
        System.out.println("Sum of three random numbers is " + sum);
    }
}
