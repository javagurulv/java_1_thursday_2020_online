package student_igors_mihejevs.lesson_6.homework.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    // create double array
    int[][] createDoubleArray(int arrayLength1, int arrayLength2) {
        return new int[arrayLength1][arrayLength2];
    }

    // print double array
    public void printDoubleArrayToConsole(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Row " + (i + 1) + " : " + Arrays.toString(arr[i]));
        }
    }

    // fill double array with random integer numbers between 0 and 999
    void fillArrayWithRandomNumbers(int[][] arr) {
        Random randomNumber = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = randomNumber.nextInt(1000);
        }
/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int number = arr[i][j];
                System.out.println("[" + i + "," + j + "] = " + number);
            }
        } */
    }

    // count sum of all numbers in array
    int sumOfAllNumbersFromDoubleArray(int[][] arr) {

        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) sum += anInt;
        }
        return sum;
    }

}
