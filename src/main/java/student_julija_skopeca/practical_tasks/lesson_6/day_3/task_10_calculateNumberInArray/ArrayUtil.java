package student_julija_skopeca.practical_tasks.lesson_6.day_3.task_10_calculateNumberInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
		// в одну стороку! return new int[arrayLength];
		// переменную создавать не стоит
        //int [] array = new int [arrayLength];
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
        Random random = new Random(3);
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

    public boolean findNumber(int[] array, int number) {
        boolean result = IntStream.of(array).anyMatch(x -> x == number);
        /*if (result) {
            System.out.println("There is number " + number + " in the array");
        } else {
            System.out.println("There is no number " + number + " in the array");
        }*/
        return result;
    }


    public long numberCountinArray(int[] array, int number) {
        long result = IntStream.of(array).filter(x -> x == number).count();
        return result;
    }

    }
