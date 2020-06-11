package student_alexander_bogachenkov.lesson2_30042020.lesson_code;

import java.util.Scanner;

class AddTwoNumbers {

    public static void main(String[] args) {

        // 1. get first number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        // 3. first number + second number
        int result = firstNumber + secondNumber;

        // 4. print result to console
        System.out.println("Your result is " + result);
    }
}
