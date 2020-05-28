package student_alexander_bogachenkov.lesson6_28052020.lesson_code;

import java.util.Scanner;

class BreakExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Infinite loop!");
            System.out.println("Enter magic number: ");
            int userNumber = scanner.nextInt();

            if (userNumber == 5) {
                break;
            }
        }
        System.out.println("End!");
    }
}
