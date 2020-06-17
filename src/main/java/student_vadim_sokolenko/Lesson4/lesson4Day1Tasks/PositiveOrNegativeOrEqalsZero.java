package student_vadim_sokolenko.Lesson4.lesson4Day1Tasks;

import java.util.Scanner;

class PositiveOrNegativeOrEqalsZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first positive, negative or zero number");
        int firstNumber = scanner.nextInt();


        if (firstNumber > 0) {
            System.out.println("Number is positive");
        } else if (firstNumber == 0) {

            System.out.println("Number is Zero");
        }else {
            System.out.println("Number is negative");


        }
        System.out.println("Please enter second positive, negative or zero number");
        int secondNumber = scanner.nextInt();

        if (secondNumber > 0) {
            System.out.println("Number is positive");
        } else if (secondNumber == 0) {
            System.out.println("Number is Zero");
        }else  {
            System.out.println("Number is negative");


        }
    }
}
