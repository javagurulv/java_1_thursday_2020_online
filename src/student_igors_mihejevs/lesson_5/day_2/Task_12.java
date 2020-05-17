package student_igors_mihejevs.lesson_5.day_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] numbers = new int[3];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = randomNumber.nextInt(1000);
        }
        System.out.println("Numbers from array : " + Arrays.toString(numbers));
    }

}
