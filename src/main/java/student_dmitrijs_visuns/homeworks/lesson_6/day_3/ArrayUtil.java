package student_dmitrijs_visuns.homeworks.lesson_6.day_3;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public boolean findNumberInArray(int[] array, int numberToFind) {
        boolean isNumberInArray = false;
        for (int i : array) {
            if(i == numberToFind) {
                isNumberInArray = true;
                break;
            }
        }
        return isNumberInArray;
    }


    public int howManyTimesIsNumberInArray(int[] array, int numberToFind) {
        int numberCounter = 0;
        for (int i : array) {
            if(i == numberToFind) {
                numberCounter++;
            }
        }
        return numberCounter;
    }

    public void replaceNumberInArray (int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if(array [i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll (int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if(array [i] == numberToReplace) {
                array[i] = newNumber;
            }
        }

    }

    public void reverseArrayNumbers (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }

    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }


    public void printArrayToConsole(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }


    public int findMaxNumber(int[] array) {
        int arrayMaxValue = array[0];

        for (int i : array) {
            if (i > arrayMaxValue) {
                arrayMaxValue = i;
            }
        }
        return arrayMaxValue;
    }


    public int findMinNumber(int[] array) {
        int arrayMinValue = array[0];

        for (int i : array) {
            if (i < arrayMinValue) {
                arrayMinValue = i;
            }
        }
        return arrayMinValue;
    }

   /* public void ArrayEvenNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Array number " + array[i] + " is even");
            }
        }

    }


    public void ArrayOddNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Array number " + array[i] + " is odd");
            }
        }

    }*/

}
