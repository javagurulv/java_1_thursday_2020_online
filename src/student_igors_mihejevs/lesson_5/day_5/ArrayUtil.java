package student_igors_mihejevs.lesson_5.day_5;

import java.util.Random;

class ArrayUtil {

    // create array
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    // fill array with integer numbers between 0 and 999
    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = randomNumber.nextInt(1000);
        }
    }

}
