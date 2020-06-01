package student_dmitrijs_visuns.homeworks.lesson_5.day_6;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }


    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }
    }



    public void printArrayToConsole(int[] array) {
        for (int i:array) {
            System.out.println(i);
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


    public int findMinNumber(int[] array) {
        int arrayMinValue = array[0];

        for (int i:array) {
            if (i < arrayMinValue) {
                arrayMinValue = i;
            }
        }
        return arrayMinValue;
    }



}
