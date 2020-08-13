package student_igors_mihejevs.lesson_2.homework.level_1;

import java.util.Scanner;

class MathOperationsDemoInt {

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.print( "Enter first integer number  : " );
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.print( "Enter second integer number : " );
        int secondNumber = myInput.nextInt();

        // 3. first number +, -, *, / second number
        int resultAddition = firstNumber + secondNumber;
        int resultSubtraction = firstNumber - secondNumber;
        int resultMultiplication = firstNumber * secondNumber;
        int resultDivision = firstNumber / secondNumber;

        // 4. print results to console
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Results of some math operations between the first and the second integer numbers");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Addition result       = " + resultAddition);
        System.out.println("Subtraction result    = " + resultSubtraction);
        System.out.println("Multiplication result = " + resultMultiplication);
        System.out.println("Division result       = " + resultDivision);
    }

}