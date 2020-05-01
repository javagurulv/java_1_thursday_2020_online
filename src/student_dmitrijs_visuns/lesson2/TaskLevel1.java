package student_dmitrijs_visuns.lesson2;

import java.util.Scanner;

public class TaskLevel1 {

        public static void main(String[] args) {
            System.out.println("Введите первое целое число");
            Scanner myFirstInput = new Scanner( System.in );
            int firstNumber = myFirstInput.nextInt();
            System.out.println("Введите второе целое число");
            Scanner mySecondInput = new Scanner( System.in );
            int secondNumber = mySecondInput.nextInt();
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



