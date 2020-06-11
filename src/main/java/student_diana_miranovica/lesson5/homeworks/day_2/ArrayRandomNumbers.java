package student_diana_miranovica.lesson5.homeworks.day_2;

import java.util.Random;

class ArrayRandomNumbers {

    public static void main(String[] args) {
        int[] randomNumbers = new int[3];

        Random random = new Random();
        randomNumbers[0] = random.nextInt(13);
        randomNumbers[1] = random.nextInt(13);
        randomNumbers[2] = random.nextInt(13);

        System.out.println("numbers [0] = "+ randomNumbers[0]);
        System.out.println("numbers [1] = "+ randomNumbers[1]);
        System.out.println("numbers [2] = "+ randomNumbers[2]);
    }
}
