package student_vadims_vladisevs.lesson4.homework.day_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scr.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scr.nextInt();

        boolean isFirstNumberGreaterThanSecond = (firstNumber > secondNumber);

        int result = isFirstNumberGreaterThanSecond ? firstNumber : secondNumber;

        System.out.println("Greater number is: " + result);
    }
}
