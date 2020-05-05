package student_igors_mihejevs.lesson2.homeworks.day_3;

// This is a Java program that takes three numbers as input
// to calculate and print the average of the numbers

import java.util.Scanner;

public class Task_11 {
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
