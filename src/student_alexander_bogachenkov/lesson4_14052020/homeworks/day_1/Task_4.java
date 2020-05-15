package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive number:");
        int userNumber = scanner.nextInt();
        int residue = userNumber % 2;

        if (residue == 0) {
            System.out.println("Your number is even number");
        } else if (residue == 1) {
            System.out.println("Your number is odd number");
        } else {
            System.out.println("Your number isn`t positive");
        }
    }
}
