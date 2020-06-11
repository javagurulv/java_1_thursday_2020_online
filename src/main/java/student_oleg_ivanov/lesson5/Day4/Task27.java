package student_oleg_ivanov.lesson5.Day4;

import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] arrayNumbers = new int[15];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = randomNumbers.nextInt(50);
            System.out.println("Array number " + i + " is random number " + arrayNumbers[i]);
        }
        int maxNumber = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNumber) {
                maxNumber = arrayNumbers[i];
            }
        } System.out.println("Random max number = " + maxNumber);
    }
}
//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведети его на консоль.
