package student_dmitrijs_visuns.homeworks.lesson_4.day_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Enter second number");
        int secondNumber = inputNumber.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = inputNumber.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println ("All numbers are equal");
        } else if ((firstNumber != secondNumber) && (secondNumber != thirdNumber)) {
            System.out.println ("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

}
