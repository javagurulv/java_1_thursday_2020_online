package student_igors_mihejevs.lesson_2.homeworks.day_5;

// This is a Java program that takes three numbers as input
// to calculate and print the average of the numbers

// Input of all numbers is used without skip to the next line using System.out.print

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double average;

        System.out.print("Enter first Number  : ");
        double firstNumber = myInput.nextDouble();
        System.out.print("Enter second Number : ");
        double secondNumber = myInput.nextDouble();
        System.out.print("Enter third Number  : ");
        double thirdNumber = myInput.nextDouble();

        average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("-------------------------------");
        System.out.println("The average of the numbers = " + average);

    }
}
