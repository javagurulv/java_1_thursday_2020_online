package student_dmitrijs_visuns.homeworks.lesson_2.day_3;
// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        System.out.print("Введите число: ");

        Scanner inputNumber = new Scanner(System.in);
        int yourNumber = inputNumber.nextInt();

        for (int i=0; i< 10; i++) {
            System.out.println(yourNumber + " x " + (i+1) + " = " + (yourNumber * (i+1)));
        }
    }

}
