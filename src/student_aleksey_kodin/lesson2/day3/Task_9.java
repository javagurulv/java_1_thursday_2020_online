package student_aleksey_kodin.lesson2.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        try {
            System.out.println("Please enter number: ");
            int iNumber = new Scanner(System.in).nextInt();

            for (byte byteCount = 1; byteCount <=10; byteCount++) {
                System.out.println(iNumber + " x " + byteCount + " = " + (iNumber * byteCount));
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
