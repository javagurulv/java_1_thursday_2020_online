package student_aleksey_kodin.lesson2.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int iFirstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int iSecondValue = new Scanner(System.in).nextInt();

            System.out.println(iFirstValue + " + " + iSecondValue + " = " + (iFirstValue + iSecondValue));
            System.out.println(iFirstValue + " - " + iSecondValue + " = " + (iFirstValue - iSecondValue));
            System.out.println(iFirstValue + " * " + iSecondValue + " = " + (iFirstValue * iSecondValue));
            System.out.println(iFirstValue + " / " + iSecondValue + " = " + (iFirstValue / iSecondValue));

        } catch (ArithmeticException e) {
            System.out.println("You should not divide a number by zero");
            System.exit(-1);
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
