package student_julija_skopeca.practical_tasks.lesson_5.day_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int [] array = new int [arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
        Random random = new Random();
        for (int i =0; i < array.length; i++) {
            int randomNumbers = random.nextInt();
            array[i] = randomNumbers;
        }
    }
}
