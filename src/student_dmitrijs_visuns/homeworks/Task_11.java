package student_dmitrijs_visuns.homeworks;
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        Scanner myFirstInput = new Scanner( System.in );
        double firstNumber = myFirstInput.nextDouble();

        System.out.println("Введите второе число: ");
        Scanner mySecondInput = new Scanner( System.in );
        double secondNumber = mySecondInput.nextDouble();

        System.out.println("Введите третье число: ");
        Scanner myThirdInput = new Scanner( System.in );
        double thirdNumber = mySecondInput.nextDouble();

        double averageResult = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Среднее арифметическое этих трех чисел равно " + averageResult);

    }

}