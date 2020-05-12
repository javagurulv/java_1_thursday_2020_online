package student_oleg_ivanov.lesson1;

import java.util.Scanner;

class AddTwoNumbers {

    public static void main(String[] args) {
        // 1. get first number from user
        System.out.println("Enter firs number");
        Scanner myInput = new Scanner(System.in);
        int firsNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int result = firsNumber +secondNumber;

        // 4. print result to console
        System.out.println("Result = " + result);

    }
}
