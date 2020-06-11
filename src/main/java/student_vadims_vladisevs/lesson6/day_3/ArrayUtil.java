package student_vadims_vladisevs.lesson6.day_3;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int getArrayLengthFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = sc.nextInt();
        return arrLength;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithNumbersFromUser(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element: ");
            arr[i] = sc.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
    }

    public void printArrayToConsole(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr element = " + arr[i]);
        }
    }

    public void fillArrayFromOne(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
    }

    public void fillArrayWithFive(int[] arr){
        for (int i =0; i < arr.length; i++){
            arr[i] = 5;
        }
    }

    public boolean isNumberInArray(int number, int[] array){
        for (int temp : array){
            if (temp == number){
                return true;
            }
        }
        return false;
    }

    public int numberCountInArray(int number, int[] array){
        int count = 0;
        for (int temp : array){
            if (temp == number){
                count++;
            }
        }
        return count;
    }

    public void replaceNumber(int[] array, int numberToReplace, int newNumber){
        for (int i = 0; i < array.length; i++){
            if (array[i] == numberToReplace){
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber){
        for (int i = 0; i < array.length; i++){
            if (array[i] == numberToReplace){
                array[i] = newNumber;
                break;
            }
        }
    }

    public void arrayRotation(int[] array){
            for (int i = 0; i < array.length / 2; i++){
            int tempValue = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tempValue;
        }
    }

}