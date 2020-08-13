package student_igors_mihejevs.lesson_4.homework.level_3;

// With testing equal numbers

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input first number : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input second number : ");
        int secondNumber = myInput.nextInt();
        System.out.print("Input third number : ");
        int thirdNumber = myInput.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println("All numbers are equals and = " + firstNumber);
        }
        else if (firstNumber == secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("First number are equal to second number and more than third number\n" +
                                   "The largest numbers are first and second and = " + firstNumber);
            }
            else System.out.println("First number are equal to second number and less than third number\n" +
                                    "The largest number is third and = " + thirdNumber);
        }
        else if (firstNumber == thirdNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("First number are equal to third number and more than second number\n" +
                                   "The largest numbers are first and third and = " + firstNumber);
            }
            else System.out.println("First number are equal to third number and less than second number\n" +
                    "The largest number is second and = " + secondNumber);
        }
        else if (secondNumber == thirdNumber) {
            if (secondNumber > firstNumber) {
                System.out.println("Second number are equal to third number and more than first number\n" +
                        "The largest numbers are second and third and = " + secondNumber);
            }
            else System.out.println("Second number are equal to third number and less than first number\n" +
                    "The largest number is first and = " + firstNumber);
        }
        else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The largest number is first and = " + firstNumber);
        }
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The largest number is second and = " + secondNumber);
        }
        else System.out.println("The largest number is third and = " + thirdNumber);
    }

}