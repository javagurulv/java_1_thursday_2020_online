package student_julija_skopeca.practical_tasks.lesson_5.day_2;

import java.util.Arrays;
import java.util.Random;

class task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            int randomNumbers = random.nextInt(10);
            numbers[i] = randomNumbers;
        }

        System.out.println("Array numbers are " + Arrays.toString(numbers));

        int sumToTwo;
        for (int i =0; i < numbers.length; i++){
            sumToTwo = numbers[i]+2;
        }


    }
}
