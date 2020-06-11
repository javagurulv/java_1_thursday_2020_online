package student_oleg_ivanov.lesson2.homeWork.day1;

import java.util.Scanner;

class Level2 {
    public static void main(String[] args) {
        //1. get first number from user
        System.out.println("Enter first fractional number");
        Scanner myInput = new Scanner(System.in);
        double firstNumber = myInput.nextDouble();

        //2. ger second number from user
        System.out.println("Enter second fractional number");
        double secondNumber = myInput.nextDouble();

        //3. first number + second number
        double result1 = firstNumber + secondNumber;
        double result2 = firstNumber - secondNumber;
        double result3 = firstNumber * secondNumber;
        double result4 = firstNumber / secondNumber;

        // 4 print result to console
        System.out.println("Result = " + result1);
        System.out.println("Result = " + result2);
        System.out.println("Result = " + result3);
        System.out.println("Result = " + result4);

    }
}

