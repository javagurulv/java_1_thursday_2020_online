package student_vadims_vladisevs.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Please enter number: ");
                Scanner scr = new Scanner(System.in);
                int number = scr.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It's not a number! Try again!");
            }
        }
    }
}


/*
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */