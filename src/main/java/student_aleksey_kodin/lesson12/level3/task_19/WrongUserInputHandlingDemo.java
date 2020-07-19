package student_aleksey_kodin.lesson12.level3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        System.out.println("Enter digit: ");
        while (true) {
            try {
                int input = new Scanner(System.in).nextInt();
                System.out.println("You enter " + input);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.toString());
                System.out.println("Enter digit again");
            }
        }
    }
}
