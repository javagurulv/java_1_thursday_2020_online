package student_igors_mihejevs.lesson_2.homework.level_3;

// It's a Java program that takes a number as input and prints its
// multiplication table up to 10.

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input a number : ");
        int firstNumber = myInput.nextInt();

        System.out.println("\nThe multiplication table\nof number " + firstNumber + " from 1 to 10");
        System.out.println("------------------------");

        int secondNumber; // переменную объявляйте там где вы ее первый раз используете
        for(secondNumber = 1; secondNumber <= 10; secondNumber++) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        }
    }
}
