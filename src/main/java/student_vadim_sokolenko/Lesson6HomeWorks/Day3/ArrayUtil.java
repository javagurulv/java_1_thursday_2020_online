package student_vadim_sokolenko.Lesson6HomeWorks.Day3;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
		// в одну стороку! return new int[arrayLength];
		// переменную создавать не стоит

    	int[] array = new int[arrayLength];
        return array;
    }


    public boolean arrayIsContainingCertainNumber(int[] array, int number) {

        return IntStream.of(array).anyMatch(x -> x == number);
    }


    public int howManyTimesArrayContainsCertainNumber(int[] array, int number) {
        int sum = 0;
        for (int value : array) {
            if (value == number) {
                sum += 1;
            }
        }
        return sum;
    }

    public void replaceNumberInArray (int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void reverseNumberOrder (int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
    }

    void sorting(int[] arr) {
        Arrays.sort(arr);
    }
}










