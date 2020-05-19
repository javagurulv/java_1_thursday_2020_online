package student_igors_mihejevs.lesson_5.day_6;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

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

    // print array
    public void printArrayToConsole(int[] array) {
        System.out.println("Numbers from array : " + Arrays.toString(array));
    }

    // maximum number in array
    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > maxNumber) maxNumber = i;
        }
        return maxNumber;
    }


}
