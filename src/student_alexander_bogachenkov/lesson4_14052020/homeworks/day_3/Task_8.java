package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = scanner.nextInt();

        if ((secondNum == thirdNum) && (firstNum == thirdNum)) {
            System.out.println("All numbers are equal");
        } else if ((secondNum != thirdNum) && (firstNum != thirdNum) && (firstNum != secondNum)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
