package student_igors_mihejevs.lesson_5.day_x.super_task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

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

    // fill array with user numbers
    public void fillArrayWithUserNumbers(int[] array) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input " + array.length + " integer numbers");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.print("Input number " + (counter + 1) + " : ");
            array[counter] = userInput.nextInt();
        }
    }

    // print array
    public void printArrayToConsole(int[] array) {
        System.out.println("Numbers from array : " + Arrays.toString(array));
    }

    // maximum number in array
    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int counter = 0;
        while (counter < array.length) {
            if (array[counter] > maxNumber) maxNumber = array[counter];
            counter++;
        }
        return maxNumber;
    }

    // minimum number in array
    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int counter = 0;
        while (counter < array.length) {
            if (array[counter] < minNumber) minNumber = array[counter];
            counter++;
        }
        return minNumber;
    }

    // print even number from array
    public void findEvenNumber(int[] array) {
        System.out.print("All even numbers from array : ");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    // print odd number from array
    public void findOddNumber(int[] array) {
        System.out.print("All odd numbers from array : ");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
