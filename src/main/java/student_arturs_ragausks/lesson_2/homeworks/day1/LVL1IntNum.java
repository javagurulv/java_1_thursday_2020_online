package student_arturs_ragausks.lesson_2.homeworks.day1;

import java.util.Scanner;

class LVL1IntNum { // странное и не понятное название класса! Придумайте более лучшее название.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Add second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("addition: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("substraction: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("multiplication: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("division: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

    }

}
