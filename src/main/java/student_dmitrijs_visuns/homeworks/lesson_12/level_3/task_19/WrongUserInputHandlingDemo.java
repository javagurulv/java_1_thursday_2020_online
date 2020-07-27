package student_dmitrijs_visuns.homeworks.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        System.out.println("Enter whole number:");

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                sc.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Please enter WHOLE NUMBER!");
            }
        }


    }

}
