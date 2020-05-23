package student_vadims_vladisevs.lesson5.day_2;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int[] numbersArray = new int[3];
        double sum = 0;

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            sum += numbersArray[i];
        }

        double average = sum / numbersArray.length;
        System.out.println("Random numbers average result = " + average);

    }
}
