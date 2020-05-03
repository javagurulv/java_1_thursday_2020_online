package student_igors_mihejevs.lesson2.homeworks.day_3;

// It's a Java program that takes a number as input and prints its
// multiplication table up to 10.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int secondNumber;

        System.out.print("Input a number : ");
        int firstNumber = myInput.nextInt();

        System.out.println("\nThe multiplication table\nof number " + firstNumber + " from 1 to 10");
        System.out.println("------------------------");

        for(secondNumber = 1; secondNumber <= 10; secondNumber++) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

        }
    }
}
