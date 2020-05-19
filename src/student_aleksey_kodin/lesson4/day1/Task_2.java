package student_aleksey_kodin.lesson4.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            if (firstValue == 0) {
                System.out.println("The number equals zero");
            } else if (firstValue > 0) {
                System.out.println(firstValue + " is positive value");
            } else {
                System.out.println(firstValue + " is negative value");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
