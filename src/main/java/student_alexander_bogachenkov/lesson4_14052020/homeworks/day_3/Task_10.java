package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = scanner.nextInt();

        System.out.println("The biggest number is " + maxNum(firstNum, secondNum, thirdNum));
    }

    public static int maxNum(int firstNum, int secondNum, int thirdNum) {
        return Math.max(Math.max(firstNum, secondNum), thirdNum);
    }

}
