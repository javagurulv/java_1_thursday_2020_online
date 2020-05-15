package student_vadims_vladisevs.lesson4.homework.day_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scr.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scr.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scr.nextInt();

        boolean firstNumberIsGreaterThanSecondNumber = (firstNumber > secondNumber);
        boolean firstNumberIsGreaterThanThirdNumber = (firstNumber > thirdNumber);
        boolean secondNumberIsGreaterThanThirdNumber = (secondNumber > thirdNumber);

        if ((firstNumberIsGreaterThanSecondNumber) && (firstNumberIsGreaterThanThirdNumber)) {
            System.out.println(firstNumber + " is greatest number");
        }
        else if (!firstNumberIsGreaterThanSecondNumber && secondNumberIsGreaterThanThirdNumber){
            System.out.println(secondNumber + " is greatest number");
        }
        else {
            System.out.println(thirdNumber + " is greatest number");
        }
    }
}
