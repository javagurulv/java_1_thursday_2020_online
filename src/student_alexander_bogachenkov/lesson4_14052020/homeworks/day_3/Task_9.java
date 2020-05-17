package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = scanner.nextInt();

        if ((firstNum < secondNum) && (secondNum < thirdNum)) {
            System.out.println("increasing");
        } else if ((firstNum > secondNum) && (secondNum > thirdNum)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}