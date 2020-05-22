package student_vadims_vladisevs.lesson5.day_2;

import java.util.Random;

class Task_13 {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int[] numbersArray = new int[3];
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            sum += numbersArray[i];
        }

        System.out.println("Random numbers sum = " + sum);
    }
}
