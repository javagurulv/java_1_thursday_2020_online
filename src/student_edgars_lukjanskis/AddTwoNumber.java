package student_edgars_lukjanskis;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number: " );
        int firstNumber = myInput.nextInt();


        // 2. get second number from user
        System.out.println("Enter second number: ");
        int secondNumber = myInput.nextInt();

       // 3. first number + second number
        int result = firstNumber + secondNumber;

        // 4. print result to console
        System.out.println("Result = " + result);
    }
}
