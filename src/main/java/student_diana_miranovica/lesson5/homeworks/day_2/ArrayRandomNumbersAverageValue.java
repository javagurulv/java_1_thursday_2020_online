package student_diana_miranovica.lesson5.homeworks.day_2;

import java.util.Random;

 class ArrayRandomNumbersAverageValue {

    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();
        randomNumbers[0]=random.nextInt(8);
        randomNumbers[1]=random.nextInt(8);
        randomNumbers[2]=random.nextInt(8);

        System.out.println("Random numbers [0] = "+ randomNumbers[0]);
        System.out.println("Random numbers [1] = "+ randomNumbers[1]);
        System.out.println("Random numbers [2] = "+ randomNumbers[2]);

        int averageValue = (randomNumbers[0] + randomNumbers[1] + randomNumbers[2] ) /3;

        System.out.println("Average value = "+ averageValue);
    }
}
