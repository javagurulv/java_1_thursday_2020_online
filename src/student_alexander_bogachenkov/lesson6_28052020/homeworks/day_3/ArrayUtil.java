package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_3;

import java.util.Random;
import java.util.stream.IntStream;

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
        for (int value : array) {
            if (value > maxArrayNum) {
                maxArrayNum = value;
            }
        }
        return maxArrayNum;
    }

    public int findMinNumber(int[] array) {
        int minArrayNum = array[0];
        for (int value : array) {
            if (value < minArrayNum) {
                minArrayNum = value;
            }
        }
        return minArrayNum;
    }

    public boolean isContainingCertainNumber(int[] array, int number) {
        return IntStream.of(array).anyMatch(x -> x == number);
    }
}