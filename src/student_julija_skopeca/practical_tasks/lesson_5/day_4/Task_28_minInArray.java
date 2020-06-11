package student_julija_skopeca.practical_tasks.lesson_5.day_4;

import java.util.Arrays;
import java.util.Random;

class Task_28_minInArray {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            int randomNumber = random.nextInt(10);
            numbers[i] = randomNumber;
        }

        System.out.println("The array is " + Arrays.toString(numbers));

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber >= numbers[i]) {
                minNumber = numbers[i];
            }
        }

        System.out.println("The minimum number is " + minNumber);

    }
}
