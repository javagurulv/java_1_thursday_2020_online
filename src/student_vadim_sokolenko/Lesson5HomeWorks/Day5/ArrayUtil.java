package student_vadim_sokolenko.Lesson5HomeWorks.Day5;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Write implementation here !!!

        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);

        }
    }

    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;

    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]" + "  in an array = " + array[i]);
        }
    }


    public int findMinNumber(int[] array) {
        // Write implementation here !!!
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}











