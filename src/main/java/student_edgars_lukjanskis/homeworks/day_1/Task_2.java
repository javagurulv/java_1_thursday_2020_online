package student_edgars_lukjanskis.homeworks.day_1;

import java.util.Scanner;

class Task_2 { // название класса с заглавной буквы!

    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number: " );
        double firstNumber = myInput.nextDouble();


        System.out.println("Enter second number: ");
            double secondNumber = myInput.nextDouble();


            double result = firstNumber + secondNumber;
                System.out.println("Sum result " + result);
            double result1 = firstNumber - secondNumber;
                System.out.println("Subtract result " + result1);
            double result2 = firstNumber / secondNumber;
                System.out.println("Division result " + result2);
            double result3 = firstNumber * secondNumber;
                System.out.println("Multiply result " + result3);

    }
}