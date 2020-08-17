package student_igors_mihejevs.lesson_6.homework.level_3;

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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber.nextInt(1000);
        }
    }

    // fill array with user numbers
    public void fillArrayWithUserNumbers(int[] arr) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input " + arr.length + " integer numbers");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            arr[i] = userInput.nextInt();
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
        int i = 0;
        while (i < arr.length) {
            arr[i] = arr[i] + 2;
            i++;
        }
    }

    // maximum number in arrayi
    public int findMaxNumber(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > maxNumber) maxNumber = arr[i];
            i++;
        }
        return maxNumber;
    }

    // minimum number in array
    public int findMinNumber(int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < minNumber) minNumber = arr[i];
            i++;
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


	//Print or Find????   - лучше убрать такой комментарий и переименовать метод

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
    public boolean ifArrayContainsSpecifiedNumber(int[] arr, int number) {
        boolean isNumber = false;
        for (int i : arr) {
            if (i == number) {
                isNumber = true;
                break;
            }
        }
        return isNumber;
    }

    // how many times the array contains the specified number
    public int quantityOfSpecifiedNumber(int[] arr, int number) {
        int counterOfNumbers = 0;
        for (int i : arr) {
            if (i == number) {
                counterOfNumbers += 1;
            }
        }
        return counterOfNumbers;
    }

    // finding the first specified number and replacing it with another specified number task_10
    void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    // finding the specified numbers in array and replacing it with another specified numbers task_11
    void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) arr[i] = newNumber;
        }
    }

    // flipping an array of integers
    void flipping(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tempNumber = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tempNumber;
        }
    }

    // sorting an array of integers Task_14
    void sorting(int[] arr) {
        Arrays.sort(arr);
    }

}
