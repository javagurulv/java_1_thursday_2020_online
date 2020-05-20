package student_dmitrijs_visuns.homeworks.lesson_4.day_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {


    Scanner yourNumber = new Scanner(System.in);

        System.out.println("Введите целое число");
        int inputNumber = yourNumber.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println ("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }

    }
}