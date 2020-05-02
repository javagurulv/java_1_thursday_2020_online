package student_oleg_ivanov.lesson2.homeWork.Day1;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        //1. get first number from user
        System.out.println("Enter first number");
        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        //2. ger second number from user
        System.out.println("Enter second number");
        int secondNumber = myInput.nextInt();

        //3. first number + second number
        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber * secondNumber;
        int result4 = firstNumber / secondNumber;

        // 4 print result to console
        System.out.println("Result = " + result1);
        System.out.println("Result = " + result2);
        System.out.println("Result = " + result3);
        System.out.println("Result = " + result4);

    }
}
