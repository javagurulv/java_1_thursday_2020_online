package student_igors_mihejevs.lesson2;

import java.util.Scanner;

public class HomeWork1Level1 {

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.print( "Enter first integer number: " );
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.print( "Enter second integer number: " );
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber * secondNumber;
        int result4 = firstNumber / secondNumber;

        // 4. print results to console
        System.out.println("----------------------------");
        System.out.println("Addition result       = " + result1);
        System.out.println("Subtraction result    = " + result2);
        System.out.println("Multiplication result = " + result3);
        System.out.println("Division result       = " + result4);
    }

}