package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_3;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNum = scanner.nextInt();
        System.out.println("The average of all these numbers is " + ((firstNum + secondNum + thirdNum) / 3));
    }
}