package student_dmitrijs_visuns.homeworks.lesson_4.day_2;

import java.util.Scanner;

class Task_5 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Введите первое целое число");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Введите второе целое число");
        int secondNumber = inputNumber.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Введите РАЗНЫЕ числа!");
        } else {
            System.out.println(Math.max(firstNumber, secondNumber));
        }
    }
}
