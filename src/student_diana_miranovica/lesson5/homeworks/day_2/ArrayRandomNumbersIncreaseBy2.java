package student_diana_miranovica.lesson5.homeworks.day_2;

import java.util.Random;

class ArrayRandomNumbersIncreaseBy2 {

    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();
        randomNumbers[0] = random.nextInt(8);
        randomNumbers[1] = random.nextInt(8);
        randomNumbers[2] = random.nextInt(8);

        System.out.println("Random numbers [0] = " + randomNumbers[0]);
        System.out.println("Random numbers [1] = " + randomNumbers[1]);
        System.out.println("Random numbers [2] = " + randomNumbers[2]);



        int randomNumbers0IncreaseBy2 = randomNumbers[0] +2;
        int randomNumbers1IncreaseBy2 = randomNumbers[1] +2;
        int randomNumbers2IncreaseBy2 = randomNumbers[2] +2;

        System.out.println("Random numbers [0] = " + randomNumbers0IncreaseBy2);
        System.out.println("Random numbers [1] = " + randomNumbers1IncreaseBy2);
        System.out.println("Random numbers [2] = " + randomNumbers2IncreaseBy2);


    }
}
