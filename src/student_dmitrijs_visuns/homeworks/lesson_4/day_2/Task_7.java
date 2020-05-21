package student_dmitrijs_visuns.homeworks.lesson_4.day_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Enter second number");
        int secondNumber = inputNumber.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println ("Numbers are equals");
        } else {
            System.out.println ("Numbers are different");
        }

    }

}
