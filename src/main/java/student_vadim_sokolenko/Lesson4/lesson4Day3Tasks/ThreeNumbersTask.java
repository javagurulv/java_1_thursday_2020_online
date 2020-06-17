package student_vadim_sokolenko.Lesson4.lesson4Day3Tasks;

import java.util.Scanner;

class ThreeNumbersTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();

        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");

        }
    }
}