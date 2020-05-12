package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_1;

import java.util.Scanner;

class Task_1_01052020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}
