package student_aleksey_kodin.lesson2.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int iFirstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int iSecondValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter third int value: ");
            int iThirdValue = new Scanner(System.in).nextInt();

            System.out.println("Average is = "  + (iFirstValue * iSecondValue * iThirdValue / 3));

        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
