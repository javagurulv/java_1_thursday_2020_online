package student_dmitrijs_visuns.homeworks.lesson_2.day_1;

import java.util.Scanner;

class Task_2 {

        public static void main(String[] args) {

            System.out.println("Введите первое вещественное число: ");
            Scanner myFirstInput = new Scanner( System.in );
            double firstNumber = myFirstInput.nextDouble();

            System.out.println("Введите второе вещественное число: ");
            Scanner mySecondInput = new Scanner( System.in );
            double secondNumber = mySecondInput.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("Сумма этих чисел равна " + sum);

            double subtract = firstNumber - secondNumber;
            System.out.println("Результат вычитания этих чисел равен " + subtract);

            double multiply = firstNumber * secondNumber;
            System.out.println("Результат умножения этих этих чисел равен " + multiply);

            double divide = firstNumber / secondNumber;
            System.out.println("Результат деления этих этих чисел равен " + divide);

        }
}



