package student_igors_mihejevs.lesson_5.homework.level_5;

import java.util.Random;

class ArrayUtil {

    // create array
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    // fill array with integer numbers between 0 and 999
    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(1000);
        }
    }

}
