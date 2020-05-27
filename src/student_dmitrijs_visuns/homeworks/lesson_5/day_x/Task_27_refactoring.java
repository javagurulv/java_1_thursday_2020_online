package student_dmitrijs_visuns.homeworks.lesson_5.day_x;

import java.util.Random;
import java.util.Scanner;

class Task_27_refactoring {

    Scanner sc = new Scanner(System.in);

    public int[] createArray() {
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        return new int[arrayLength];
    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i : array) {
            int randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }
    }


    public void printArrayIntegers(int[] array) {
        for (int i : array) {
            System.out.println(array[i]);
        }
    }


    public int findMaxNumber(int[] array) {
        int arrayMaxValue = array[0];

        for (int i:array) {
            if (i > arrayMaxValue) {
                arrayMaxValue = i;
            }
        }
        return arrayMaxValue;
    }
}
