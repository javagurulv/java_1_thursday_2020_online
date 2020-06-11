package student_dmitrijs_visuns.homeworks.lesson_5.day_2;

/* Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль. */

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whole number: ");

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        int[] inputNumbers = {firstNumber, secondNumber, thirdNumber};

        System.out.println(inputNumbers[0]);
        System.out.println(inputNumbers[1]);
        System.out.println(inputNumbers[2]);


    }

}
