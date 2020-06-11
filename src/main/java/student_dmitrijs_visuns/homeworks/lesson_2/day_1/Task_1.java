package student_dmitrijs_visuns.homeworks.lesson_2.day_1;

import java.util.Scanner;

class Task_1 {

        public static void main(String[] args) {

            System.out.println("Введите первое целое число: ");
            Scanner myInput = new Scanner( System.in );
            int firstNumber = myInput.nextInt();

            System.out.println("Введите второе целое число: ");
            // Scanner mySecondInput = Scanner( System.in ); // два раза создавать объект Scanner не имеет смысла, можно пользоваться первым
            int secondNumber = myInput.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("Сумма этих чисел равна " + sum);

            int subtract = firstNumber - secondNumber;
            System.out.println("Результат вычитания этих чисел равен " + subtract);

            int multiply = firstNumber * secondNumber;
            System.out.println("Результат умножения этих этих чисел равен " + multiply);

            int divide = firstNumber / secondNumber;
            System.out.println("Результат деления этих этих чисел равен " + divide);

        }
}



