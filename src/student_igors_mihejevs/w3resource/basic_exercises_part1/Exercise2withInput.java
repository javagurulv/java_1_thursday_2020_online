package student_igors_mihejevs.w3resource.basic_exercises_part1;

import java.util.Scanner;

// Sum of two numbers with console inputs

public class Exercise2withInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input the first number  : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = myInput.nextInt();
        int resultOfSum = firstNumber + secondNumber;
        System.out.println("------------------------");
        System.out.println("Sum: " + resultOfSum);
    }
}