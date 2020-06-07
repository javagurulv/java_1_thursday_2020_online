package student_julija_skopeca.practical_tasks.lesson_5.day_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {

        int[] randomNumbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNuber = random.nextInt(10);
            randomNumbers[i] = randomNuber;
        }

        System.out.println("Array numbers are " + Arrays.toString(randomNumbers));

    }
}
