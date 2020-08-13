package student_igors_mihejevs.lesson_5.homework.level_x.super_task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    // enter length of array with user input
    public int enterArrayLength() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input the length of array : ");
        return userInput.nextInt();
    }

    // create array
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    // create array of arbitrary length between 1 and 20
    public int[] createArrayOfArbitraryLength() {
        Random randomNumber = new Random();
        return new int[randomNumber.nextInt(19) + 1];
    }

    // fill array with random integer numbers between 0 and 999
    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(1000);
        }
    }

    // fill array with user numbers
    public void fillArrayWithUserNumbers(int[] array) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input " + array.length + " integer numbers");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            array[i] = userInput.nextInt();
        }
    }

    // print array
    public void printArrayToConsole(int[] array) {
        System.out.println("Numbers from array : " + Arrays.toString(array));
    }

    // sum of all numbers in array
    public int sumOfAllNumbers(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }

    // average number from all numbers in array
    public int averageNumber(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum / array.length;
    }

    // increase the value of each cell by 2
    public void increaseEveryNumberByTwo(int[] array) {
        int i = 0;
        while (i < array.length) {
            array[i] = array[i] + 2;
            i++;
        }
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
