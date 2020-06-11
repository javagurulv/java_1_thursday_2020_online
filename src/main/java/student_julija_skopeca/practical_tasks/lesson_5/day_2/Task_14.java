package student_julija_skopeca.practical_tasks.lesson_5.day_2;

import java.util.Random;

class Task_14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            int randomNumber = random.nextInt(10);
            numbers[i] = randomNumber;
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("Average number of array is " + (sum/3));

    }
}
