package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("These numbers are equal");
        } else {
            System.out.println("These numbers are not equal");
        }
    }
}