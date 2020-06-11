package student_aleksey_kodin.lesson4.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int secondValue = new Scanner(System.in).nextInt();

            System.out.println("If use ternary operator:");
            String equal = (firstValue == secondValue) ? "Numbers are equals" : "Numbers are different";
            System.out.println(equal);

            System.out.println("If use 'if' operator:");
            if (firstValue != secondValue) {
                System.out.println("Numbers are different");
            } else {
                System.out.println("Numbers are equals");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
