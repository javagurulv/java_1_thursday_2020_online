package student_igors_mihejevs.lesson2.homeworks.additional_exercises;

import java.util.Scanner;

// Sum of two numbers with console inputs

public class Exercise2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input the first number  : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = myInput.nextInt();
        System.out.println("-------------------------");
        System.out.println("Sum: " + (firstNumber + secondNumber));
    }
}