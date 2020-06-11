package student_aleksey_kodin.lesson4.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int secondValue = new Scanner(System.in).nextInt();

            int maxValueLibMath = Math.max(firstValue, secondValue);
            System.out.println("Max value if use Java Math method - " + maxValueLibMath);

            int maxValue = (firstValue > secondValue) ? firstValue : secondValue;
            System.out.println("Max value if use ternary operator - " + maxValue);

            if (firstValue > secondValue) {
                    System.out.println("Max value 'if' use if operator - " + firstValue);
                }
                else {
                    System.out.println("Max value if use 'if' operator - " + secondValue);
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter Int value and try again");
                System.exit(-1);
            }
    }
}
