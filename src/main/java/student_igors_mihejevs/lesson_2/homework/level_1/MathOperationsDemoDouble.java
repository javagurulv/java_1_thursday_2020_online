package student_igors_mihejevs.lesson_2.homework.level_1;

import java.util.Scanner;
import java.text.DecimalFormat;

class MathOperationsDemoDouble {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter first floating point number  : ");
        double firstNumber = myInput.nextDouble();

        // 2. get second number from user
        System.out.print("Enter second floating point number : ");
        double secondNumber = myInput.nextDouble();

        // 3. first number +, -, *, / second number
        double resultAddition = firstNumber + secondNumber;
        double resultSubtraction = firstNumber - secondNumber;
        double resultMultiplication = firstNumber * secondNumber;
        double resultDivision = firstNumber / secondNumber;

        // 4. print results to console
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Results of some math operations between the first and the second floating point numbers");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Addition result       = " + df.format(resultAddition));
        System.out.println("Subtraction result    = " + df.format(resultSubtraction));
        System.out.println("Multiplication result = " + df.format(resultMultiplication));
        System.out.println("Division result       = " + df.format(resultDivision));
    }
}

