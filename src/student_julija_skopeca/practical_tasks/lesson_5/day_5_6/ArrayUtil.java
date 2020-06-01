package student_julija_skopeca.practical_tasks.lesson_5.day_5_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // проще в одну строку: return new int [arrayLength];
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

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
      System.out.println("The array is " + Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
        int maxNumber = array [0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        // Write implementation here !!!
        int minNumber = array [0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
