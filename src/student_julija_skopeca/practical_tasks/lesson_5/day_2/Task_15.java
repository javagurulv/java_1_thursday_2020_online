package student_julija_skopeca.practical_tasks.lesson_5.day_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            int randomNumbers = random.nextInt(10);
            numbers[i] = randomNumbers;
        }

        System.out.println("Array numbers are " + Arrays.toString(numbers));


        for (int i =0; i < numbers.length; i++){
          int sumToTwo = numbers[i]+2;
          numbers[i] = sumToTwo;
        }

        System.out.println("Array numbers increased by 2. Result - " + Arrays.toString(numbers));

    }
}
