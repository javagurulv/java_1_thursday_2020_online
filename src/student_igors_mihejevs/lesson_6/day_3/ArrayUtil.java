package student_igors_mihejevs.lesson_6.day_3;

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
    public void fillArrayWithRandomNumbers(int[] arr) {
        Random randomNumber = new Random();
        for (int counter = 0; counter < arr.length; counter++) {
            arr[counter] = randomNumber.nextInt(1000);
        }
    }

    // fill array with user numbers
    public void fillArrayWithUserNumbers(int[] arr) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input " + arr.length + " integer numbers");
        for (int counter = 0; counter < arr.length; counter++) {
            System.out.print("Input number " + (counter + 1) + " : ");
            arr[counter] = userInput.nextInt();
        }
    }

    // print array
    public void printArrayToConsole(int[] arr) {
        System.out.println("Numbers from array : " + Arrays.toString(arr));
    }

    // sum of all numbers in array
    public int sumOfAllNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    // average number from all numbers in array
    public int averageNumber(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum / arr.length;
    }

    // increase the value of each cell by 2
    public void increaseEveryNumberByTwo(int[] arr) {
        int counter = 0;
        while (counter < arr.length) {
            arr[counter] = arr[counter] + 2;
            counter++;
        }
    }

    // maximum number in array
    public int findMaxNumber(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        int counter = 0;
        while (counter < arr.length) {
            if (arr[counter] > maxNumber) maxNumber = arr[counter];
            counter++;
        }
        return maxNumber;
    }

    // minimum number in array
    public int findMinNumber(int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        int counter = 0;
        while (counter < arr.length) {
            if (arr[counter] < minNumber) minNumber = arr[counter];
            counter++;
        }
        return minNumber;
    }

    // print even number from array
    public void findEvenNumber(int[] arr) {
        System.out.print("All even numbers from array : ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    // print odd number from array
    public void findOddNumber(int[] arr) {
        System.out.print("All odd numbers from array : ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    // if array contains the specified number
    public boolean ifArrayContainsSpecifiedNumber (int[] arr, int number) {
        boolean isNumber = false;
        for (int i : arr) {
            if (i == number) {
                isNumber = true;
                break;
            }
        } return isNumber;
    }

    // how many times the array contains the specified number
    public int quantityOfSpecifiedNumber (int[] arr, int number) {
        int counterOfNumbers = 0;
        for (int i : arr) {
            if (i == number) {
                counterOfNumbers += 1;
            }
        } return counterOfNumbers;
    }

    // finding the specified number and replacing it with another number
    void replaceNumber(int[] arr, int numberToReplace, int newNumber) {
        int counterOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

}
