package student_igors_mihejevs.lesson_2.homework.level_3;

// This is a Java program that takes three numbers as input
// to calculate and print the average of the numbers

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter first Number  : ");
        double firstNumber = myInput.nextDouble();
        System.out.print("Enter second Number : ");
        double secondNumber = myInput.nextDouble();
        System.out.print("Enter third Number  : ");
        double thirdNumber = myInput.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("-------------------------------");
        System.out.println("The average of the numbers = " + average);
    }
}
