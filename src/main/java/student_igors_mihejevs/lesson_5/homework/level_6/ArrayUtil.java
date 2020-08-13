package student_igors_mihejevs.lesson_5.homework.level_6;

import java.util.Arrays;
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

    // print array
    public void printArrayToConsole(int[] array) {
        System.out.println("Numbers from array : " + Arrays.toString(array));
    }

    // maximum number in array
    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] > maxNumber) maxNumber = array[i];
            i++;
        }
        return maxNumber;
    }

    // minimum number in array
    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] < minNumber) minNumber = array[i];
            i++;
        }
        return minNumber;
    }


}
