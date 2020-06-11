package student_vadims_vladisevs.lesson2.homework.level1;
import java.util.*;

class IntegerSimpleMathOperations {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = scr.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = scr.nextInt();

        int addResult = firstNumber + secondNumber;
        System.out.println("Addition result : " + addResult);

        int subResult = firstNumber - secondNumber;
        System.out.println("Subtraction result : " + subResult);

        int divResult = firstNumber / secondNumber;
        System.out.println("Division result : " + divResult);

        int multiResult = firstNumber * secondNumber;
        System.out.println("Multiplication result : " + multiResult);
    }
}
