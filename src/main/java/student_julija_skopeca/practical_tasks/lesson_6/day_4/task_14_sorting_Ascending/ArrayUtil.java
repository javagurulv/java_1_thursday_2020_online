package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_14_sorting_Ascending;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int [] array = new int [arrayLength];
        return array;
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

    public void replace(int[] array, int numberToReplace, int newNumber){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public int[] replaceOrderInArray(int[] array){
        int[] replacedArray = new int[array.length];
        int i = 0;
        while(i < array.length) {
            replacedArray[i] = array[array.length-1-i];
            i++;
        }
        return replacedArray;
    }

    public int[] sortAscending(int[] array){
        Arrays.sort(array);
        return array;}

   /* public Integer[] sortDescending(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        return array;}*/


}
