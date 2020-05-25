package student_oleg_ivanov.lesson5.Day2;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(100);
            randomNumbers[i] = randomNumber;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Your random numbers = " + randomNumbers[i]);
        }
        System.out.println("Random number + 2 ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Your random numbers = " + (randomNumbers[i] + 2 ));
        }

    }
}

