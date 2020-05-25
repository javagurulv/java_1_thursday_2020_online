package student_dmitrijs_visuns.homeworks.lesson_5.day_4;

/* Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль. */

import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = random.nextInt(10);

        int[] array = new int[arrayLength];

        for (int inputCount = 1; inputCount <= arrayLength; inputCount++) {
            int randomNumber = random.nextInt(100);
            array[inputCount - 1] = randomNumber;
        }

        System.out.println("Array length is " + arrayLength);



        for (int inputCount = 1; inputCount <= arrayLength; inputCount++) {
            System.out.println("Array integer # " + inputCount + " is " + array[inputCount - 1]);
        }


        int arrayMinimalValue = array[0];

        for (int inputCount = 1; inputCount <= arrayLength; inputCount++) {

            if (array[inputCount - 1] < arrayMinimalValue) {
                arrayMinimalValue = array[inputCount - 1];
            }
        }

        System.out.println("Array minimal value is " + arrayMinimalValue);
    }

}
