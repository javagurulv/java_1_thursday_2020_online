package student_diana_miranovica.lesson5.homeworks.day_2;

import java.util.Random;

 class ArrayRandomNumbersSum {

    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();
        randomNumbers[0] = random.nextInt(15);
        randomNumbers[1] = random.nextInt(15);
        randomNumbers[2] = random.nextInt(15);

        System.out.println("randomNumbers [0] = "+ randomNumbers[0]);
        System.out.println("randomNumbers [1] = "+ randomNumbers[1]);
        System.out.println("randomNumbers [2] = "+ randomNumbers[2]);

        int sum = randomNumbers[0] + randomNumbers[1] + randomNumbers[2];
        System.out.println(" randomNumbers sum = "+ sum);
    }
}
