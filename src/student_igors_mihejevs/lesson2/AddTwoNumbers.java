package student_igors_mihejevs.lesson2;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter first integer: " );
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.print( "Enter second integer: " );
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int result = firstNumber + secondNumber;

        // 4. print result to console
        System.out.println("Result = " + result);
    }

}
