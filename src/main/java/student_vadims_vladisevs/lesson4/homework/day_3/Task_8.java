package student_vadims_vladisevs.lesson4.homework.day_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scr.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scr.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scr.nextInt();

        boolean firstNumberEqualsSecondNumber = (firstNumber == secondNumber);
        boolean firstNumberEqualsThirdNumber = (firstNumber == thirdNumber);
        boolean secondNumberEqualsThirdNumber = (secondNumber == thirdNumber);

        if (firstNumberEqualsSecondNumber && secondNumberEqualsThirdNumber){
            System.out.println("All numbers are equal");
        }
        else if (!secondNumberEqualsThirdNumber && !firstNumberEqualsSecondNumber && !firstNumberEqualsThirdNumber){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }

    }
}
