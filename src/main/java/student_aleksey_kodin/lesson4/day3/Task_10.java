package student_aleksey_kodin.lesson4.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int secondValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter third int value: ");
            int thirdValue = new Scanner(System.in).nextInt();

            int maxValueLibMath = Math.max(Math.max(firstValue,secondValue),thirdValue);
            System.out.println("If use Java Math method:");
            System.out.println("Max value is - " + maxValueLibMath);

            int maxValue;
            if ((firstValue > secondValue) && (firstValue > thirdValue)) {
                    maxValue = firstValue;
            } else maxValue = Math.max(secondValue, thirdValue);
            System.out.println("If use 'if' operator:");
            System.out.println("Max value is - " + maxValue);

        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
