package student_dmitrijs_visuns.homeworks.lesson_5.day_4;

/* Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль. */

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            int randomNumber = random.nextInt(100);
            array[inputCount - 1] = randomNumber;
        }

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            System.out.println("Array integer # " + inputCount + " is " + array[inputCount - 1]);
        }


        int arrayMaxValue = array[0];
		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {

            if (array[inputCount - 1] > arrayMaxValue) {
                arrayMaxValue = array[inputCount - 1];
            }
        }

        System.out.println("Array max number is " + arrayMaxValue);
    }

}
