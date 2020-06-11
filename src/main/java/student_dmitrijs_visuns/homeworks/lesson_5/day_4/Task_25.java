package student_dmitrijs_visuns.homeworks.lesson_5.day_4;

/* Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива. */

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

		// обычно переменные цикла называют: i, j, ...
        for (int inputCount = 1; inputCount <= arrayLength; inputCount++) {
            System.out.println("Enter array integer # " + inputCount);
            int arrayNumber = sc.nextInt();
            array[inputCount - 1] = arrayNumber;
        }

        for (int inputCount = 1; inputCount <= arrayLength; inputCount++) {
            System.out.println("Array integer # " + inputCount + " is " + array[inputCount - 1]);
        }

    }


}
