package student_julija_skopeca.practical_tasks.lesson_5.day_4;

import java.util.Arrays;
import java.util.Random;

class Task_27_maxinArray {

    public static void main(String[] args) {

        int[]  numbers = new int [4];
        Random random = new Random();

        for (int i =0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(10);
            numbers[i] = randomNumber;
        }

        System.out.println("The array is " + Arrays.toString(numbers));

        int maxNumber = 0;
                for (int i = 0; i < numbers.length; i++){
            if (maxNumber <= numbers[i]){
                maxNumber = numbers[i];
                }

        }

        System.out.println("The maximal number in the array is " + maxNumber);

    }
}
