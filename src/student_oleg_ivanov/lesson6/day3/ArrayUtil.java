package student_oleg_ivanov.lesson6.day3;

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
    public void findNumberInArrays(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            arr [i] = 9;
        }
    }
    public boolean isNumberInArray(int number, int [] array) {
        for (int temp : array){
            if (temp == number){
                return true;
            }
        }
        return false;
    }
    public  int numberCountInArray(int number, int[] array) {
        int count = 0;
        for (int temp : array){
            if (temp == number){
                count++;
            }
        }
        return count;
    }
    public void fillArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            arr[i] = 9;
        }
    }

}



