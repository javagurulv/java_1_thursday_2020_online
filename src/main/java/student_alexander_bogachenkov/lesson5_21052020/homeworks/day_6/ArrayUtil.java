package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_6;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + i + " cell has number " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxArrayNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArrayNum) {
                maxArrayNum = array[i];
            }
        }
        return maxArrayNum;
    }

    public int findMinNumber(int[] array) {
        int minArrayNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minArrayNum) {
                minArrayNum = array[i];
            }
        }
        return minArrayNum;
    }
}
