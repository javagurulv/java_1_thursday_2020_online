package student_alexander_bogachenkov.lesson6_28052020.lesson_code;

import java.util.Scanner;

class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        while (userNumber != 0) {
            System.out.println("Your number is " + userNumber);
            userNumber = scanner.nextInt();
        }
        System.out.println("End!");
    }
}
