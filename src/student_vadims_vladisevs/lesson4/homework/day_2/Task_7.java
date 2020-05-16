package student_vadims_vladisevs.lesson4.homework.day_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scr.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scr.nextInt();

        boolean isNumbersEquals = (firstNumber == secondNumber);
        String numbersAreEquals = "Numbers are equals";
        String numbersAreDifferent = "Numbers are different";

        String result = isNumbersEquals ? numbersAreEquals : numbersAreDifferent;

        System.out.println(result);
    }
}
