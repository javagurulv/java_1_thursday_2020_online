package student_igors_mihejevs.w3resource.basic_exercises_part1;

import java.util.Scanner;

// Division of two numbers with console inputs

public class Exercise3WithInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input the first number  : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = myInput.nextInt();
        System.out.println("-------------------------");
        System.out.println("The division of two natural numbers = " + (firstNumber / secondNumber));
    }
}