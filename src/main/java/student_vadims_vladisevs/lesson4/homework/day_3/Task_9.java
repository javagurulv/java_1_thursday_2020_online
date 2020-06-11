package student_vadims_vladisevs.lesson4.homework.day_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scr.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scr.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scr.nextInt();

        boolean firstNumberIsGreaterThanSecondNumber = (firstNumber > secondNumber);
        boolean secondNumberIsGreaterThanThirdNumber = (secondNumber > thirdNumber);

        if (!firstNumberIsGreaterThanSecondNumber && !secondNumberIsGreaterThanThirdNumber){
            System.out.println("increasing");
        }
        else if (firstNumberIsGreaterThanSecondNumber && secondNumberIsGreaterThanThirdNumber){
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
