package student_vadims_vladisevs.lesson5.day_x;

import java.util.Random;

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
        for (int number : array){
            System.out.println(number);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int tempNumber : array){
            if (tempNumber > maxNumber){
                maxNumber = tempNumber;
            }
        }

        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];

        for (int tempNumber : array){
            if (tempNumber < minNumber){
                minNumber = tempNumber;
            }
        }

        return minNumber;
    }


    public int[] createArray(int arrayLength) {
        int[] tempArray = new int[arrayLength];
        return tempArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = randomNumber.nextInt(100);
        }
    }

    public void evenNumbersFromArray(int[] array) {
        System.out.print("Even numbers from array :");
        for (int evenNumber : array) {
            if (evenNumber % 2 == 0) {
                System.out.print(" " + evenNumber);
            }
        }
    }


    public void oddNumbersFromArray(int[] array){
        System.out.print("Odd numbers from array :");

        for (int oddNumber : array){
            if (oddNumber % 2 != 0){
                System.out.print(" " + oddNumber);
            }
        }
    }
}
