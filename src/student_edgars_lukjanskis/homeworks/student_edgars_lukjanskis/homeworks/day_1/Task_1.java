package student_edgars_lukjanskis.homeworks.day_1;

import java.util.Scanner;

class Task_1 { // название класса с заглавной буквы!

    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
            System.out.println("Enter first number: " );
                int firstNumber = myInput.nextInt();


        System.out.println("Enter second number: ");
            int secondNumber = myInput.nextInt();


            int result = firstNumber + secondNumber;
                System.out.println("Sum result " + result);
            int result1 = firstNumber - secondNumber;
                System.out.println("Subtract result " + result1);
            int result2 = firstNumber / secondNumber;
                System.out.println("Division result " + result2);
            int result3 = firstNumber * secondNumber;
                System.out.println("Multiply result " + result3);

    }
}
