package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                scanner.nextInt();
                System.out.println("Thanks!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("You`ve entered a String, please enter a number: ");
            }
        }
    }
}
