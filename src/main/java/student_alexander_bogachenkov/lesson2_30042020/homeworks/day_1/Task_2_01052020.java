package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_1;

import java.util.Scanner;

class Task_2_01052020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещественное (дробное) число:");
        float firstNumber = scanner.nextFloat();
        System.out.println("Введите второе вещественное (дробное) число:");
        float secondNumber = scanner.nextFloat();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

    }
}