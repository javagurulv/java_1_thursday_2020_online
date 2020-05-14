package student_igors_mihejevs.lesson_4.day_3;

// Without equal numbers

import java.util.Scanner;

public class Task_10_1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input first number : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input second number : ");
        int secondNumber = myInput.nextInt();
        System.out.print("Input third number : ");
        int thirdNumber = myInput.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The largest number is first number and = " + firstNumber);
        }
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The largest number is second number and = " + secondNumber);
        }
        else System.out.println("The largest number is third number and = " + thirdNumber);

    }

}