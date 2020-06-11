package student_diana_miranovica.lesson2.day_3;

import java.util.Scanner;

 class AverageOfTheNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number :");
        int secondNum = scanner.nextInt();

        System.out.println("Enter third number :");
        int thirdNum = scanner.nextInt();

        int average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("Your average of the numbers is : " + average);
    }
}
