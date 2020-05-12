package student_vadims_vladisevs.lesson2.homework.day_3;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number :");
        double firstNumber = scr.nextDouble();

        System.out.println("Enter second number :");
        double secondNumber = scr.nextDouble();

        System.out.println("Enter third number :");
        double thirdNumber = scr.nextDouble();

        double result = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average of the numbers : " + result);

    }
}
