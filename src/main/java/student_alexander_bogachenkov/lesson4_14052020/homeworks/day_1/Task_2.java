package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 0) {
            System.out.println("Your number is NEGATIVE");
        } else if (userNumber > 0) {
            System.out.println("Your number is POSITIVE");
        } else {
            System.out.println("Your number is ZERO");
        }
    }
}
