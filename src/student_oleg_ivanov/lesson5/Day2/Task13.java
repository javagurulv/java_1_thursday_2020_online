package student_oleg_ivanov.lesson5.Day2;

import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0; // объявляйте этк переменную перед циклом в котором вы её используете
        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(100);
            randomNumbers[i] = randomNumber;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Your random numbers = " + randomNumbers[i]);
        }

        for (int h =0; h < randomNumbers.length; h++) {
            sum += randomNumbers [h];
        }
        System.out.println("Your random numbers sum  = " + sum);

    }
}

