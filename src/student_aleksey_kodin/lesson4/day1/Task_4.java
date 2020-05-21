package student_aleksey_kodin.lesson4.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            if (firstValue % 2 == 0) {
                System.out.println("This number is even.");
            } else {
                System.out.println("This number is odd.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
